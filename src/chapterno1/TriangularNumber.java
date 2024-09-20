package chapterno1;
import java.util.Scanner;
public class TriangularNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a triangular number
        boolean isTriangular = checkTriangular(number);

        // Output the result
        if (isTriangular) {
            System.out.println(number + " is a Triangular number.");
        } else {
            System.out.println(number + " is not a Triangular number.");
        }

        scanner.close();
    }

    // Function to check if a number is triangular
    public static boolean checkTriangular(int number) {
        int sum = 0;
        for (int n = 1; sum < number; n++) {
            sum += n; // Calculate the sum of natural numbers
            if (sum == number) {
                return true; // If sum matches the number, it's triangular
            }
        }
        return false; // If sum exceeds the number, it's not triangular

	}

}
