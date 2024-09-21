package chapterno1;
import java.util.Scanner;
public class SGPAtoPercentage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt user for SGPA input
        System.out.print("Enter your SGPA: ");
        double sgpa = scanner.nextDouble();

        // Convert SGPA to percentage
        double percentage = convertSGPAToPercentage(sgpa);

        // Display the result
        System.out.printf("Your percentage is: %.2f%%\n", percentage);

        scanner.close();
    }

    // Method to convert SGPA to percentage
    public static double convertSGPAToPercentage(double sgpa) {
        // Conversion formula (example: SGPA * 10)
        return sgpa * 10;

	}

}
