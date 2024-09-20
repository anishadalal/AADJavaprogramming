package chapterno1;
import java.util.Scanner;
public class OctalToHexadecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an octal number
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        // Convert octal to hexadecimal manually
        String hexadecimalString = octalToHexadecimal(octalString);

        // Display the result
        System.out.println("Hexadecimal equivalent: " + hexadecimalString);

        scanner.close(); // Close the scanner
    }

    // Method to convert octal string to hexadecimal string
    public static String octalToHexadecimal(String octal) {
        // First, convert octal to decimal
        int decimal = 0;

        // Convert octal to decimal
        for (int i = 0; i < octal.length(); i++) {
            int octalDigit = Character.getNumericValue(octal.charAt(octal.length() - 1 - i));
            decimal += octalDigit * Math.pow(8, i); // Using power of 8 for each digit
        }

        // Now convert decimal to hexadecimal
        StringBuilder hex = new StringBuilder();
        if (decimal == 0) {
            return "0"; // Handle the case for octal "0"
        }

        while (decimal > 0) {
            int remainder = decimal % 16; // Get remainder for hex digit
            if (remainder < 10) {
                hex.insert(0, remainder); // Append digit
            } else {
                hex.insert(0, (char) ('A' + remainder - 10)); // Convert to hex letter
            }
            decimal /= 16; // Reduce decimal for next hex digit
        }

        return hex.toString(); // Return the hexadecimal string

	}

}
