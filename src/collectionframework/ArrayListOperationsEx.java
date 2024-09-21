package collectionframework;
import java.util.ArrayList;
public class ArrayListOperationsEx {

	public static void main(String[] args) {
		 // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Display the ArrayList
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

        // Checking size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // Iterating over the ArrayList
        System.out.println("Iterating through the fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

	}

}
