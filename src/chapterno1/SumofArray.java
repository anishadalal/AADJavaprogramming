package chapterno1;

public class SumofArray {

	public static void main(String[] args) {
		int[] array = {2, 4, 5, 8, 10};  // Example array

        // Calculate the sum of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;  // Add each element to sum
        }

        // Display the result
        System.out.println("Sum of array elements: " + sum);

	}

}
