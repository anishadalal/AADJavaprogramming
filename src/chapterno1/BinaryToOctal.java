package chapterno1;
import java.util.Scanner;
public class BinaryToOctal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Convert binary to octal manually
        String octalString = binaryToOctal(binaryString);

        // Display the result
        System.out.println("Octal equivalent: " + octalString);

        scanner.close(); // Close the scanner
    }

    // Method to convert binary string to octal string
    public static String binaryToOctal(String binary) {
        // First, convert binary to decimal
        int decimal = 0;

        // Convert binary to decimal
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(binary.length() - 1 - i) == '1') {
                decimal += (1 << i); // Using bitwise left shift to calculate powers of 2
            }
        }

        // Now convert decimal to octal
        StringBuilder octal = new StringBuilder();
        if (decimal == 0) {
            return "0"; // Handle the case for binary "0"
        }

        while (decimal > 0) {
            int remainder = decimal % 8; // Get remainder for octal digit
            octal.insert(0, remainder); // Append digit to the front
            decimal /= 8; // Reduce decimal for next octal digit
        }

        return octal.toString(); // Return the octal string

	}

}
