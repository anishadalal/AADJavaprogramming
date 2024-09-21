package collectionframework;
import java.util.Hashtable;
public class HashtableEx {

	public static void main(String[] args) {
		// Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put("Apple", 10);
        hashtable.put("Banana", 20);
        hashtable.put("Orange", 15);
        hashtable.put("Mango", 5);

        // Display the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Retrieve a value using a key
        int appleQuantity = hashtable.get("Apple");
        System.out.println("Quantity of Apples: " + appleQuantity);

        // Check if a key exists
        if (hashtable.containsKey("Banana")) {
            System.out.println("Banana is in the Hashtable.");
        } else {
            System.out.println("Banana is not in the Hashtable.");
        }

        // Remove a key-value pair
        hashtable.remove("Orange");
        System.out.println("After removing Orange: " + hashtable);

        // Get the size of the Hashtable
        System.out.println("Size of the Hashtable: " + hashtable.size());

        // Iterate over the Hashtable entries
        System.out.println("Hashtable entries:");
        for (String key : hashtable.keySet()) {
            System.out.println(key + ": " + hashtable.get(key));
        }

	}

}
