package chapterno1;
//Class representing a Library
class Library {
 // Class variable (static variable)
 private static int totalBooks = 0; // Tracks the total number of books

 // Instance variable
 private String bookTitle;

 // Constructor
 public Library(String bookTitle) {
     this.bookTitle = bookTitle;
     totalBooks++; // Increment the total books count when a new book is added
 }

 // Static method to get the total number of books
 public static int getTotalBooks() {
     return totalBooks;
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("Book Title: " + bookTitle);
 }
}
//Main class
public class ClassVariables {

	public static void main(String[] args) {
		 // Create instances of the Library class
        Library book1 = new Library("The Great Gatsby");
        Library book2 = new Library("1984");
        Library book3 = new Library("To Kill a Mockingbird");

        // Display details of each book
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        // Display the total number of books
        System.out.println("Total books in the library: " + Library.getTotalBooks());

	}

}
