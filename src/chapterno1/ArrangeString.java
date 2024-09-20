package chapterno1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrangeString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Arrange the string
        String sortedString = sortString(input);

        // Output the sorted string
        System.out.println("Sorted string: " + sortedString);

        scanner.close();
    }

    // Function to sort the characters of a string
    public static String sortString(String str) {
        // Convert string to char array
        char[] charArray = str.toCharArray();

        // Sort the char array
        Arrays.sort(charArray);

        // Convert char array back to string
        return new String(charArray);

	}

}
