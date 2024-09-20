package chapterno1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferdReader {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine(); // Read input from console

            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }

	}

}
