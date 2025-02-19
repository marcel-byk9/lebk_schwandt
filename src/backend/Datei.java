package backend;

import java.io.File;

public abstract class Datei {
    private String datum;
    private Mitglied mitglied;
    private String dateiName;
    private String text;
    private File datei;

    public Datei() {
    }

    public void ladeDatei() {
    }

    public void schreibeDatei() {
    }

    public String getDatum() {
        return this.datum;
    }

    public Mitglied getMitglied() {
        return this.mitglied;
    }

    public String getDateiName() {
        return this.dateiName;
    }

    public String getText() {
        return this.text;
    }

    public File getDatei() {
        return this.datei;
    }

    public void setDatum(String datum) {
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
