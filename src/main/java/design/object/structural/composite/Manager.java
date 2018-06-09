package design.object.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * It's a Composite in composite design pattern definition
 */
public class Manager implements Person {

    /**
     * Composites leaves
     */
    private List<Person> people;

    /**
     * Delegates work to subordinate people
     */
    @Override
    public void work() {
        people.forEach(Person::work);
    }

    /**
     * Adds a person
     */
    public void addPerson(Person person) {
        if (person == null) {
            return;
        }

        if (people == null) {
            people = new ArrayList<>();
        }

        people.add(person);
    }

    /**
     * Removes a person
     */
    public void removePerson(Person person) {
        if (people == null) {
            return;
        }

        people.remove(person);
    }
}
