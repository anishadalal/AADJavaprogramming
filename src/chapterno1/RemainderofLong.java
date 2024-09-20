package chapterno1;

public class RemainderofLong {

	public static void main(String[] args) {
		double num1 = 10.5;  // First double number
        double num2 = 3.2;   // Second double number

        // Calculate remainder using the formula
        double remainder = num1 - Math.floor(num1 / num2) * num2;

        System.out.println("Remainder of " + num1 + " divided by " + num2 + " is: " + remainder);

	}

}
