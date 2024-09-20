package chapterno1;
import java.util.Scanner;
public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an octal number
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        // Convert octal to decimal manually
        int decimal = octalToDecimal(octalString);

        // Display the result
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close(); // Close the scanner
    }

    // Method to convert octal string to decimal integer
    public static int octalToDecimal(String octal) {
        int decimal = 0;

        // Convert octal to decimal
        for (int i = 0; i < octal.length(); i++) {
            int octalDigit = Character.getNumericValue(octal.charAt(octal.length() - 1 - i));
            decimal += octalDigit * Math.pow(8, i); // Using power of 8 for each digit
        }

        return decimal; // Return the decimal value

	}

}
