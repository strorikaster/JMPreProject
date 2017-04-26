import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Date;


/**
 * Created by A.Zotov on 25.04.2017.
 */
public class BirthDay {
    public static void main(String[] args) {
        SimpleDateFormat needDateFormat = new SimpleDateFormat("dd-mm-yyyy - EEE", Locale.ENGLISH);
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1981, GregorianCalendar.MARCH, 30);
        Date myBirthDay = calendar.getTime();
        Date  currentDate = new Date();
        int i = 0;

        while(currentDate.compareTo(myBirthDay) > 0 ){
            System.out.println(i + " - " + needDateFormat.format(myBirthDay));
            calendar.add(GregorianCalendar.YEAR, 1);
            myBirthDay = calendar.getTime();
            i++;
        }


    }
}
