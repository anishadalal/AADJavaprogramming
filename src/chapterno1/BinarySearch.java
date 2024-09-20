package chapterno1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n]; // Create an array

        // Input array elements
        System.out.println("Enter the elements of the array (must be sorted):");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Input the target value to search for
        System.out.print("Enter the value to search for: ");
        int target = scanner.nextInt();

        // Perform Binary Search
        int result = binarySearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Value " + target + " not found in the array.");
        } else {
            System.out.println("Value " + target + " found at index " + result);
        }

        scanner.close(); // Close the scanner
    }

    // Binary Search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid; // Target found
            }
            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;

	}

}
