import java.util.Scanner;

public class DecimalToOctadecimalTwo {
    public static void main(String[] args) {
        int decimal, remainder;
        String octaDecimal="";

        char octa[]={'0','1','2','3','4','5','6','7'};

        Scanner in = new Scanner(System.in);
        System.out.print("Inpurt decimal number: ");
        decimal = in.nextInt();

        while (decimal>0){
            remainder=decimal%8;
            octaDecimal=octa[remainder]+octaDecimal;
            decimal/=8;
        }
        System.out.println("Octadecimal number is: " + octaDecimal);
    }
}
