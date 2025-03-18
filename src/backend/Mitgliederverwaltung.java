package backend;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Mitgliederverwaltung {
    private final String JSONPFAD;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
    private List<Mitglied> mitglieder;

    public Mitgliederverwaltung(String jsonpfad) {
        JSONPFAD = jsonpfad;
        mitglieder = ladeMitglieder();
    }

    private List<Mitglied> ladeMitglieder() {
        ArrayList<Mitglied> mitglieder = new ArrayList<>();
        try {
            File json_mitglieder = new File(JSONPFAD);
            Scanner sc = new Scanner(json_mitglieder);
            StringBuilder json = new StringBuilder();

            while(sc.hasNextLine()) {
                json.append(sc.nextLine());
            }

            JSONObject obj = new JSONObject(json.toString());
            JSONArray mitgliederJSON = obj.getJSONArray("mitglieder");

            for(int i = 0; i < mitgliederJSON.length(); ++i) {
                JSONObject m = mitgliederJSON.getJSONObject(i);

                Mitglied mit = new Mitglied(
                        m.getString("mitgliedsnummer"),
                        JSONMapper.parseMitgliedsstatus(m.getJSONObject("status")),
                        JSONMapper.parseAltersklasse(m.getJSONObject("altersklasse")),
                        JSONMapper.parseMitgliederantrag(m.getJSONObject("mitgliederantrag")),
                        null,
                        JSONMapper.parseAbonnements(m.getJSONArray("abonnements")),
                        JSONMapper.parseRechnungen(m.getJSONArray("rechnungen")),
                        m.getString("name"),
                        m.getString("geburtsdatum")
                );

                try {
                    mit.setKuendigung(JSONMapper.parseKuendigung(m.getJSONObject("kuendigung")));
                }catch (JSONException e){
                    System.out.println("Keine Kuendigung gefunden");
                }

                mitglieder.add(mit);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        return mitglieder;
    }

    public void fuegeMitgliedHinzu(Mitgliedsstatus mitgliedsstatus, Altersklasse altersklasse, Kuendigung kuendigung,
                                          List<Abonnement> abonnements, ArrayList<Rechnung> rechnungen, String name, String geburtstag){
        var mitgliedsNummer = UUID.randomUUID().toString();
        var mitgliedsAntragsNummer = UUID.randomUUID().toString();

        var antrag = new Mitgliederantrag(mitgliedsAntragsNummer, name, geburtstag, mitgliedsstatus, LocalDate.now().toString(),
                mitgliedsNummer, "Mitgliederantrag");

        var mitglied = new Mitglied(mitgliedsNummer, mitgliedsstatus, altersklasse, antrag, null,
                abonnements, rechnungen, name, geburtstag);

        mitglieder.add(mitglied);

        speichereDaten();
    }

    public void entferneMitglied(String mitgliedsNummer) {
        mitglieder.removeIf(m -> m.getMitgliedsnummer().equals(mitgliedsNummer));
        speichereDaten();
    }

    public void speichereDaten() {
        File json_mitglieder = new File(JSONPFAD);
        JSONArray arr = new JSONArray(mitglieder);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(json_mitglieder, false));
            bw.write('{');
            bw.newLine();
            bw.write("\"mitglieder\": ");
            bw.write(arr.toString());
            bw.newLine();
            bw.write('}');
            bw.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void erstelleRechnung(Mitglied mitglied, double rechnungsBetrag) {
        UUID rechnungsnummer = UUID.randomUUID();
        Rechnung rechnung = new Rechnung(
                mitglied.getMitgliedsnummer(),
                rechnungsnummer.toString(),
                rechnungsBetrag,
                LocalDate.now().format(this.formatter).toString(),
                "Rechnung"
        );
        List<Rechnung> mitgliederRechnungen = mitglied.getRechnungen();
        mitgliederRechnungen.add(rechnung);
        mitglied.setRechnungen(mitgliederRechnungen);
    }

    public void erstelleKuendigung(Mitglied mitglied) {
        UUID kuendigungsNummer = UUID.randomUUID();
        Kuendigung kuendigung = new Kuendigung(
                mitglied.getMitgliedsnummer(),
                LocalDate.now().format(this.formatter),
                kuendigungsNummer.toString(),
                LocalDate.now().format(this.formatter),
                "Kuendigung"
        );
        mitglied.setKuendigung(kuendigung);
    }

    public List<Mitglied> getMitglieder() {
        return mitglieder;
    }
}
