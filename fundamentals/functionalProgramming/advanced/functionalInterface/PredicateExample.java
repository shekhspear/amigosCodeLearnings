package functionalProgramming.advanced.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        var email = "hiamigoscode.com";
        System.out.println(isValidEmail(email));
        System.out.println(isValidEmailPredicate.test(email));
    }
    static Predicate<String> isValidEmailPredicate = email -> email.contains("@");
    static boolean isValidEmail(String email){
       return email.contains("@");
    }
}
