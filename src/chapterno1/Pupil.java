package chapterno1;

public class Pupil {
	 private String name;
	    private int age;
	    private String major;

	    // Constructor
	    public Pupil(String name, int age, String major) {
	        this.name = name;
	        this.age = age;
	        this.major = major;
	    }

	    // Method to display pupil details
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Major: " + major);
	        System.out.println(); // Print an empty line for better readability
	    }
	}

