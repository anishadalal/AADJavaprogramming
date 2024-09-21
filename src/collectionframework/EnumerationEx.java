package collectionframework;
import java.util.Enumeration;
import java.util.Vector;
public class EnumerationEx {

	public static void main(String[] args) {
		// Create a Vector
        Vector<String> fruits = new Vector<>();

        // Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Create an Enumeration
        Enumeration<String> enumeration = fruits.elements();

        // Use the Enumeration to traverse the Vector
        System.out.println("Fruits in the vector:");
        while (enumeration.hasMoreElements()) {
            String fruit = enumeration.nextElement();
            System.out.println(fruit);
        }

        // Example of removing an element (using index) from the Vector
        fruits.remove("Banana");
        System.out.println("\nList after removing Banana: " + fruits);

	}

}
