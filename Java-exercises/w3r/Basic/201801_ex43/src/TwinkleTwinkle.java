/*Write a Java program to print the following string in a specific format
        Sample Output

        Twinkle, twinkle, little star,
            How I wonder what you are!
                Up above the world so high,
                Like a diamond in the sky.
        Twinkle, twinkle, little star,
            How I wonder what you are*/

public class TwinkleTwinkle {
    public static void twinkleDisplay(){
        System.out.println("\nTwinkle, twinkle, little star,\n\tHow I wonder what you are!" +
                "\n\t\tUp above the world so high,\n\t\tLike a diamond in the sky.\nTwinkle, twinkle, little star,\n\tHow I wonder what you are.");
    }

    public static void main(String[] args) {
        twinkleDisplay();
    }
}
