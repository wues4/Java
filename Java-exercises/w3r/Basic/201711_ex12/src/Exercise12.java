// Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class Exercise12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will calculate area and perimeter of rectangle :)");

        System.out.println("Input width: ");
        double width = sc.nextDouble();

        System.out.println("Input height: ");
        double height = sc.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}