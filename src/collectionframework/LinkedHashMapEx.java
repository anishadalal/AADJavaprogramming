package collectionframework;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapEx {

	public static void main(String[] args) {
		// Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Orange", 15);
        linkedHashMap.put("Mango", 5);

        // Display the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Retrieve a value using a key
        int appleQuantity = linkedHashMap.get("Apple");
        System.out.println("Quantity of Apples: " + appleQuantity);

        // Check if a key exists
        if (linkedHashMap.containsKey("Banana")) {
            System.out.println("Banana is in the LinkedHashMap.");
        } else {
            System.out.println("Banana is not in the LinkedHashMap.");
        }

        // Remove a key-value pair
        linkedHashMap.remove("Orange");
        System.out.println("After removing Orange: " + linkedHashMap);

        // Get the size of the LinkedHashMap
        System.out.println("Size of the LinkedHashMap: " + linkedHashMap.size());

        // Iterate over the LinkedHashMap entries
        System.out.println("LinkedHashMap entries:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
