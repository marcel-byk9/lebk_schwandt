package backend;

import java.util.List;

public class Mitglied extends Person {
    private String mitgliedsnummer;
    private Mitgliedsstatus status;
    private Altersklasse altersklasse;
    private Mitgliederantrag mitgliederantrag;
    private Kuendigung kuendigung;
    private List<Abonnement> abonnements;
    private List<Rechnung> rechnungen;

    public Mitglied(String mitgliedsnummer, Mitgliedsstatus status, Altersklasse altersklasse, Mitgliederantrag mitgliederantrag, Kuendigung kuendigung, List<Abonnement> abonnements, List<Rechnung> rechnungen, String name, String geburtstag) {
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
        return this.mitgliedsnummer;
    }

    public Mitgliedsstatus getStatus() {
        return this.status;
    }

    public Altersklasse getAltersklasse() {
        return this.altersklasse;
    }

    public Mitgliederantrag getMitgliederantrag() {
        return this.mitgliederantrag;
    }

    public Kuendigung getKuendigung() {
        return this.kuendigung;
    }

    public List<Abonnement> getAbonnements() {
        return this.abonnements;
    }

    public List<Rechnung> getRechnungen() {
        return this.rechnungen;
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

    public void setAbonnements(List<Abonnement> abonnements) {
        this.abonnements = abonnements;
    }

    public void setRechnungen(List<Rechnung> rechnungen) {
        this.rechnungen = rechnungen;
    }
}
