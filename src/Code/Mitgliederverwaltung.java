package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Mitgliederverwaltung {
    private final String DATEIPFAD = "Code/Mitglieder.json";

    private List<Mitglied> mitglieder;

    public static void main(String[] args) {

    }

    public ArrayList<Mitglied> ladeMitglieder() {

        List<Abonnements> abos = new ArrayList<Abonnements>();
        abos.add(Abonnements.BAUCH_BEINE_PO);
        List<Rechnung> rechnung = new ArrayList<Rechnung>();
        var antrag = new Mitgliederantrag("Test", "Test", "Test", LocalDate.now(), Mitgliedsstatus.AKTIV,
                LocalDate.now(), "Test");
        var mitglied = new Mitglied("Test", Mitgliedsstatus.AKTIV, Altersklasse.ERWACHSEN,
                antrag, new Kuendigung("Test", LocalDate.now(), "123"),
                abos, rechnung, "Test", LocalDate.now());

        var mitglieder =  new ArrayList<Mitglied>();

        mitglieder.add(mitglied);

        return mitglieder;
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
}
