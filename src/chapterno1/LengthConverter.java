package chapterno1;
import java.util.Scanner;
public class LengthConverter {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Length Converter");
	        System.out.println("1. Convert Meter to Centimeter");
	        System.out.println("2. Convert Centimeter to Meter");
	        System.out.print("Choose an option (1 or 2): ");
	        int choice = scanner.nextInt();

	        if (choice == 1) {
	            System.out.print("Enter length in meters: ");
	            double meters = scanner.nextDouble();
	            double centimeters = meters * 100; // 1 meter = 100 centimeters
	            System.out.println(meters + " meters is equal to " + centimeters + " centimeters.");
	        } else if (choice == 2) {
	            System.out.print("Enter length in centimeters: ");
	            double centimeters = scanner.nextDouble();
	            double meters = centimeters / 100; // 1 centimeter = 0.01 meters
	            System.out.println(centimeters + " centimeters is equal to " + meters + " meters.");
	        } else {
	            System.out.println("Invalid option. Please choose 1 or 2.");
	        }

	        scanner.close();
	}

}
