package backend;

public class Mitgliederantrag extends Datei {
    private String mitgliederantragsnummer;
    private String name;
    private String geburtsdatum;
    private Mitgliedsstatus mitgliedsstatus;
    private String mitgliedsnummer;

    public Mitgliederantrag(String mitgliederantragsnummer, String name, String geburtsdatum,
                            Mitgliedsstatus mitgliedsstatus, String datum, String mitgliedsnummer, String text) {
        super(datum, text);
        this.mitgliederantragsnummer = mitgliederantragsnummer;
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.mitgliedsstatus = mitgliedsstatus;
        this.mitgliedsnummer = mitgliedsnummer;
    }

    public String getMitgliederantragsnummer() {
        return mitgliederantragsnummer;
    }

    public void setMitgliederantragsnummer(String mitgliederantragsnummer) {
        this.mitgliederantragsnummer = mitgliederantragsnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Mitgliedsstatus getMitgliedsstatus() {
        return mitgliedsstatus;
    }

    public void setMitgliedsstatus(Mitgliedsstatus mitgliedsstatus) {
        this.mitgliedsstatus = mitgliedsstatus;
    }

    public String getMitgliedsnummer() {
        return mitgliedsnummer;
    }

    public void setMitgliedsnummer(String mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }
}
