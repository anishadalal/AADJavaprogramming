package chapterno1;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;  // You can change this to any positive integer
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Calculate factorial
        }

        System.out.println("Factorial of " + number + " is: " + factorial);	

	}

}
