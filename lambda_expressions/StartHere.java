import java.util.ArrayList;
import java.util.List;

public class StartHere {


    public static void main(String[] args){

        List<Person> roster = Person.createRoster();
        printPersonsWithinAgeRange(roster, 20, 60);

    System.out.println("Done!");
    }

    //approach 1
    public static void printPersonsOlderThan(List<Person> people, int cutOffAge) {
        for (Person p : people) {
            if (p.getAge() >= cutOffAge) {
                p.printPerson();
            }
        }
    }

    //approach 2: Create more generalized search methods
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

}
