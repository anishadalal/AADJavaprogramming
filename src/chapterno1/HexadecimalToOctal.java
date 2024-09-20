package chapterno1;
import java.util.Scanner;
public class HexadecimalToOctal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hexString = scanner.nextLine();

        // Convert hexadecimal to octal
        String octalString = hexadecimalToOctal(hexString);

        // Display the result
        System.out.println("Octal equivalent: " + octalString);

        scanner.close(); // Close the scanner
    }

    // Method to convert hexadecimal string to octal string
    public static String hexadecimalToOctal(String hex) {
        // First, convert hexadecimal to decimal
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

        // Now convert decimal to octal
        StringBuilder octal = new StringBuilder();
        if (decimal == 0) {
            return "0"; // Handle the case for hexadecimal "0"
        }

        while (decimal > 0) {
            int remainder = decimal % 8; // Get remainder for octal digit
            octal.insert(0, remainder); // Append digit to the front
            decimal /= 8; // Reduce decimal for next octal digit
        }

        return octal.toString(); // Return the octal string

	}

}
