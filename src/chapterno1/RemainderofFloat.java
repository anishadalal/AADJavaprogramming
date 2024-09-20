package chapterno1;

public class RemainderofFloat {

	public static void main(String[] args) {
		float num1 = 10.5f;  // First float number
        float num2 = 3.2f;   // Second float number

        // Calculate remainder using the fmod method
        float remainder = num1 - (int)(num1 / num2) * num2;

        System.out.println("Remainder of " + num1 + " divided by " + num2 + " is: " + remainder);

	}

}
