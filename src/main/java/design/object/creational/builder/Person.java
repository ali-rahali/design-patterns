package design.object.creational.builder;

import java.time.LocalDate;

/**
 * Target object type which is used to demonstrate builder design pattern
 */
public class Person {
    // Some basic personal data
    private String firstName;
    private String lastName;
    private boolean sex;
    private LocalDate birthDate;

    // Private constructor - only Builder class has access to it
    private Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.sex = personBuilder.sex;
        this.birthDate = personBuilder.birthDate;
    }

    // Helper class to builder target type objects
    public static class PersonBuilder {
        // The same fields are mirrored in corresponding builder class
        private String firstName;
        private String lastName;
        private boolean sex;
        private LocalDate birthDate;

        // Builder's fluent API
        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder male() {
            this.sex = true;
            return this;
        }

        public PersonBuilder female() {
            this.sex = false;
            return this;
        }

        public PersonBuilder birthDate(int day, int month, int year) {
            this.birthDate = LocalDate.of(day, month, year);
            return this;
        }

        // Main builder method which converts our builder into target type
        public Person build() {
            return new Person(this);
        }
    }
}
