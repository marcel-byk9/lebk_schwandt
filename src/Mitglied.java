import java.time.LocalDate;
import java.util.List;

public class Mitglied extends Person{

    private String mitgliedsnummer;
    private Mitgliedsstatus status;
    private Altersklasse altersklasse;
    private Mitgliederantrag mitgliederantrag;
    private Kuendigung kuendigung;
    private List<Abonnements> abonnements;
    private List<Rechnung> rechnungen;

    public Mitglied(String mitgliedsnummer, Mitgliedsstatus status, Altersklasse altersklasse, Mitgliederantrag mitgliederantrag,
                    Kuendigung kuendigung, List<Abonnements> abonnements, List<Rechnung> rechnungen, String name, LocalDate geburtstag) {
        super(name, geburtstag);
        this.mitgliedsnummer = mitgliedsnummer;
        this.status = status;
        this.altersklasse = altersklasse;
        this.mitgliederantrag = mitgliederantrag;
        this.kuendigung = kuendigung;
        this.abonnements = abonnements;
        this.rechnungen = rechnungen;
    }

    public String getMitgliedsnummer() {
        return mitgliedsnummer;
    }

    public Mitgliedsstatus getStatus() {
        return status;
    }

    public Altersklasse getAltersklasse() {
        return altersklasse;
    }

    public Mitgliederantrag getMitgliederantrag() {
        return mitgliederantrag;
    }

    public Kuendigung getKuendigung() {
        return kuendigung;
    }

    public List<Abonnements> getAbonnements() {
        return abonnements;
    }

    public List<Rechnung> getRechnungen() {
        return rechnungen;
    }

    public void setMitgliedsnummer(String mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }

    public void setStatus(Mitgliedsstatus status) {
        this.status = status;
    }

    public void setAltersklasse(Altersklasse altersklasse) {
        this.altersklasse = altersklasse;
    }

    public void setMitgliederantrag(Mitgliederantrag mitgliederantrag) {
        this.mitgliederantrag = mitgliederantrag;
    }

    public void setKuendigung(Kuendigung kuendigung) {
        this.kuendigung = kuendigung;
    }

    public void setAbonnements(List<Abonnements> abonnements) {
        this.abonnements = abonnements;
    }

    public void setRechnungen(List<Rechnung> rechnungen) {
        this.rechnungen = rechnungen;
    }
}