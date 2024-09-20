package chapterno1;

public class SwapVariables {

	public static void main(String[] args) {
		int a = 5; // First variable
        int b = 10; // Second variable

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swap without using a temporary variable
        a = a + b; // Step 1: a now holds the sum of a and b
        b = a - b; // Step 2: b now holds the original value of a
        a = a - b; // Step 3: a now holds the original value of b

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);

	}

}
