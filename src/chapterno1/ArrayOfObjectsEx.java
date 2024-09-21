package chapterno1;
import java.util.Scanner;
public class ArrayOfObjectsEx {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Define the number of pupils
	        System.out.print("Enter the number of pupils: ");
	        int numberOfPupils = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        // Create an array of Pupil objects
	        Pupil[] pupils = new Pupil[numberOfPupils];

	        // Input pupil details
	        for (int i = 0; i < numberOfPupils; i++) {
	            System.out.println("Enter details for pupil " + (i + 1) + ":");

	            System.out.print("Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            System.out.print("Major: ");
	            String major = scanner.nextLine();

	            // Create a new Pupil object and add it to the array
	            pupils[i] = new Pupil(name, age, major);
	        }

	        // Display all pupils' details
	        System.out.println("\nPupil Details:");
	        for (Pupil pupil : pupils) {
	            pupil.displayDetails();
	        }

	        scanner.close();

	}

}
