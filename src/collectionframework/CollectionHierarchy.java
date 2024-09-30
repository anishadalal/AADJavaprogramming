package collectionframework;
import java.util.ArrayList;
import java.util.List;
class CollectionNode {
    String name;
    List<CollectionNode> children;

    // Constructor to initialize node with name and empty children list
    public CollectionNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    // Method to add child node
    public void addChild(CollectionNode child) {
        children.add(child);
    }

    // Recursive method to print hierarchy with indentation
    public void printHierarchy(String indent) {
        System.out.println(indent + name);
        for (CollectionNode child : children) {
            child.printHierarchy(indent + "    ");
        }
    }
}

public class CollectionHierarchy {

 public static void main(String[] args) {
	 // Create root node
     CollectionNode iterable = new CollectionNode("Iterable");

     // Create second level nodes
     CollectionNode collection = new CollectionNode("Collection");
     iterable.addChild(collection);

     // Create third level nodes
     CollectionNode list = new CollectionNode("List");
     CollectionNode queue = new CollectionNode("Queue");
     CollectionNode set = new CollectionNode("Set");
     collection.addChild(list);
     collection.addChild(queue);
     collection.addChild(set);

     // Add nodes to List
     list.addChild(new CollectionNode("ArrayList"));
     list.addChild(new CollectionNode("LinkedList"));
     CollectionNode vector = new CollectionNode("Vector");
     list.addChild(vector);
     vector.addChild(new CollectionNode("Stack"));

     // Add nodes to Queue
     queue.addChild(new CollectionNode("PriorityQueue"));
     CollectionNode deque = new CollectionNode("Deque");
     queue.addChild(deque);
     deque.addChild(new CollectionNode("ArrayDeque"));

     // Add nodes to Set
     set.addChild(new CollectionNode("HashSet"));
     set.addChild(new CollectionNode("LinkedHashSet"));
     CollectionNode sortedSet = new CollectionNode("SortedSet");
     set.addChild(sortedSet);
     sortedSet.addChild(new CollectionNode("TreeSet"));

     // Print the hierarchy
     iterable.printHierarchy("");
 }
}