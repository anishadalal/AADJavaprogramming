package series;

public class FibonacciSeries {
	 // Method to print Fibonacci series up to n terms
    public void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
}
}
