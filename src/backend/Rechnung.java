package backend;

public class Rechnung extends Datei {
    private String mitgliedsnummer;
    private String rechnungsnummer;
    private String datum;
    private double betrag;

    public Rechnung(String mitgliedsnummer, String rechnungsnummer, String datum, double betrag) {
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

    public String getMitgliedsnummer() {
        return this.mitgliedsnummer;
    }

    public void setMitgliedsnummer(String mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }

    public String getRechnungsnummer() {
        return this.rechnungsnummer;
    }

    public void setRechnungsnummer(String rechnungsnummer) {
        this.rechnungsnummer = rechnungsnummer;
    }

    public String getDatum() {
        return this.datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public double getBetrag() {
        return this.betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }
}
