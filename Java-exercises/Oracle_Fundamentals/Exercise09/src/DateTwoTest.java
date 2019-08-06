public class DateTwoTest {
  public static void main(String args[]) {
    DateTwo dateTwo = new DateTwo();
    dateTwo.setDay(28);
    dateTwo.setMonth(3);
    dateTwo.setYear(2021);
    System.out.println("The date is: " + dateTwo.getDay() + "/" + dateTwo.getMonth() + "/" + dateTwo.getYear());
    System.out.println();

    dateTwo.setDate(23, 4, 2036);
    dateTwo.displayDate();
    System.out.println();

    dateTwo.setDate(40, 5, 1908);
    dateTwo.displayDate();
    System.out.println();

    dateTwo.setDate(23, 16, 2128);
    dateTwo.displayDate();
    System.out.println();

    dateTwo.setDate(17,1,20);
    dateTwo.displayDate();
    System.out.println();

    dateTwo.setDate(29,2,2035);
    dateTwo.displayDate();
    System.out.println();
  }
}