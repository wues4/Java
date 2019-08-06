public class DateTest {

    public static void main(String[] args) {
        DateManipulator dm = new DateManipulator();
        // substitute your own date using format: MM/dd/yyyy -  Example "08/22/2011")
        dm.parseDate("05/20/2015");
        dm.parseDate("");
    }
}
