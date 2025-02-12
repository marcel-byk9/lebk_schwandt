import java.util.ArrayList;

public class Mitgliederverwaltung {
    private ArrayList<Mitglied> mitglieder;

    public Mitgliederverwaltung(ArrayList<Mitglied> mitglieder) {
        this.mitglieder = mitglieder;
    }

    public ArrayList<Mitglied> getMitglieder() {
        return mitglieder;
    }

    public void setMitglieder(ArrayList<Mitglied> mitglieder) {
        this.mitglieder = mitglieder;
    }
}
