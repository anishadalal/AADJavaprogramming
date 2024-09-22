package collectionframework;
//6)replace 
public class Collection4 {

	public static void main(String[] args) {
		java.util.ArrayList<String> al = new java.util.ArrayList<>();
		al.add("Ravi");
		al.add("Ravi"); 
		al.add("Ravi"); 
		for(String obj:al) System.out.println(obj); 
		al.set(al.indexOf("Ravi"), "Rohit");
		System.out.println(al);

	}

}
