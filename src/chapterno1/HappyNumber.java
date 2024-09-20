package chapterno1;
import java.util.Scanner;
public class HappyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number to check if it's Happy: ");
        int number = scanner.nextInt();

        if (isHappy(number)) {
            System.out.println(number + " is a Happy number.");
        } else {
            System.out.println(number + " is not a Happy number.");
        }

        scanner.close();
    }

    // Function to check if a number is a Happy number
    public static boolean isHappy(int number) {
        int slow = number;
        int fast = number;

        do {
            slow = findSquareSum(slow);         // Move slow pointer by one step
            fast = findSquareSum(findSquareSum(fast)); // Move fast pointer by two steps

            // If fast reaches 1, the number is happy
            if (fast == 1) {
                return true;
            }
        } while (slow != fast);

        return false; // If cycle is detected, it's not a happy number
    }

    // Function to find the sum of squares of digits
    public static int findSquareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;

	}

}
