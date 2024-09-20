package chapterno1;
import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        scanner.close(); // Close the scanner

	}

}
