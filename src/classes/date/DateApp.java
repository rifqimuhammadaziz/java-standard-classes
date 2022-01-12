package classes.date;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date(); // date & time now
        System.out.println(date);

        Calendar calendar = Calendar.getInstance(); // date
        System.out.println(calendar); // print pure calendar
        calendar.set(Calendar.YEAR, 1999);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 21);
        calendar.set(Calendar.HOUR_OF_DAY, 01);

        Date calendarToDate = calendar.getTime(); // convert calendar to date
        System.out.println(calendarToDate);


    }
}
