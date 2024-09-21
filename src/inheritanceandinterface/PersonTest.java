package inheritanceandinterface;
//Base class
class Persons {
 private String firstName;
 private String lastName;

 // Constructor to initialize first and last name
 public Persons(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 // Method to get the first name
 public String getFirstName() {
     return firstName;
 }

 // Method to get the last name
 public String getLastName() {
     return lastName;
 }
}

//Subclass Employ
class Employ extends Persons {
 private String employeeId;
 private String jobTitle;

 // Constructor for Employ class
 public Employ(String firstName, String lastName, String employeeId, String jobTitle) {
     super(firstName, lastName);
     this.employeeId = employeeId;
     this.jobTitle = jobTitle;
 }

 // Method to get the employee ID
 public String getEmployeeId() {
     return employeeId;
 }

 // Overriding getLastName method to include job title
 @Override
 public String getLastName() {
     return super.getLastName() + " (" + jobTitle + ")";
 }
}

//Main class to test the functionality
public class PersonTest {

	public static void main(String[] args) {
		// Create a Persons object
        Persons person = new Persons("Anisha", "Dalal");
        System.out.println("Person's Name: " + person.getFirstName() + " " + person.getLastName());

        // Create an Employ object
        Employ employee = new Employ("Abantika", "Chakrabarty", "EMP022", "CA Accountant");

        // Display the employee's information
        System.out.println("Employee's First Name: " + employee.getFirstName());
        System.out.println("Employee's Last Name: " + employee.getLastName());  // Includes job title
        System.out.println("Employee ID: " + employee.getEmployeeId());

	}

}
