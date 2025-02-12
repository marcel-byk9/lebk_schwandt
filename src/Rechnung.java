import java.time.LocalDate;

public class Rechnung extends Datei {
    private String mitgliedsnummer;
    private String rechnungsnummer;
    private LocalDate datum;
    private double betrag;

    public Rechnung(String mitgliedsnummer, String rechnungsnummer, LocalDate datum, double betrag) {
        this.mitgliedsnummer = mitgliedsnummer;
        this.rechnungsnummer = rechnungsnummer;
        this.datum = datum;
        this.betrag = betrag;
    }

    @Override
    public String toString() {
        return "Mitgliedsnummer: " + this.mitgliedsnummer
                + "\nRechnungsnummer: " + this.rechnungsnummer
                + "\nDatum: " + this.datum
                + "\nBetrag: " + this.betrag;
    }
}
