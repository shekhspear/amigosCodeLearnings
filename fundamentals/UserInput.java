import java.time.LocalDate;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hell, " + userName +". What is your age? ");
        int age = scanner.nextInt();
        int yearOfBirth = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + yearOfBirth);

    }
}
