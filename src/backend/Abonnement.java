package backend;

public enum Abonnement {
    SAUNA("Sauna", 10.0),
    PARKPLATZ("Parkplatz", 5.0),
    DUSCHE("Dusche", 5.0),
    BODYPUMP("Bodypump", 15.0),
    INDOOR_CYCLING("Indoor Cycling", 15.0),
    BODABALANCE("Bodabalance", 15.0),
    LES_MILLS_GRIT("Les Mills Grit", 15.0),
    BODYSTYLING("Bodystyling", 15.0),
    RUECKEN_SOFT("Rücken Soft", 15.0),
    RUECKEN_AKTIV("Rücken Aktiv", 15.0),
    BAUCH_BEINE_PO("Bauch Beine Po", 15.0),
    CARDIO_MEETS_WELLNESS("Cardio meets Wellness", 15.0);

    private final String bezeichnung;
    private final double preis;

    private Abonnement(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public double getPreis() {
        return this.preis;
    }
}
