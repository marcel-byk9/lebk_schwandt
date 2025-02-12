import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Mitgliederverwaltung {
    private final String DATEIPFAD = "./Mitglieder.json";

    private List<Mitglied> mitglieder;

    public static void main(String[] args) {

    }

    public List<Mitglied> ladeMitglieder() {
        File json_mitglieder = new File(DATEIPFAD);
        ArrayList<Mitglied> mitglieder = new ArrayList<>();
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
