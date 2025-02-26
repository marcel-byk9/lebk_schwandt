package backend;

public enum Altersklasse {
    JUNG("Jung", 10.0),
    ERWACHSEN("Erwachsen", 20.0),
    SENIOR("Senior", 15.0);

    private final String bezeichnung;
    private final double preis;

    Altersklasse(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getPreis() {
        return preis;
    }
}
