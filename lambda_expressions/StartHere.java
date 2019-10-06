import java.util.ArrayList;
import java.util.List;

public class StartHere {


    public static void main(String[] args){

        List roster = Person.createRoster();
        printPersonsOlderThan(roster, 30);

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
}
