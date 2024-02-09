import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PackAgeAndImport {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("date: "+ date);
        System.out.println("Local date: "+ localDate);
        System.out.println("Local date time: "+ localDateTime);
    }
}
