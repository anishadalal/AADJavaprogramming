package collectionframework;
//2. adding names with index
public class Collection8 {

	public static void main(String[] args) {
		java.util.ArrayList<String> Name = new java.util.ArrayList<>();
		Name.add("Ankit");
		Name.add("Anish"); 
		Name.add("Ashish"); 
		System.out.println(Name);
		Name.add("Ram");
		System.out.println(Name); 
		Name.add(1,"Seeta"); 
		System.out.println(Name); 
		Name.add(0,"Gita"); 
		System.out.println(Name);

	}

}
