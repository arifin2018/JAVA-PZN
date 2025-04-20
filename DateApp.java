import java.sql.Date;
import java.util.Calendar;

public class DateApp {
    public static void main(String[] args) {
        Date tanggal = new Date(1745134535692L);
        System.out.println(tanggal);


        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);

        System.out.println(calendar.getTime());
    }
}
