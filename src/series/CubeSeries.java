package series;

public class CubeSeries {
	// Method to print cube of numbers up to n terms
    public void printCube(int n) {
        System.out.println("Cube of numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i * i + " ");
        }
        System.out.println();
}
}