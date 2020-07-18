import java.util.List;

public class ReductionExamples {

    //main method signature using varargs insead of explicit String array
    public static void main(String... args) {

        //Create sample data
        List<Person> roster = Person.createRoster();

        System.out.println("Contents of roster: ");

        roster.stream()
                .forEach(p -> p.printPerson());

        System.out.println();
        System.out.println("==========================================================================");


        // 1. Average age of female members, average operation
        double average = roster
                .stream()
                .filter(p -> p.getGender() == Person.Sex.FEMALE)
                // map each Person p in the stream to their age as a primitive integer
                // Q: why do we need mapToInt here? Why won't it work simply with map?
                // A: if we just call .map we get a Stream<Integer>, a boxed val. .mapToInt returns an IntStream
                .mapToInt(Person::getAge)
                // IntStream has the .average method. Stream<Integer> (or Stream<?>) does not.
                .average() // IntStream.average returns an OptionalDouble
                // this is a method of the OptionalDouble class
                .getAsDouble();

        System.out.println("Average age at death of female members (bulk data operations): " + average);
        System.out.println("==========================================================================");

        // 2. Sum of ages with sum operation
        Integer totalAge = roster
                .stream()
                .mapToInt(Person::getAge)
                .sum();

        System.out.println("Sum of ages (sum operation): " + totalAge);
        System.out.println("==========================================================================");


    }

}