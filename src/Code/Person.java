package Code;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate geburtsdatum;

    public Person(String name, LocalDate geburtsdatum) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
    }

    public String getName() {
        return name;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString(){
        return "Name: " + this.name+ "\nGeburtstag: "+ this.geburtsdatum;
    }
}
