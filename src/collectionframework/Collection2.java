package collectionframework;
//two ways to iterate the element of collection in java 
//1. iterator interface 
//2.by using for-each loop
public class Collection2 {

	public static void main(String[] args) {
		java.util.ArrayList<String> al = new java.util.ArrayList<>(); 
		al.add("Ravi");
		al.add("Ravi"); 
		al.add("Ravi"); 
		for(String obj:al) System.out.println(obj);

	}

}
