package chapterno1;
import java.util.Scanner;
public class InsertionSort {

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

        // Insertion Sort algorithm
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Element to be inserted
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            // Place the key in the correct position
            array[j + 1] = key;
        }

        // Display sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close(); // Close the scanner

	}

}
