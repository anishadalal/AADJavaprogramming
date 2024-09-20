package chapterno1;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDescending {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n]; // Use int array

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array in descending order
        Arrays.sort(array); // Sort in ascending order

        // Reverse the array for descending order
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Output the sorted array
        System.out.println("Array sorted in descending order: " + Arrays.toString(array));

        scanner.close();

	}

}
