package chapterno1;

public class AsteriskPattern {

	public static void main(String[] args) {
		int rows = 3; // Number of rows for the pattern

        // Loop through the number of rows
        for (int i = 1; i <= rows; i++) {
            // Print asterisks for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

	}

}
