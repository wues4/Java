//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class ex10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input radius of a circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Your radius = " + radius);
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);

    }
}
