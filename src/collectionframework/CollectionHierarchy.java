package collectionframework;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionHierarchy {

	public static void main(String[] args) {
		// List examples
        List<String> arrayList = new ArrayList<String>();  // Specify generic type String
        arrayList.add("ArrayList Item 1");
        arrayList.add("ArrayList Item 2");
        System.out.println("ArrayList: " + arrayList);
        
        List<String> linkedList = new LinkedList<String>();  // Specify generic type String
        linkedList.add("LinkedList Item 1");
        linkedList.add("LinkedList Item 2");
        System.out.println("LinkedList: " + linkedList);
        
        Vector<String> vector = new Vector<String>();  // Specify generic type String
        vector.add("Vector Item 1");
        vector.add("Vector Item 2");
        System.out.println("Vector: " + vector);
        
        Stack<String> stack = new Stack<String>();  // Specify generic type String
        stack.push("Stack Item 1");
        stack.push("Stack Item 2");
        System.out.println("Stack: " + stack);

        // Queue examples
        Queue<String> priorityQueue = new PriorityQueue<String>();  // Specify generic type String
        priorityQueue.add("PriorityQueue Item 1");
        priorityQueue.add("PriorityQueue Item 2");
        System.out.println("PriorityQueue: " + priorityQueue);

        Deque<String> arrayDeque = new ArrayDeque<String>();  // Specify generic type String
        arrayDeque.add("ArrayDeque Item 1");
        arrayDeque.add("ArrayDeque Item 2");
        System.out.println("ArrayDeque: " + arrayDeque);
        
        // Set examples
        Set<String> hashSet = new HashSet<String>();  // Specify generic type String
        hashSet.add("HashSet Item 1");
        hashSet.add("HashSet Item 2");
        System.out.println("HashSet: " + hashSet);
        
        Set<String> linkedHashSet = new LinkedHashSet<String>();  // Specify generic type String
        linkedHashSet.add("LinkedHashSet Item 1");
        linkedHashSet.add("LinkedHashSet Item 2");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        SortedSet<String> treeSet = new TreeSet<String>();  // Specify generic type String
        treeSet.add("TreeSet Item 1");
        treeSet.add("TreeSet Item 2");
        System.out.println("TreeSet: " + treeSet);
	}

}
