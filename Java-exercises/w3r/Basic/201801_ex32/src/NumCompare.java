// Write a Java program to compare two numbers.

import java.util.Scanner;

public class NumCompare {

    public void numberCompare(int a, int b){
        if ( a == b )
            System.out.printf( "%d == %d\n", a, b );
        if ( a != b )
            System.out.printf( "%d != %d\n", a, b );
        if ( a < b )
            System.out.printf( "%d < %d\n", a, b );
        if ( a > b )
            System.out.printf( "%d > %d\n", a, b );
        if ( a <= b )
            System.out.printf( "%d <= %d\n", a, b );
        if ( a >= b )
            System.out.printf( "%d >= %d\n", a, b );
    }

    public static void main(String[] args) {
        int numberOne, numberTwo;
        NumCompare numCompare = new NumCompare();

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        numberOne = in.nextInt();

        System.out.print("Input second number: ");
        numberTwo = in.nextInt();

        System.out.println("Comparison of this two numbers are: ");
        numCompare.numberCompare(numberOne,numberTwo);
    }
}
