package functionalProgramming.advanced.functionalInterface;

import functionalProgramming.advanced.EmailSender;
import functionalProgramming.advanced.Gmail;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new Gmail();
        emailSender.send();

        EmailSender emailSender2 = new EmailSender() {
            @Override
            public void send() {
                System.out.println("Sending email from amigos");
            }
        };
        emailSender2.send();
    }
}
