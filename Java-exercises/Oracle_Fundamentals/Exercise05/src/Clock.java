import java.util.Scanner;

public class Clock {

    public void displayPartOfDay(){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter time / ex:1315 = 13:15 / : ");
        int currentTime = in.nextInt();

        if (currentTime > 801 && currentTime < 1200){
            System.out.println("It's Morning !");
        }else if (currentTime > 1201 && currentTime < 1700){
            System.out.println("It's Afternoon !");
        }else if (currentTime > 1701 && currentTime < 2400){
            System.out.println("It's Evening !");
        }else {
            System.out.println("It's Early Morning !");
        }
    }
}
