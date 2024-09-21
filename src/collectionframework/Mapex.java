package collectionframework;
import java.util.HashMap;
import java.util.Map;
public class Mapex {

	public static void main(String[] args) {
		// Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the Map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 15);
        map.put("Mango", 5);

        // Display the Map
        System.out.println("Map: " + map);

        // Retrieve a value using a key
        int appleQuantity = map.get("Apple");
        System.out.println("Quantity of Apples: " + appleQuantity);

        // Check if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is in the map.");
        } else {
            System.out.println("Banana is not in the map.");
        }

        // Remove a key-value pair
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);

        // Get the size of the Map
        System.out.println("Size of the Map: " + map.size());

        // Iterate over the Map entries
        System.out.println("Map entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
