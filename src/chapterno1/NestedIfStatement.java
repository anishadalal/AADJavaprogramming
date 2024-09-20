package chapterno1;
import java.util.Scanner;
public class NestedIfStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the score
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        // Check if the score is valid
        if (score >= 0 && score <= 100) {
            // Nested if to determine the grade
            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else if (score >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        } else {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        }

        scanner.close(); // Close the scanner
		

	}

}
