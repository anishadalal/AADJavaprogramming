import java.util.Scanner;  // For user input
import series.FibonacciSeries;  // Importing FibonacciSeries class from Series package
import series.CubeSeries;       // Importing CubeSeries class from Series package
import series.SquareSeries;     // Importing SquareSeries class from Series package

public class Main {

	public static void main(String[] args) {
		// Create scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Accept the value of n from the user
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        // Create objects of the series classes
        FibonacciSeries fibonacci = new FibonacciSeries();
        CubeSeries cube = new CubeSeries();
        SquareSeries square = new SquareSeries();

        // Generate the respective series
        fibonacci.printFibonacci(n);
        cube.printCube(n);
        square.printSquare(n);

        // Close the scanner
        scanner.close();

	}

}
