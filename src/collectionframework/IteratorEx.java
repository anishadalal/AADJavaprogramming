package collectionframework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorEx {

	public static void main(String[] args) {
		// Create a List
        List<String> fruits = new ArrayList<>();

        // Add elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Create an Iterator
        Iterator<String> iterator = fruits.iterator();

        // Use the Iterator to traverse the List
        System.out.println("Fruits in the list:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Demonstrating removing an element using Iterator
        iterator = fruits.iterator(); // Reset the iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                iterator.remove(); // Remove "Banana"
            }
        }

        // Display the List after removal
        System.out.println("List after removing Banana: " + fruits);

	}

}
