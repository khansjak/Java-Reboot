import java.text.SimpleDateFormat;
import java.util.Date;

public class p035_utils1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        String strDate = format.format(date);
        System.out.println(strDate);
    }
}
