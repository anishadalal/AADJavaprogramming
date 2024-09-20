package chapterno1;
import java.util.Scanner;
public class HexadecimalToDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine();

        // Convert hexadecimal to decimal
        int decimal = hexadecimalToDecimal(hexString);

        // Display the result
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close(); // Close the scanner
    }

    // Method to convert hexadecimal string to decimal integer
    public static int hexadecimalToDecimal(String hex) {
        int decimal = 0;

        // Convert hexadecimal to decimal
        for (int i = 0; i < hex.length(); i++) {
            char hexDigit = hex.charAt(hex.length() - 1 - i);
            int value;

            // Check if the hex digit is a number or a letter
            if (Character.isDigit(hexDigit)) {
                value = Character.getNumericValue(hexDigit);
            } else {
                value = hexDigit - 'A' + 10; // Convert A-F to 10-15
            }

            // Add the value multiplied by the power of 16
            decimal += value * Math.pow(16, i);
        }

        return decimal; // Return the decimal value

	}

}
