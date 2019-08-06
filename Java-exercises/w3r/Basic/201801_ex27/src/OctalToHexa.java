// Convert a octal number to a hexadecimal number

import java.util.Scanner;

public class OctalToHexa {
    public static void main(String[] args) {

        String octalNumber, hexaNumber;
        int decimalNumber=0;

        Scanner in = new Scanner(System.in);
        System.out.print("Input octal number: ");
        octalNumber = in.nextLine();
        try {
            decimalNumber = Integer.parseInt(octalNumber, 8);
            hexaNumber=Integer.toHexString(decimalNumber);
            System.out.println("Hexadecimal value: " + hexaNumber);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}