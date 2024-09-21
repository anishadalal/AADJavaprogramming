package collectionframework;
import java.util.TreeSet;
public class TreeSetClass {

	public static void main(String[] args) {
		 // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Banana"); // Duplicate element

        // Display the TreeSet
        System.out.println("TreeSet (sorted): " + treeSet);

        // Check if an element exists
        if (treeSet.contains("Apple")) {
            System.out.println("Apple is in the TreeSet.");
        } else {
            System.out.println("Apple is not in the TreeSet.");
        }

        // Remove an element
        treeSet.remove("Orange");
        System.out.println("After removing Orange: " + treeSet);

        // Get the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

	}

}
