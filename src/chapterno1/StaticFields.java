package chapterno1;

public class StaticFields {
	// Static field  
	   private static int studentCount = 0;  
	  
	   // Instance field  
	   private String name;  
	  
	   // Constructor  
	   public StaticFields(String name) {  
	      this.name = name;  
	      studentCount++;  
	   }  
	  
	   // Method to display student details  
	   public void displayDetails() {  
	      System.out.println("Student Name: " + name);  
	      System.out.println("Total Students: " + studentCount);  
	   }  
	public static void main(String[] args) {
		// Create three instances of Student  
		StaticFields student1 = new StaticFields("Anisha");  
		StaticFields student2 = new StaticFields("Abantika");  
		StaticFields student3 = new StaticFields("Ankita");  
	  
	      // Display details of each student  
	      student1.displayDetails();  
	      student2.displayDetails();  
	      student3.displayDetails();

	}

}
