import java.util.List;

public class BulkDataOperationsExamples {

    public static void main (String... args) {

        //Create sample data
        List<Person> roster = Person.createRoster();

        // 1. Print names of members, for-each loop
        System.out.println("Members of the collection (for-each loop):");
        for (Person p : roster) {
            System.out.println(p.getName());
        }
    }
}