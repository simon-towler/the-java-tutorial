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
    int age;

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

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static List<Person> createRoster() {

        List<Person> roster = new ArrayList<Person>();

        Person nextPerson = new Person();
        nextPerson.setName("Che Guevara");
        nextPerson.setGender(Person.Sex.MALE);
        nextPerson.setAge(39);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Jean Paul Sartre");
        nextPerson.setGender(Person.Sex.MALE);
        nextPerson.setAge(74);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Simone De Beauvoir");
        nextPerson.setGender(Person.Sex.FEMALE);
        nextPerson.setAge(78);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Susan Sontag");
        nextPerson.setGender(Person.Sex.FEMALE);
        nextPerson.setAge(71);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Nina Simone");
        nextPerson.setGender(Person.Sex.FEMALE);
        nextPerson.setAge(70);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Frida Kahlo");
        nextPerson.setGender(Person.Sex.FEMALE);
        nextPerson.setAge(47);
        roster.add(nextPerson);

        nextPerson = new Person();
        nextPerson.setName("Charles Mingus");
        nextPerson.setGender(Person.Sex.MALE);
        nextPerson.setAge(56);
        roster.add(nextPerson);

        return roster;
    }
}