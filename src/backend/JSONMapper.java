package backend;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JSONMapper {
    public JSONMapper() {
    }

    public static Mitgliedsstatus parseMitgliedsstatus(JSONObject obj) {
        var str = obj.getString("status");
        return Mitgliedsstatus.valueOf(str.toUpperCase());
    }

    public static Altersklasse parseAltersklasse(JSONObject obj) {
        var str = obj.getString("bezeichnung");
        return Altersklasse.valueOf(str.toUpperCase());
    }

    public static Mitgliederantrag parseMitgliederantrag(JSONObject obj) {
        return new Mitgliederantrag(
                obj.getString("antragsnummer"),
                obj.getString("name"),
                obj.getString("geburtsdatum"),
                parseMitgliedsstatus(obj.getJSONObject("status")),
                obj.getString("datum"),
                obj.getString("mitgliedsnummer"),
                obj.getString("text")
        );
    }

    public static Kuendigung parseKuendigung(JSONObject obj) {
        return new Kuendigung(
                obj.getString("mitgliedsnummer"),
                obj.getString("kuendigungsDatum"),
                obj.getString("kuendigungsnummer"),
                obj.getString("datum"),
                obj.getString("text")
        );
    }

    public static List<Abonnement> parseAbonnements(JSONArray arr) {
        ArrayList<Abonnement> abonnements = new ArrayList<>();
        for (int i = 0; i < arr.length(); ++i) {
            abonnements.add(parseAbonnement(arr.getJSONObject(i)));
        }
        return abonnements;
    }

    public static Abonnement parseAbonnement(JSONObject obj) {
        return Abonnement.valueOf(obj.getString("abonnements"));
    }

    public static Rechnung parseRechnung(JSONObject obj) {
        return new Rechnung(
                obj.getString("mitgliedsnummer"),
                obj.getString("rechnungsnummer"),
                obj.getDouble("betrag"),
                obj.getString("datum"),
                obj.getString("text")
        );
    }

    public static List<Rechnung> parseRechnungen(JSONArray arr) {
        ArrayList<Rechnung> rechnungen = new ArrayList<>();
        for (int i = 0; i < arr.length(); ++i) {
            rechnungen.add(parseRechnung(arr.getJSONObject(i)));
        }
        return rechnungen;
    }
}
