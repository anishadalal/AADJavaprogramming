package collectionframework;
//3. Clear
public class Collection10 {

	public static void main(String[] args) {
		java.util.ArrayList<String> items = new java.util.ArrayList<>(); 
		items.add("Item1");
		items.add("Item2"); 
		items.add("Item3");
		System.out.println("Original list: " + items); 
		// Clearing the list 
		items.clear();
		System.out.println("List after clearing: " + items);

	}

}
