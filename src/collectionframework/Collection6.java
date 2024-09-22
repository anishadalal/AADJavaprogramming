package collectionframework;
//4) retainAll
import java.util.Iterator;
public class Collection6 {

	public static void main(String[] args) {
		java.util.ArrayList<String> al = new java.util.ArrayList<>(); 
		al.add("Ravi"); al.add("Ravi");
		al.add("Ravi"); 
		java.util.ArrayList<String> al2 = new java.util.ArrayList<>(); 
		al2.add("Ravi"); al2.add("Ravi"); 
		al.retainAll(al2); 
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) { System.out.println(itr.next());
		}

	}

}
