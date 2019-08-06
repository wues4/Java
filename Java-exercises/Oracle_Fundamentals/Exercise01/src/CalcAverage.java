import java.util.Scanner;

public class CalcAverage {

   public static void main (String args[]) {
	
   	Scanner sc = new Scanner (System.in);
	System.out.println();
	System.out.println("Enter 3 Integers separated only by spaces: (example 20 30 40)");
	int i1 = sc.nextInt();
	int i2 = sc.nextInt();
	int i3 = sc.nextInt();
	int avg = (i1 + i2 + i3)/3;
	System.out.println();
		
	System.out.println("Average = " + avg);
   }
}