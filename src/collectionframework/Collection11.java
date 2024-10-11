package collectionframework;
//4.set
public class Collection11 {

	public static void main(String[] args) {
		java.util.ArrayList<String> items = new java.util.ArrayList<>(); 
		items.add("Item1");
		items.add("Item2"); 
		items.add("Item3");
		System.out.println("Original list: " + items); 
		items.set(0, "Item2"); 
		System.out.println("Original list: " + items);

	}

}
