package chapterno1;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		 int[] array = {5, 3, 8, 1, 2};  // Example array

	        // Sort the array in ascending order
	        Arrays.sort(array);

	        // Display the sorted array
	        System.out.print("Array elements in ascending order: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	}

}
