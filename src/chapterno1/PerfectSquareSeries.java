package chapterno1;

public class PerfectSquareSeries {

	public static void main(String[] args) {
		int count = 10;  // Change this to generate more or fewer perfect squares

        System.out.print("Perfect Square Series: ");

        for (int i = 1; i <= count; i++) {
            int perfectSquare = i * i;  // Calculate the perfect square
            System.out.print(perfectSquare + " ");  // Print the perfect square
        }

	}

}
