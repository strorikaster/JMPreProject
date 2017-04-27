import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


/**
 * Created by A.Zotov on 25.04.2017.
 */
public class BirthDay {
    public static void main(String[] args) {
        DateFormat needDateFormat = new SimpleDateFormat("dd.mm.yyyy - EEE", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1981, Calendar.MARCH, 30);
        Date  currentDate = new Date();
        Date myBirthDay = calendar.getTime();
        int i = 0;

        while(currentDate.compareTo(myBirthDay) > 0 ) {
            System.out.println(i + " - " + needDateFormat.format(myBirthDay));
            calendar.add(Calendar.YEAR, 1);
            myBirthDay = calendar.getTime();
            i++;
        }
    }
}
