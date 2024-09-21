package collectionframework;
import java.util.LinkedList;
public class LinkedListOperationsEx {

	public static void main(String[] args) {
		// Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Display the LinkedList
        System.out.println("Fruits: " + fruits);

        // Retrieving an element
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Updating an element
        fruits.set(1, "Pineapple"); // Change "Banana" to "Pineapple"
        System.out.println("After updating, Fruits: " + fruits);

        // Removing an element
        fruits.remove("Orange"); // Remove "Orange"
        System.out.println("After removing Orange, Fruits: " + fruits);

        // Checking size of the LinkedList
        int size = fruits.size();
        System.out.println("Size of the LinkedList: " + size);

        // Iterating over the LinkedList
        System.out.println("Iterating through the fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

	}

}
