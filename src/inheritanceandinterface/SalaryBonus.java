package inheritanceandinterface;
import java.util.Scanner;

//Base class: Employees
class Employees {
 protected int id;
 protected String name;
 protected double salary;

 // Default constructor
 public Employees() {
     this.id = 0;
     this.name = "";
     this.salary = 0.0;
 }

 // Method to accept employee details
 public void accept() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter Employee ID: ");
     id = scanner.nextInt();
     System.out.print("Enter Employee Name: ");
     name = scanner.next();
     System.out.print("Enter Employee Salary: ");
     salary = scanner.nextDouble();
 }

 // Method to display employee details
 public void display() {
     System.out.println("Employee ID: " + id);
     System.out.println("Employee Name: " + name);
     System.out.println("Employee Salary: " + salary);
 }
}

//Subclass: Manager
class Manager extends Employees {
 private double bonus;

 // Default constructor
 public Manager() {
     super(); // Call the Employees constructor
     this.bonus = 0.0;
 }

 // Method to accept manager details including bonus
 @Override
 public void accept() {
     super.accept(); // Call the Employees accept method
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter Manager Bonus: ");
     bonus = scanner.nextDouble();
 }

 // Method to display manager details including total salary
 @Override
 public void display() {
     super.display(); // Call the Employees display method
     System.out.println("Manager Bonus: " + bonus);
     System.out.println("Total Salary (Salary + Bonus): " + (salary + bonus));
 }

 // Method to return total salary (salary + bonus)
 public double getTotalSalary() {
     return salary + bonus;
 }
}

//Main class to test the functionality
public class SalaryBonus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Accept the number of managers
        System.out.print("Enter the number of Managers: ");
        int n = scanner.nextInt();

        // Create an array of Manager objects
        Manager[] managers = new Manager[n];

        // Accept details of all managers
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Manager " + (i + 1) + ":");
            managers[i] = new Manager();  // Create new Manager object
            managers[i].accept();         // Accept manager details
        }

        // Find the manager with the maximum total salary
        Manager maxSalaryManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].getTotalSalary() > maxSalaryManager.getTotalSalary()) {
                maxSalaryManager = managers[i];
            }
        }

        // Display details of the manager with the maximum total salary
        System.out.println("\nManager with the maximum total salary:");
        maxSalaryManager.display();

	}

}
