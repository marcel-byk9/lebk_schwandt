package backend;

public enum Mitgliedsstatus {
    AKTIV("aktiv"),
    PASSIV("passiv"),
    EHEMALIG("ehemalig"),
    EHRENMITGLIED("ehrenmitglied");

    private final String status;

    Mitgliedsstatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
