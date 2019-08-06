import java.util.Scanner;

public class DateTwo {

    public void displayDay(){

        Scanner in = new Scanner(System.in);
        System.out.print("Please choose the number between 1 and 7: ");
        int dayNumber = in.nextInt();

        if (dayNumber == 1) {
            System.out.println("It's Monday !");
        }else if (dayNumber == 2) {
            System.out.println("It's Tuesday !");
        }else if (dayNumber == 3) {
            System.out.println("It's Wednesday !");
        }else if (dayNumber == 4) {
            System.out.println("It's Thursday !");
        }else if (dayNumber == 5) {
            System.out.println("It's Friday !");
        }else if (dayNumber == 6) {
            System.out.println("It's Saturday !");
        }else if (dayNumber == 7) {
            System.out.println("It's Sunday !");
        }else{
            System.out.println("There is no such day !");
        }
    }
}
