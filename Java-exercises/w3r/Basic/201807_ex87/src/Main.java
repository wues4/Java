// Write a Java program than read an integer and calculate the sum of its digits and write the number of each digit of the sum in English


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Watch out ! This program will calculate the sum of digits from your input value and print it out !");
        Scanner in = new Scanner(System.in);
        System.out.println("Input some value: ");
        int value = in.nextInt();
        doSomeKindOfSorcery(value);
    }

    private static void doSomeKindOfSorcery(int aValue) {
        System.out.println("Your input value was: " + aValue);

        int sum = 0;
        char[] foo = Integer.toString(aValue).toCharArray();
        for (char aFoo : foo) {
            sum += aFoo - '0';
        }
        System.out.println("Sum of digits in your value of " + aValue + " are: " + sum);

        int x,y,z;
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (sum < 10) {
            System.out.println("Say it in English ! " + word[sum]);
        } else if (sum < 100) {
            x = sum/10;
            y = sum - (x*10);
            System.out.println("Say it in English ! " + word[x] + " " + word[y]);
        } else if (sum < 1000) {
            x = sum/10;
            y = sum - (x*10);
            z = sum - (x*10) - (y*10);
            System.out.println("Say it in English ! " + word[x] + " " + word[y] + " " + word[z]);
        }
    }
}
