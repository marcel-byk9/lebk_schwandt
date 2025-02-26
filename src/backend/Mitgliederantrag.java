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
}
