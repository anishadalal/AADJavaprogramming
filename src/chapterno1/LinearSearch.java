package chapterno1;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n]; // Create an array

	        // Input array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        // Input the target value to search for
	        System.out.print("Enter the value to search for: ");
	        int target = scanner.nextInt();

	        // Perform Linear Search
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (array[i] == target) {
	                System.out.println("Value " + target + " found at index " + i);
	                found = true;
	                break; // Exit the loop once the target is found
	            }
	        }

	        if (!found) {
	            System.out.println("Value " + target + " not found in the array.");
	        }

	        scanner.close(); // Close the scanner

	}

}
