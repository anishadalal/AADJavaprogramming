package chapterno1;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Input a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is prime
	        boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false; // Numbers less than or equal to 1 are not prime
	        } else {
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false; // Found a divisor, not prime
	                    break;
	                }
	            }
	        }

	        // Output the result
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close(); // Close the scanner

	}

}
