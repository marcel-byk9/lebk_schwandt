import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMapper {
    public JSONMapper() {
    }

    public static Mitgliedsstatus parseMitgliedsstatus(String str) {
        return Mitgliedsstatus.valueOf(str.toUpperCase());
    }

    public static Altersklasse parseAltersklasse(String str) {
        return Altersklasse.valueOf(str.toUpperCase());
    }

    public static Mitgliederantrag parseMitgliederantrag(JSONObject obj) {
        return new Mitgliederantrag(obj.getString("antragsnummer"), obj.getString("vorname"), obj.getString("nachname"), obj.getString("geburtsdatum"), parseMitgliedsstatus(obj.getString("status")), obj.getString("datum"), obj.getString("mitgliedsnummer"));
    }

    public static Kuendigung parseKuendigung(JSONObject obj) {
        return new Kuendigung(obj.getString("kuendigungsnummer"), obj.getString("datum"), obj.getString("kuendigungsnummer"));
    }

    public static List<Abonnement> parseAbonnements(JSONArray arr) {
        ArrayList<Abonnement> abonnements = new ArrayList<>();

        for(int i = 0; i < arr.length(); ++i) {
            abonnements.add(parseAbonnement(arr.getJSONObject(i)));
        }

        return abonnements;
    }

    public static Abonnement parseAbonnement(JSONObject obj) {
        return Abonnement.valueOf(obj.getString("abonnements"));
    }

    public static Rechnung parseRechnung(JSONObject obj) {
        return new Rechnung(obj.getString("mitgliedsnummer"), obj.getString("rechnungsnummer"), obj.getString("datum"), obj.getDouble("betrag"));
    }

    public static List<Rechnung> parseRechnungen(JSONArray arr) {
        ArrayList<Rechnung> rechnungen = new ArrayList<>();

        for(int i = 0; i < arr.length(); ++i) {
            rechnungen.add(parseRechnung(arr.getJSONObject(i)));
        }

        return rechnungen;
    }
}
