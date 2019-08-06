import java.util.Scanner;

public class Person {

    int years, days;
    long minutes, seconds, mili;

    public void calculateAge(){

        System.out.print("Input your age in years: ");
        Scanner in = new Scanner(System.in);
        years = in.nextInt();

        days = years*365;
        seconds = days*24*60*60;
        minutes = seconds/60;
        mili = seconds*1000;

        System.out.println("You lived: " + days + " days");
        System.out.println("You lived: " + minutes + " minutes");
        System.out.println("You lived: " + seconds + " seconds");
        System.out.println("You lived: " + mili + " miliseconds");
    }
}
