package backend;

public abstract class Datei {
    private String datum;
    private String text;

    public Datei(String datum, String text) {
        this.datum = datum;
        this.text = text;
    }

    public String getDatum() {
        return this.datum;
    }

    public String getText() {
        return this.text;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setText(String text) {
        this.text = text;
    }
}
