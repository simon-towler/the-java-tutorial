import java.util.ArrayList;
import java.util.List;

public class StartHere {


    public static void main(String[] args){

        List<Person> roster = Person.createRoster();
        //printPersonsWithinAgeRange(roster, 20, 60);
        printPersons(roster, new CheckPersonElligibleForSelectiveService());

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

    static class CheckPersonElligibleForSelectiveService {
        public boolean test (Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }

    //approach 3: Specify search criteria code in a local class
    public static void printPersons(List<Person> roster, CheckPersonElligibleForSelectiveService tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

}
