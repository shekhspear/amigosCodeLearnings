package functionalProgramming.advanced.functionalInterface;

import javax.management.BadBinaryOpValueExpException;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        sendEmail("hello@gmail.com");

//        sendEmailConsumer.accept("hello@gmail.co.uk");
        sendEmailBiConsumer.accept("hello@gmail.co.uk", "hey@hotmail.com");

//        List<String> emails =List.of("first@email.com","second@email.com","third@email.com");
//        emails.forEach(email -> {
//            sendEmail(email);
//        });
//        emails.forEach(sendEmailConsumer);



    }
    static Consumer<String> sendEmailConsumer = email -> System.out.println("Sending email to " + email);
    static BiConsumer<String, String> sendEmailBiConsumer = (from, to) -> System.out.println("Sending email from " + from + " to " + to);
    static void sendEmail(String email) {
        System.out.println("Sending email to " + email);
    }
}
