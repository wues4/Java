// Accepts an integer and count the factors of the number

import java.util.Scanner;

public class Main {
    private static int number, count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the integer: ");
        number = in.nextInt();

        for (int i = number; i > 0 ; i--) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println("Count factors of number: " + number + " are: " + count);
    }
}
