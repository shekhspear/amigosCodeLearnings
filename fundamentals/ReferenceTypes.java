import java.time.LocalDate;

public class ReferenceTypes {
    public static void main(String[] args) {
        String str = new String("Hello this is the first string ");
        LocalDate now = LocalDate.now();
        System.out.println(str + now);
    }
}
