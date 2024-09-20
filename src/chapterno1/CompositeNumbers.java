package chapterno1;
import java.util.Scanner;

public class CompositeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input range from the user
        System.out.print("Enter the range (starting number): ");
        int start = scanner.nextInt();
        System.out.print("Enter the range (ending number): ");
        int end = scanner.nextInt();

        System.out.println("Composite numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isComposite(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    // Function to check if a number is composite
    public static boolean isComposite(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not composite
        }

        int divisorCount = 0;

        // Check if the number has more than two divisors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisorCount++;
            }
        }

        return divisorCount > 2; // A composite number has more than two divisors
	}

}
