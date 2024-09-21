package collectionframework;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapEx {

	public static void main(String[] args) {
		// Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 15);
        treeMap.put("Mango", 5);

        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Retrieve a value using a key
        int appleQuantity = treeMap.get("Apple");
        System.out.println("Quantity of Apples: " + appleQuantity);

        // Check if a key exists
        if (treeMap.containsKey("Banana")) {
            System.out.println("Banana is in the TreeMap.");
        } else {
            System.out.println("Banana is not in the TreeMap.");
        }

        // Remove a key-value pair
        treeMap.remove("Orange");
        System.out.println("After removing Orange: " + treeMap);

        // Get the size of the TreeMap
        System.out.println("Size of the TreeMap: " + treeMap.size());

        // Iterate over the TreeMap entries
        System.out.println("TreeMap entries:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
