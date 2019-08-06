import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulator {

    Date myDate;
    SimpleDateFormat simpleDF = new SimpleDateFormat("MM/dd/yyy");


    public void parseDate(String dateString){
        try {
            String formattedDateString;
            myDate = simpleDF.parse(dateString);
            System.out.println("Parse successful");
            System.out.println("Date with native format: " + myDate);
            formattedDateString = simpleDF.format(myDate);
            System.out.println("Formatted date: " + formattedDateString);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }
}
