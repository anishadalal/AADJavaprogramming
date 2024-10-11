package collectionframework;
//1)add 
import java.util.Iterator;
public class Collection1 {

	public static void main(String[] args) {
		java.util.ArrayList<String> al = new java.util.ArrayList<>();
		al.add("Ravi"); 
		al.add("vijay");
		al.add("Ajay"); 
		al.add("Ram");
		Iterator<String> itr = al.iterator(); 
		while(itr.hasNext()) { 
			System.out.println(itr.next());
			}
		

	}

}
