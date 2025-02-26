package backend;

public class Rechnung extends Datei {
    private String mitgliedsnummer;
    private String rechnungsnummer;
    private double betrag;

    public Rechnung(String mitgliedsnummer, String rechnungsnummer, double betrag, String datum,
                    String text) {
        super(datum, text);
        this.mitgliedsnummer = mitgliedsnummer;
        this.rechnungsnummer = rechnungsnummer;
        this.betrag = betrag;
    }

    @Override
    public String toString() {
        return "Mitgliedsnummer: " + this.mitgliedsnummer
                + "\nRechnungsnummer: " + this.rechnungsnummer
                + "\nDatum: " + this.getDatum()
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

    public double getBetrag() {
        return this.betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }
}
