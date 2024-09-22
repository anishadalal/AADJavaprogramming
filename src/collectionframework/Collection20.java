package collectionframework;
//6.remove
public class Collection20 {

	public static void main(String[] args) {
		java.util.LinkedList<String> names = new java.util.LinkedList<>(); 
		names.add("Charlie"); 
		names.add("Alice"); 
		names.add("Bob"); 
		System.out.println( names);
		names.remove(); 
		System.out.println( names);

	}

}
