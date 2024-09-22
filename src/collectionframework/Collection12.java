package collectionframework;
//5. Sort
import java.util.Collections;
public class Collection12 {

	public static void main(String[] args) {
		java.util.ArrayList<String> names = new java.util.ArrayList<>();
		names.add("Charlie"); names.add("Alice"); 
		names.add("Bob");
		Collections.sort(names);
		System.out.println("Sorted names: " + names);

	}

}
