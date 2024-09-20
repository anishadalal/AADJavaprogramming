package chapterno1;

public class Factors {

	public static void main(String[] args) {
		int number = 12;  // Change this to any positive integer

        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");  // Print the factor
            }
        }

	}

}
