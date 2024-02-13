package functionalProgramming.advanced;

public class Hotmail implements EmailSender{
    @Override
    public void send() {
        System.out.println("Sending email from Hotmail");
    }
}
