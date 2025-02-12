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
        return mitgliedsnummer;
    }

    public String getKuendigungsDatum() {
        return kuendigungsDatum;
    }

    public String getKuendigungsnummer() {
        return kuendigungsnummer;
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

    @Override
    public String toString(){
        return "Mitgliedsnummer: " + this.mitgliedsnummer + "\n" +
                "Kündigungsdatum: " + this.kuendigungsDatum + "\n" +
                "Kündigungsnummer: " + this.kuendigungsnummer;
    }
}
