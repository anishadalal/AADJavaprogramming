package chapterno1;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 12345;  // Change this to any number
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Build the reversed number
            number /= 10;  // Remove the last digit
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNumber);

	}

}
