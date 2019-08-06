// Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int a = in.nextInt();
        takeIntAndDoSomething(a);
    }

    private static void takeIntAndDoSomething(int value){
        int steps = 0;
        while (value!=1){
            System.out.println(value);
            if ((value % 2) == 0) {
                value /= 2;
                steps += 1;
            } else {
                value = (value*3) + 1;
                steps += 1;
            }
        }
        System.out.println("Steps: " + steps);
    }
}
