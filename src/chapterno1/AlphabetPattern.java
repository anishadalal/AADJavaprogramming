package chapterno1;

public class AlphabetPattern {

	public static void main(String[] args) {
		int rows = 4; // Number of rows to print

        for (int i = 1; i <= rows; i++) {
            // Print letters from A to the i-th letter
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(); // Move to the next line
        }

	}

}
