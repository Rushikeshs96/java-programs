import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list of persons
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 22));

        // Sort the list using a Comparator (based on names)
        Collections.sort(persons, new PersonNameComparator());

        // Print the sorted list
        System.out.println("Sorted Persons (based on name):");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
