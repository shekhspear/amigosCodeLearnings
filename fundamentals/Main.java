import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Person> people = getPeople();
        /// Imperative approach
        System.out.println("Imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        for (Person femme : females) {
            System.out.println(femme);
        }
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("John", 42, Gender.MALE),
                new Person("Jinny", 22, Gender.FEMALE),
                new Person("John", 52, Gender.MALE),
                new Person("Jackie", 31, Gender.FEMALE),
                new Person("Jennifer", 72, Gender.FEMALE));
    }
}
