import java.io.File;
import java.time.LocalDate;

public abstract class Datei {
    private final String DATEIPFAD = "../../Mitglieder";

    private LocalDate datum;
    private Mitglied mitglied;
    private String dateiName;
    private String text;
    private File datei;

    public void ladeDatei() {

    }

    public void schreibeDatei() {

    }

    public LocalDate getDatum() {
        return datum;
    }

    public Mitglied getMitglied() {
        return mitglied;
    }

    public String getDateiName() {
        return dateiName;
    }

    public String getText() {
        return text;
    }

    public File getDatei() {
        return datei;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public void setMitglied(Mitglied mitglied) {
        this.mitglied = mitglied;
    }

    public void setDateiName(String dateiName) {
        this.dateiName = dateiName;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDatei(File datei) {
        this.datei = datei;
    }
}
