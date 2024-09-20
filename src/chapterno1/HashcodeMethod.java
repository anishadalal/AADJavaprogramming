package chapterno1;

public class HashcodeMethod {
	// Instance variables
    private String name;
    private int age;

    // Constructor
    public HashcodeMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override hashCode() method from Object class
    @Override
    public int hashCode() {
        int result = name.hashCode(); // Get hash code for name
        result = 31 * result + age;   // Combine with age
        return result;
    }

    // Override toString() method for easy display
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
// Main method to test the class
public static void main(String[] args) {
	HashcodeMethod person1 = new HashcodeMethod("Anisha", 20);
	HashcodeMethod person2 = new HashcodeMethod("Abantika", 20);

    // Displaying person details and their hash codes
    System.out.println(person1);
    System.out.println("Hash Code: " + person1.hashCode());
    
    System.out.println(person2);
    System.out.println("Hash Code: " + person2.hashCode());

	}

}
