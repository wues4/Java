//Write a Java program to convert seconds to hour, minute and seconds.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int totalSeconds = in.nextInt();

        System.out.println(timeConversion(totalSeconds));
    }

    private static String timeConversion(int totalSeconds) {
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_MINUTE = 60;

        int seconds = totalSeconds % SECONDS_IN_MINUTE;
        int totalMinutes = totalSeconds / SECONDS_IN_MINUTE;
        int minutes = totalMinutes % MINUTES_IN_HOUR;
        int hours = totalMinutes / MINUTES_IN_HOUR;

        return hours + ":" + minutes + ":" + seconds;
    }
}
