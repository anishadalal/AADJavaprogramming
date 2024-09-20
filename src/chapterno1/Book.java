package chapterno1;

//Declare a class named 'Book'
public class Book {
	// Instance variables
    private String title;
    private String author;
    private double price; // in dollars
    
 // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
 // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

 // Main method to run the program
	public static void main(String[] args) {
		// Create instances of the Book class
        Book book1 = new Book("Feluda", "Satyajit Roy", 1000);
        Book book2 = new Book("Byomkesh Bakshi", "Sharadindu Bandopadyhay", 980);

        // Call the method to display book details
        System.out.println("Book Details:");
        book1.displayDetails();
        System.out.println(); // Print a blank line
        book2.displayDetails();

	}

}
