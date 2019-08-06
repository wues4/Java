// Write a Java program to display the current date time in specific format.

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CurrentTime
{
    public static final DateFormat simpleDF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(simpleDF.format(date));

        Calendar calendar = Calendar.getInstance();
        System.out.println(simpleDF.format(calendar.getTime()));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dtf.format(localDateTime));

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDate));
    }
}