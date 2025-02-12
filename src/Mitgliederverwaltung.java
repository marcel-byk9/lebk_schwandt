import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import org.json.*;

public class Mitgliederverwaltung {
    private final String DATEIPFAD = "./Mitglieder.json";

    private List<Mitglied> mitglieder;

    public static void main(String[] args) {

    }

    public List<Mitglied> ladeMitglieder() {
        ArrayList<Mitglied> mitglieder = new ArrayList<>();
        try {
            File json_mitglieder = new File(DATEIPFAD);
            Scanner sc = new Scanner(json_mitglieder);
            StringBuilder json = new StringBuilder();
            while (sc.hasNextLine()) {
                json.append(sc.nextLine());
            }
            JSONObject obj = new JSONObject(json.toString());

        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
    }

    public void erstelleRechnung(Mitglied mitglied, double rechnungsBetrag){
        UUID rechnungsnummer = UUID.randomUUID();

        Rechnung rechnung = new Rechnung(mitglied.getMitgliedsnummer(), rechnungsnummer.toString(), LocalDate.now(),
                rechnungsBetrag);

        List<Rechnung> mitgliederRechnungen = mitglied.getRechnungen();
        mitgliederRechnungen.add(rechnung);
        mitglied.setRechnungen(mitgliederRechnungen);
    }

    public void erstelleKuendigung(Mitglied mitglied){
        UUID kuendigungsNummer = UUID.randomUUID();

        Kuendigung kuendigung = new Kuendigung(mitglied.getMitgliedsnummer(), LocalDate.now(), kuendigungsNummer.toString());

        mitglied.setKuendigung(kuendigung);
    }

    public void loescheMitglied(Mitglied mitglied){
        this.mitglieder.remove(mitglied);
    }
}
