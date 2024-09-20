package chapterno1;
import java.util.Scanner;
public class KrishnamurthyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Krishnamurthy number
        if (isKrishnamurthy(number)) {
            System.out.println(number + " is a Krishnamurthy number.");
        } else {
            System.out.println(number + " is not a Krishnamurthy number.");
        }

        scanner.close();
    }

    // Function to check if a number is a Krishnamurthy number
    public static boolean isKrishnamurthy(int number) {
        int sum = 0;
        int temp = number;

        // Calculate the sum of factorials of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit); // Find factorial of each digit and add it to sum
            temp /= 10;
        }

        // Return true if the sum of factorials equals the original number
        return sum == number;
    }

    // Function to calculate the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
	}

}
