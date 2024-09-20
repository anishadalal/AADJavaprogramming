package chapterno1;
//Outer class representing a School
class School {
 private String name;

 // Constructor for the outer class
 public School(String name) {
     this.name = name;
 }

 // Method to display school name
 public void displaySchoolName() {
     System.out.println("School Name: " + name);
 }

 // Nested class representing a Student
 class Student {
     private String studentName;

     // Constructor for the nested class
     public Student(String studentName) {
         this.studentName = studentName;
     }

     // Method to display student details
     public void displayStudentDetails() {
         System.out.println("Student Name: " + studentName);
         // Accessing the outer class method
         displaySchoolName();
     }
 }
}
//Main class
public class NestedClass {

	public static void main(String[] args) {
		// Create an instance of the outer class
        School school = new School("Dum Dum Motijheel Girls' High School");

        // Create an instance of the nested class
        School.Student student = school.new Student("Anisha");

        // Display student details
        student.displayStudentDetails();
	}

}
