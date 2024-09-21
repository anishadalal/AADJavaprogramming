package series;

public class SquareSeries {
	// Method to print square of numbers up to n terms
    public void printSquare(int n) {
        System.out.println("Square of numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
}
