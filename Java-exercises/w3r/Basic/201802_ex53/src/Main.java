// Write a Java program that accepts three integers from the user
// and return true if the second number is greater than first number and third number is greater than second number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int number1 = in.nextInt();
        System.out.print("Input second number: ");
        int number2 = in.nextInt();
        System.out.print("Input third number: ");
        int number3 = in.nextInt();
        System.out.println(numberCompare(number1,number2,number3));
    }

    private static boolean numberCompare(int num1, int num2, int num3) {
        boolean check = false;
        if (num2>num1 && num3>num2){
            check=true;
        }
        return check;
    }
}
