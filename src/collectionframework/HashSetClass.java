package collectionframework;
import java.util.HashSet;
public class HashSetClass {

	public static void main(String[] args) {
		// Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists
        if (set.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        } else {
            System.out.println("Banana is not in the HashSet.");
        }

        // Remove an element
        set.remove("Orange");
        System.out.println("After removing Orange: " + set);

        // Get the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

	}

}
