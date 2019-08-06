// Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of your array: ");

        String[] foo = new String[in.nextInt()];

        for (int i = 0; i<foo.length; i++) {
            foo[i] = String.valueOf(i);
        }

        System.out.println("Your array: " + Arrays.toString(foo));
    }
}
