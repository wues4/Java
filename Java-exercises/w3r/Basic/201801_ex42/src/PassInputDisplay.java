// Write a Java program to input and display your password.

import java.util.Scanner;

public class PassInputDisplay
{
    public static void main(String[] args)
    {
        String password1="", password2="";
        Scanner in = new Scanner(System.in);
        boolean yes = false;

        while (yes==false) {
            System.out.print("Input password: ");
            password1 = in.nextLine();
            System.out.print("Confirm password: ");
            password2 = in.nextLine();

            if (password1.equals(password2)) {
                System.out.println("Show your password ? Y/N");
                if (in.hasNext("Y") || in.hasNext("y")) {
                    yes = true;
                    System.out.println(password1);
                } else {
                    yes = true;
                    System.out.println("See you later");
                }
            } else {
                System.out.println("Password do not match. Please try again");
            }
        }
    }
}