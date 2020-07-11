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

    public static List<Person> createRoster() {
        return new ArrayList<Person>();
    }
}