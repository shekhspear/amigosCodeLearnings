import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List <Person> people = Main.getPeople();

        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);
    }
}
