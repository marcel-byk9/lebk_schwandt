package Code;

import Code.Datei;

import java.time.LocalDate;

public class Kuendigung extends Datei {
    private String mitgliedsnummer;
    private String kuendigungsDatum;
    private String kuendigungsnummer;

    public Kuendigung(String mitgliedsnummer, String kuendigungsDatum, String kuendigungsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
        this.kuendigungsDatum = kuendigungsDatum;
        this.kuendigungsnummer = kuendigungsnummer;
    }

    public String getMitgliedsnummer() {
        return this.mitgliedsnummer;
    }

    public String getKuendigungsDatum() {
        return this.kuendigungsDatum;
    }

    public String getKuendigungsnummer() {
        return this.kuendigungsnummer;
    }

    public void setMitgliedsnummer(String mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }

    public void setKuendigungsDatum(String kuendigungsDatum) {
        this.kuendigungsDatum = kuendigungsDatum;
    }

    public void setKuendigungsnummer(String kuendigungsnummer) {
        this.kuendigungsnummer = kuendigungsnummer;
    }

    public String toString() {
        return "Mitgliedsnummer: " + this.mitgliedsnummer + "\nKündigungsdatum: " + this.kuendigungsDatum + "\nKündigungsnummer: " + this.kuendigungsnummer;
    }
}
