package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 22));

        Collections.sort(persons);

        System.out.println("Sorted Persons (based on age):");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
