import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Mitgliederverwaltung {
    private ArrayList<Mitglied> mitglieder;

    public Mitgliederverwaltung(ArrayList<Mitglied> mitglieder) {
        this.mitglieder = mitglieder;
    }

    public ArrayList<Mitglied> getMitglieder() {
        return mitglieder;
    }

    public void setMitglieder(ArrayList<Mitglied> mitglieder) {
        this.mitglieder = mitglieder;
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
