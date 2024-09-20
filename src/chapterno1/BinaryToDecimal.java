package chapterno1;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Convert binary to decimal manually
        int decimal = binaryToDecimal(binaryString);

        // Display the result
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close(); // Close the scanner
    }

    // Method to convert binary string to decimal integer
    public static int binaryToDecimal(String binary) {
        int decimal = 0;

        // Convert binary to decimal
        for (int i = 0; i < binary.length(); i++) {
            // Calculate the power of 2 for each bit
            if (binary.charAt(binary.length() - 1 - i) == '1') {
                decimal += (1 << i); // Using bitwise left shift to calculate powers of 2
            }
        }

        return decimal; // Return the decimal value

	}

}
