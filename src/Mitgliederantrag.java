import java.time.LocalDate;

public class Mitgliederantrag extends Datei {
    private String mitgliederantragsnummer;
    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;
    private Mitgliedsstatus mitgliedsstatus;
    private LocalDate datum;
    private String mitgliedsnummer;

    public Mitgliederantrag(String mitgliederantragsnummer, String vorname, String nachname, LocalDate geburtsdatum,
                            Mitgliedsstatus mitgliedsstatus, LocalDate datum, String mitgliedsnummer) {
        this.mitgliederantragsnummer = mitgliederantragsnummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.mitgliedsstatus = mitgliedsstatus;
        this.datum = datum;
        this.mitgliedsnummer = mitgliedsnummer;
    }
}
