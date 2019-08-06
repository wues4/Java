// Write a Java program to calculate the modules
// of two numbers without using any inbuilt modulus operator.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNum = in.nextInt();
        System.out.print("Input second number: ");
        int secondNum = in.nextInt();
        System.out.println("Result: " + moduloMethod(firstNum,secondNum));
    }

    private static int moduloMethod(int firstNum, int secondNum) {
        return firstNum - ((firstNum/secondNum) * secondNum);
    }
}
