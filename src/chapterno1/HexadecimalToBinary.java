package chapterno1;
import java.util.Scanner;
public class HexadecimalToBinary {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a hexadecimal number
	        System.out.print("Enter a hexadecimal number: ");
	        String hexString = scanner.nextLine();

	        // Convert hexadecimal to binary
	        String binaryString = hexadecimalToBinary(hexString);

	        // Display the result
	        System.out.println("Binary equivalent: " + binaryString);

	        scanner.close(); // Close the scanner
	    }

	    // Method to convert hexadecimal string to binary string
	    public static String hexadecimalToBinary(String hex) {
	        StringBuilder binary = new StringBuilder();

	        // Map of hexadecimal digits to their binary equivalents
	        String[] binaryMap = {
	            "0000", "0001", "0010", "0011",
	            "0100", "0101", "0110", "0111",
	            "1000", "1001", "1010", "1011",
	            "1100", "1101", "1110", "1111"
	        };

	        // Convert each hexadecimal digit to binary
	        for (int i = 0; i < hex.length(); i++) {
	            char hexDigit = hex.charAt(i);
	            int index = Character.getNumericValue(hexDigit);
	            // For letters A-F, convert to the corresponding index
	            if (hexDigit >= 'A' && hexDigit <= 'F') {
	                index = 10 + (hexDigit - 'A');
	            }
	            binary.append(binaryMap[index]); // Append corresponding binary representation
	        }

	        // Handle the case for hexadecimal "0"
	        if (binary.length() == 0) {
	            return "0";
	        }

	        return binary.toString(); // Return the binary string

	}

}
