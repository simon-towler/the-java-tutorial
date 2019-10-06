import java.util.ArrayList;
import java.util.List;

public class StartHere {


    public static void main(String[] args){

        List<Person> roster = Person.createRoster();
        //printPersonsWithinAgeRange(roster, 20, 60);
        //printPersons(roster, new CheckPersonElligibleForSelectiveService());

        //approach 4: Specify search criteria code in an anonymous class
        printPersons(roster, new CheckPerson() {
            public boolean test (Person p) {
                return p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25;
            }
        });

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
    
    interface CheckPerson {
        boolean test(Person p);
    }

    static class CheckPersonElligibleForSelectiveService implements CheckPerson {
        public boolean test (Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }


}
