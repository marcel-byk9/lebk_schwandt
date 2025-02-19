package Code;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String geburtsdatum;

    public Person(String name, String geburtsdatum) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
    }

    public String getName() {
        return this.name;
    }

    public String getGeburtsdatum() {
        return this.geburtsdatum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nGeburtstag: " + this.geburtsdatum;
    }
}
