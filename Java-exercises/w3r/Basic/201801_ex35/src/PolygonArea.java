// Write a Java program to compute the area of a polygon.

import java.util.Scanner;

public class PolygonArea
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number of sides of the polygon: ");
        int sides = in.nextInt();

        System.out.print("Input the length of one side of the polygon: ");
        double sideLength = in.nextDouble();

        double result = (sides*Math.pow(sideLength,2))/(4*Math.tan(Math.PI/sides));
        System.out.println("The area of the polygon with " + sides + " sides of length " + sideLength + " are: " + result);
    }
}