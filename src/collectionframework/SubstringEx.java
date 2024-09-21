package collectionframework;

public class SubstringEx {

	public static void main(String[] args) {
		 // Original string
        String originalString = "Hello, World!";

        // Extracting a substring from index 7 to the end
        String substring1 = originalString.substring(7);
        System.out.println("Substring from index 7: " + substring1);

        // Extracting a substring from index 0 to index 5
        String substring2 = originalString.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring2);

        // Extracting a substring using different indices
        String substring3 = originalString.substring(5, 7);
        System.out.println("Substring from index 5 to 7: " + substring3);

        // Attempting to extract a substring with invalid indices (for demonstration)
        try {
            String invalidSubstring = originalString.substring(13); // This will be out of bounds
            System.out.println("Invalid substring: " + invalidSubstring);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
