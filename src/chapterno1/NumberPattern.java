package chapterno1;

public class NumberPattern {

	public static void main(String[] args) {
		int rows = 4; // Number of rows for the pattern

        // Loop through the number of rows
        for (int i = 1; i <= rows; i++) {
            // Loop to print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print the number followed by a space
            }
            // Move to the next line after each row
            System.out.println();
        }

	}

}
