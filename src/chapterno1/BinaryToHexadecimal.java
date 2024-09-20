package chapterno1;
import java.util.Scanner;
public class BinaryToHexadecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Convert binary to hexadecimal manually
        String hexadecimalString = binaryToHex(binaryString);

        // Display the result
        System.out.println("Hexadecimal equivalent: " + hexadecimalString);

        scanner.close(); // Close the scanner
    }

    // Method to convert binary string to hexadecimal string
    public static String binaryToHex(String binary) {
        StringBuilder hex = new StringBuilder();
        int decimal = 0;

        // Convert binary to decimal
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(binary.length() - 1 - i) == '1') {
                decimal += (1 << i); // Using bitwise left shift to calculate powers of 2
            }
        }

        // Convert decimal to hexadecimal
        while (decimal > 0) {
            int remainder = decimal % 16; // Get remainder for hex digit
            if (remainder < 10) {
                hex.insert(0, remainder); // Append digit
            } else {
                hex.insert(0, (char) ('A' + remainder - 10)); // Convert to hex letter
            }
            decimal /= 16; // Reduce decimal for next hex digit
        }

        return hex.length() > 0 ? hex.toString() : "0"; // Return "0" if hex is empty

	}

}
