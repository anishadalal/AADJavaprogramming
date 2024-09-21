package collectionframework;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorEx {

	public static void main(String[] args) {
		 // Create a List
        List<String> fruits = new ArrayList<>();

        // Add elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Create a ListIterator
        ListIterator<String> listIterator = fruits.listIterator();

        // Traverse the List in forward direction
        System.out.println("Fruits in forward order:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        // Traverse the List in backward direction
        System.out.println("\nFruits in backward order:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }

        // Inserting an element using ListIterator
        listIterator = fruits.listIterator(); // Reset the iterator
        listIterator.next(); // Move to the first element
        listIterator.add("Kiwi"); // Insert "Kiwi" before the first element

        // Display the List after insertion
        System.out.println("\nList after adding Kiwi: " + fruits);

	}

}
