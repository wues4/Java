// Write a Java program to display the system time.

import java.util.Date;

public class DisplaySystemTime
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println("System time: " + date);

//        System.out.format("\nCurrent Date time: %tc\n", System.currentTimeMillis());
    }
}