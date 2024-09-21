package inheritanceandinterface;
//Superclass
class Student {
 void study() {
     System.out.println("The student is studying.");
 }
}

//Subclass: Undergraduate
class Undergraduate extends Student {
 @Override
 void study() {
     System.out.println("The undergraduate student is studying for exams.");
 }
}

//Subclass: Graduate
class Graduate extends Student {
 @Override
 void study() {
     System.out.println("The graduate student is researching a thesis.");
 }
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// Creating objects of Undergraduate and Graduate
        Student myUndergraduate = new Undergraduate();  // Student reference but Undergraduate object
        Student myGraduate = new Graduate();            // Student reference but Graduate object

        // Call the study method on the Student references
        myUndergraduate.study();  // Output: The undergraduate student is studying for exams.
        myGraduate.study();       // Output: The graduate student is researching a thesis.

	}

}
