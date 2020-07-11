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

    public void setGender(Person.Sex sex) {
        this.gender = sex;
    }

    public Person.Sex getGender() {
        return this.gender;
    }

    public static List<Person> createRoster() {

        List<Person> roster = new ArrayList<Person>();

        Person nextPerson = new Person();
        nextPerson.setName("Che Guevara");
        nextPerson.setGender(Person.Sex.MALE);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Jean Paul Sartre");
        nextPerson.setGender(Person.Sex.MALE);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Simone De Beauvoir");
        nextPerson.setGender(Person.Sex.FEMALE);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Susan Sontag");
        nextPerson.setGender(Person.Sex.FEMALE);
        roster.add(nextPerson);

        return roster;
    }
}