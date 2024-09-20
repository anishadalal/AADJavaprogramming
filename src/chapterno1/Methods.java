package chapterno1;
//Class representing a Calculator
class Calculator {
 // Method to add two numbers
 public int add(int a, int b) {
     return a + b;
 }

 // Method to subtract two numbers
 public int subtract(int a, int b) {
     return a - b;
 }

 // Method to multiply two numbers
 public int multiply(int a, int b) {
     return a * b;
 }

 // Method to divide two numbers
 public double divide(int a, int b) {
     if (b != 0) {
         return (double) a / b; // Cast to double for precise division
     } else {
         System.out.println("Error: Division by zero");
         return 0; // Return 0 in case of division by zero
     }
 }
}
//Main class
public class Methods {

	public static void main(String[] args) {
		// Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Perform calculations
        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int product = calculator.multiply(10, 5);
        double quotient = calculator.divide(10, 5);
        
        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

	}

}
