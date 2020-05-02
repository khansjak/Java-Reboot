import java.util.Calendar;
import java.util.GregorianCalendar;

public class p036_utils2 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get( Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.printf(year+" "+month+" "+dayofweek);

    }
}
