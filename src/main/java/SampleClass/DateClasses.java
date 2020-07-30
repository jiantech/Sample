package SampleClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateClasses {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String curDate = localDate.format(df);
        System.out.println(curDate);

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String curTime = localTime.format(dft);
        System.out.println(curTime);

        Calendar cal = Calendar.getInstance();
        Random random = new Random();
        cal.add(Calendar.DAY_OF_MONTH, -1 * random.nextInt(100));
        cal.add(Calendar.HOUR_OF_DAY, 2);
        Date d = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy hh:mm:ss a");
        String pastDate = sdf.format(d);
        System.out.println(pastDate);
    }
}
