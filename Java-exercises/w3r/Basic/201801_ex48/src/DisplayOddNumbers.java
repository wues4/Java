// Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.


public class DisplayOddNumbers
{
    public static void main(String[] args)
    {
        isOdd();
    }

    public static void isOdd()
    {
        for (int i=0; i<100; i++)
        {
            if ((i % 2) == 1) {
                System.out.println(i);
            }
        }
    }
}
