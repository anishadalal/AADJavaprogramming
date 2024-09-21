package collectionframework;
import java.util.Vector;
public class VectorClass {

	public static void main(String[] args) {
		 // Creating a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Grapes");

        // Displaying the elements in the Vector
        System.out.println("Vector elements: " + vector);

        // Accessing elements using index
        System.out.println("Element at index 2: " + vector.get(2));

        // Inserting an element at a specific index
        vector.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + vector);

        // Removing an element
        vector.remove("Banana");
        System.out.println("After removing Banana: " + vector);

        // Checking if Vector contains an element
        if (vector.contains("Apple")) {
            System.out.println("Apple is in the Vector.");
        }

        // Getting the size of the Vector
        System.out.println("Size of the Vector: " + vector.size());

        // Iterating through the Vector elements
        System.out.println("Iterating through the Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

	}

}
