package collectionframework;
//2. adding names with index
public class Collection15 {

	public static void main(String[] args) {
		java.util.LinkedList<String> names = new java.util.LinkedList<>(); 
		names.add("Charlie");
		names.add("Alice"); 
		names.add("Bob"); 
		System.out.println( names);
		names.addFirst("Ram"); 
		System.out.println( names); 
		names.addLast("Rajkumar");
		System.out.println( names);
		names.add("Rani");
		System.out.println( names);

	}

}
