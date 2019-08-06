import java.util.Scanner;

public class DecimalToHexadecimalTwo {
    public static void main(String[] args) {
        int decimal, remainder;
        String hexaDecimal="";

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner in = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        decimal = in.nextInt();

        while (decimal>0){
            remainder=decimal%16;
            hexaDecimal=hex[remainder]+hexaDecimal;
            decimal/=16;
        }
        System.out.println("Hexadecimal number is: " + hexaDecimal);
    }
}
