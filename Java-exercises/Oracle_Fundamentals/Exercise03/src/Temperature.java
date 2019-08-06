import java.util.Scanner;

public class Temperature {

    float fahrenheit, celsius;

    public void calculateCelsius(){

        System.out.print("Input temperature in Fahrenheit: ");
        Scanner in = new Scanner(System.in);
        fahrenheit = in.nextFloat();

        celsius = ((fahrenheit-32)*5/9);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
