// Write a Java program that accepts three integer values and return true if one of them is 20 or more less than one of the others.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, k;
        System.out.println("Input 3 integers: ");
        i=in.nextInt();
        j=in.nextInt();
        k=in.nextInt();
        System.out.println(Math.abs(i-j) >= 20 || Math.abs(j-k) >= 20 || Math.abs(k-i) >= 20);
    }
}