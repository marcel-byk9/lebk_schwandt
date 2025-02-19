package Code;

import Code.Datei;

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

    public String getMitgliedsnummer() {
        return mitgliedsnummer;
    }

    public void setMitgliedsnummer(String mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }

    public String getRechnungsnummer() {
        return rechnungsnummer;
    }

    public void setRechnungsnummer(String rechnungsnummer) {
        this.rechnungsnummer = rechnungsnummer;
    }

    @Override
    public LocalDate getDatum() {
        return datum;
    }

    @Override
    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }
}
