package Code;

public enum Abonnements {
    SAUNA("Sauna", 10),
    PARKPLATZ("Parkplatz", 5),
    DUSCHE("Dusche", 5),
    BODYPUMP("Bodypump", 15),
    INDOOR_CYCLING("Indoor Cycling", 15),
    BODABALANCE("Bodabalance", 15),
    LES_MILLS_GRIT("Les Mills Grit", 15),
    BODYSTYLING("Bodystyling", 15),
    RUECKEN_SOFT("Rücken Soft", 15),
    RUECKEN_AKTIV("Rücken Aktiv", 15),
    BAUCH_BEINE_PO("Bauch Beine Po", 15),
    CARDIO_MEETS_WELLNESS("Cardio meets Wellness", 15);

    private final String bezeichnung;
    private final double preis;

    Abonnements(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public String getBezeichnung(){
        return this.bezeichnung;
    }

    public double getPreis(){
        return this.preis;
    }
}
