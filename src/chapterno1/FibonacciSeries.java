package chapterno1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count = 10;  // Change this to generate more or fewer terms
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= count; i++) {
            System.out.print(num1 + " ");  // Print the current number
            int nextNum = num1 + num2;  // Calculate the next number
            num1 = num2;  // Update num1
            num2 = nextNum;  // Update num2
        }

	}

}
