package collectionframework;
import java.util.LinkedList;
public class LinkedListUnionIntersection {

	public static void main(String[] args) {
		 // Create two LinkedLists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Adding elements to the first LinkedList
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        // Adding elements to the second LinkedList
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Display the original LinkedLists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Perform union of the two LinkedLists
        LinkedList<Integer> unionList = new LinkedList<>(list1);
        for (Integer num : list2) {
            if (!unionList.contains(num)) {
                unionList.add(num);
            }
        }
        System.out.println("Union: " + unionList);

        // Perform intersection of the two LinkedLists
        LinkedList<Integer> intersectionList = new LinkedList<>();
        for (Integer num : list1) {
            if (list2.contains(num)) {
                intersectionList.add(num);
            }
        }
        System.out.println("Intersection: " + intersectionList);

	}

}
