public class DateOneTest {
  public static void main(String args[]) {
    DateOne dateOne = new DateOne();
    dateOne.day = 15;
    dateOne.month = 9;
    dateOne.year = 2018;
    System.out.println("Date: " + dateOne.day + "/" + dateOne.month + "/" + dateOne.year);
  }
}