package collectionframework;
//removeAll
import java.util.Iterator;
public class Collection5 {

	    public static void main(String[] args) {
	        java.util.ArrayList<String> al = new java.util.ArrayList<>();
	        al.add("Ravi");
	        al.add("Sonoo");  // Add a different element

	        java.util.ArrayList<String> al2 = new java.util.ArrayList<>();
	        al2.add("Ravi");
	        al2.add("Sima");  // Add another different element

	        al.removeAll(al2);  // Only "Ravi" will be removed

	        Iterator<String> itr = al.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());  // Should print "s\Sonoo"
		}

	}

}
