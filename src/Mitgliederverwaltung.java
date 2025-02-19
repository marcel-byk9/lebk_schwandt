import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

public class Mitgliederverwaltung {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
    private static List<Mitglied> mitglieder;

    public Mitgliederverwaltung() {
    }

    public static void main(String[] args) {
        mitglieder = ladeMitglieder();
        System.out.println(mitglieder);
    }

    public static List<Mitglied> ladeMitglieder() {
        ArrayList<Mitglied> mitglieder = new ArrayList<>();

        try {
            File json_mitglieder = new File("C:\\Users\\marce\\IdeaProjects\\git\\lebk_schwandt\\src\\Mitglieder.json");
            Scanner sc = new Scanner(json_mitglieder);
            StringBuilder json = new StringBuilder();

            while(sc.hasNextLine()) {
                json.append(sc.nextLine());
            }

            JSONObject obj = new JSONObject(json.toString());
            JSONArray mitgliederJSON = obj.getJSONArray("mitglieder");

            for(int i = 0; i < mitgliederJSON.length(); ++i) {
                JSONObject m = mitgliederJSON.getJSONObject(i);
                mitglieder.add(new Mitglied(m.getString("nummer"), JSONMapper.parseMitgliedsstatus(m.getString("status")), JSONMapper.parseAltersklasse(m.getString("altersklasse")), JSONMapper.parseMitgliederantrag(m.getJSONObject("antrag")), JSONMapper.parseKuendigung(m.getJSONObject("kuendigung")), JSONMapper.parseAbonnements(m.getJSONArray("abonnements")), JSONMapper.parseRechnungen(m.getJSONArray("rechnungen")), m.getString("name"), m.getString("geburtstag")));
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }

        return mitglieder;
    }

    public void erstelleRechnung(Mitglied mitglied, double rechnungsBetrag) {
        UUID rechnungsnummer = UUID.randomUUID();
        Rechnung rechnung = new Rechnung(mitglied.getMitgliedsnummer(), rechnungsnummer.toString(), LocalDate.now().format(this.formatter), rechnungsBetrag);
        List<Rechnung> mitgliederRechnungen = mitglied.getRechnungen();
        mitgliederRechnungen.add(rechnung);
        mitglied.setRechnungen(mitgliederRechnungen);
    }

    public void erstelleKuendigung(Mitglied mitglied) {
        UUID kuendigungsNummer = UUID.randomUUID();
        Kuendigung kuendigung = new Kuendigung(mitglied.getMitgliedsnummer(), LocalDate.now().format(this.formatter), kuendigungsNummer.toString());
        mitglied.setKuendigung(kuendigung);
    }

    public void loescheMitglied(Mitglied mitglied) {
        mitglieder.remove(mitglied);
    }
}
