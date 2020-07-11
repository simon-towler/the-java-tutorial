import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        // ...
        return 0;
    }

    public void printPerson() {
        // ...
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Person> createRoster() {

        List<Person> roster = new ArrayList<Person>();

        Person nextPerson = new Person();
        nextPerson.setName("Che Guevara");
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Jean Paul Sartre");
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Simone De Beauvoir");
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Susan Sontag");
        roster.add(nextPerson);

        return roster;
    }
}