//Write a Java program to compute the area of a hexagon.

import java.util.Scanner;

public class HexAreaCompute 
{
	public static void main(String[] args) 
	{
		double hexagonSideLength;
		Scanner in = new Scanner(System.in);
		System.out.print("Input the length of the hexagon side: ");
		hexagonSideLength=in.nextInt();
		
		double result = (6 * Math.pow(hexagonSideLength, 2))/(4*Math.tan(Math.PI/6));
		System.out.println("The area of the hexagon with side length of " + hexagonSideLength + " is: " + result);
	}
}