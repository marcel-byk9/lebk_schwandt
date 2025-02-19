public class Mitgliederantrag extends Datei {
    private String mitgliederantragsnummer;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private Mitgliedsstatus mitgliedsstatus;
    private String datum;
    private String mitgliedsnummer;

    public Mitgliederantrag(String mitgliederantragsnummer, String vorname, String nachname, String geburtsdatum, Mitgliedsstatus mitgliedsstatus, String datum, String mitgliedsnummer) {
        this.mitgliederantragsnummer = mitgliederantragsnummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.mitgliedsstatus = mitgliedsstatus;
        this.datum = datum;
        this.mitgliedsnummer = mitgliedsnummer;
    }
}
