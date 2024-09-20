package chapterno1;

public class SquareAsteriskPattern {

	public static void main(String[] args) {
		 int rows = 4; // Number of rows for the pattern
	        int columns = 4; // Number of columns for the pattern

	        // Loop through the number of rows
	        for (int i = 1; i <= rows; i++) {
	            // Loop through the number of columns
	            for (int j = 1; j <= columns; j++) {
	                System.out.print("*"); // Print an asterisk
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }

	}

}
