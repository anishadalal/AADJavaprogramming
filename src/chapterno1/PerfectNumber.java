package chapterno1;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Find the sum of divisors of the number (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == number) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }

        scanner.close();

	}

}
