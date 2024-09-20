package chapterno1;
import java.util.Scanner;
public class LargestArrayElement {

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

        // Find the largest element
        int largest = array[0]; // Assume the first element is the largest
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if a larger element is found
            }
        }

        // Display the largest element
        System.out.println("The largest element in the array is: " + largest);

        scanner.close(); // Close the scanner

	}

}
