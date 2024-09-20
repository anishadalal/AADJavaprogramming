package chapterno1;
import java.util.Scanner;
public class SquareArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input side length
        System.out.print("Enter the length of the side of the square: ");
        double side = scanner.nextDouble();

        // Calculate area
        double area = side * side;

        // Display the area
        System.out.println("The area of the square is: " + area);

        scanner.close(); // Close the scanner

	}

}
