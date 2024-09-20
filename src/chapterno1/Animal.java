package chapterno1;

public class Animal {
	private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Animal name: " + name;
    }
}



