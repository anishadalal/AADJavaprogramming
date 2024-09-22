package collectionframework;
//6.clear

public class Collection13 {

	public static void main(String[] args) {
		java.util.ArrayList<String> names = new java.util.ArrayList<>(); 
		names.add("Charlie");
		names.add("Alice");
		names.add("Bob"); 
		System.out.println( names); 
		names.clear();
		System.out.println("listed names: " + names);

	}

}
