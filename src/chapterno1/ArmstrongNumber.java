package chapterno1;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int result = 0;
        int digits = 0;

        // Find the number of digits
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the sum of the power of each digit
        temp = number;
        while (temp != 0) {
            int remainder = temp % 10;
            result += Math.pow(remainder, digits);
            temp /= 10;
        }

        // Check if the number is an Armstrong number
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();

	}

}
