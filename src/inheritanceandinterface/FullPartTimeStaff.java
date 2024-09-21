package inheritanceandinterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class: Staff
abstract class Staff {
    protected String name;
    protected String address;

    // Constructor to initialize name and address
    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Method to display staff details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

// Subclass: FullTimeStaff
class FullTimeStaff extends Staff {
    private String department;
    private double salary;

    // Constructor to initialize department and salary
    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    // Implementing calculateSalary method
    @Override
    public double calculateSalary() {
        double hra = 0.08 * salary; // 8% of salary
        double da = 0.05 * salary;   // 5% of salary
        return salary + hra + da;    // Total salary
    }

    // Method to display details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Subclass: PartTimeStaff
class PartTimeStaff extends Staff {
    private int numberOfHours;
    private double ratePerHour;

    // Constructor to initialize number of hours and rate per hour
    public PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    // Implementing calculateSalary method
    @Override
    public double calculateSalary() {
        return numberOfHours * ratePerHour; // Total salary
    }

    // Method to display details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Main class to test the functionality
public class FullPartTimeStaff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<Staff> staffList = new ArrayList<>();

        // Accept number of staff members
        System.out.print("Enter the number of staff members: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create staff members based on user choice
        for (int i = 0; i < n; i++) {
            System.out.print("Is the staff member FullTime or PartTime? (F/P): ");
            char choice = scanner.nextLine().charAt(0);
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            if (choice == 'F' || choice == 'f') {
                System.out.print("Enter Department: ");
                String department = scanner.nextLine();
                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                staffList.add(new FullTimeStaff(name, address, department, salary));
            } else if (choice == 'P' || choice == 'p') {
                System.out.print("Enter Number of Hours: ");
                int numberOfHours = scanner.nextInt();
                System.out.print("Enter Rate per Hour: ");
                double ratePerHour = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                staffList.add(new PartTimeStaff(name, address, numberOfHours, ratePerHour));
            }
        }

        // Display details of all staff members
        System.out.println("\nDetails of Staff Members:");
        for (Staff staff : staffList) {
            staff.displayDetails();
            System.out.println("---------------------------");
        }

	}

}
