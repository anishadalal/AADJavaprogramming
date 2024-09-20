package chapterno1;
import java.util.Scanner;
public class OctalToBinary {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter an octal number
	        System.out.print("Enter an octal number: ");
	        String octalString = scanner.nextLine();

	        // Convert octal to binary manually
	        String binaryString = octalToBinary(octalString);

	        // Display the result
	        System.out.println("Binary equivalent: " + binaryString);

	        scanner.close(); // Close the scanner
	    }

	    // Method to convert octal string to binary string
	    public static String octalToBinary(String octal) {
	        StringBuilder binary = new StringBuilder();

	        // Map of octal digits to their binary equivalents
	        String[] binaryMap = {
	            "000", "001", "010", "011", "100", "101", "110", "111"
	        };

	        // Convert each octal digit to binary
	        for (int i = 0; i < octal.length(); i++) {
	            int octalDigit = Character.getNumericValue(octal.charAt(i));
	            binary.append(binaryMap[octalDigit]); // Append corresponding binary representation
	        }

	        // Handle the case for octal "0"
	        if (binary.length() == 0) {
	            return "0";
	        }

	        return binary.toString(); // Return the binary string
	}

}
