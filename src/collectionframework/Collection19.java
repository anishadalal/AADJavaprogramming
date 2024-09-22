package collectionframework;
//5 .set
public class Collection19 {

	public static void main(String[] args) {
		java.util.LinkedList<String> names = new java.util.LinkedList<>(); 
		names.add("Charlie");
		names.add("Alice");
		names.add("Bob"); 
		System.out.println( names);
		names.set(0, "Sham"); 
		System.out.println( names);

	}

}
