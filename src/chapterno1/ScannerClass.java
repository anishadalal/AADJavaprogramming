package chapterno1;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer input

        System.out.println("Your age is: " + age);

        // Close the scanner
        scanner.close();

	}

}
