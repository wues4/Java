/*1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.*/


import java.util.Scanner;

public class ex01
{
    public static void main(String[] args)
    {
        System.out.println("Write your name:  ");
        Scanner n = new Scanner(System.in);
        String name = n.next();
        System.out.println("Hello " + name + " !");
    }
}