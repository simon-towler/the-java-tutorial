import java.util.List;

public class BulkDataOperationsExamples {

    public static void main (String... args) {

        //Create sample data
        List<Person> roster = Person.createRoster();
        printDivider();
        // 1. Print names of members, for-each loop
        System.out.println("Members of the collection (for-each loop):");
        for (Person p : roster) {
            System.out.println(p.getName());
        }
        printDivider();
        // 2. Print names of members, forEach operation
        System.out.println("Members of the collection (bulk data operations):");
        roster.stream()
                .forEach(e -> System.out.println(e.getName()));

        // 3. Print names of male members, forEach operation
        printDivider();
        System.out.println("Male members of the collection (bulk data operations):");
        roster.stream()
                .filter(e -> e.getGender() == Person.Sex.MALE)
                .forEach(e -> System.out.println(e.getName()));
    }

    private static void printDivider() {
        System.out.println("==========================================================================");
    }
}