package chapterno1;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Reverse the string
	        String reversed = reverseString(input);

	        // Display the reversed string
	        System.out.println("Reversed string: " + reversed);

	        scanner.close(); // Close the scanner
	    }

	    // Method to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();

	}

}
