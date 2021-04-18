package mandatorytask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static mandatorytask.Country.*;
import static mandatorytask.Gender.FEMALE;
import static mandatorytask.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Oleksandr", 26, MALE, UKRAINE),
                new Person("Jenny", 16, FEMALE, UKRAINE),
                new Person("Bryan", 48, MALE, USA),
                new Person("Grzegorz", 35, FEMALE, POLAND),
                new Person("Sophia", 42, FEMALE, FRANCE),
                new Person("Mario", 12, MALE, ITALY)
        ));
        System.out.println("\nTask 1:");
        Set<String> filteredStreamSet = personList.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(
                        HashSet::new,
                        (set, person) -> set.add(person.getName() + " - " + (person.getGender() == Gender.MALE ? "m" : "f")),
                        HashSet::addAll
                );
        filteredStreamSet.forEach(System.out::println);
    }
}
