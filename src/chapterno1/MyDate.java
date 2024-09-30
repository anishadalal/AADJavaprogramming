package chapterno1;

public class MyDate {
	private int dd;
    private int mm;
    private int yy;

    // Default constructor
    public MyDate() {
        this.dd = 01;  // Default day
        this.mm = 10;  // Default month
        this.yy = 2003;  // Default year
    }

    // Parameterized constructor
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;  // Use this keyword to refer to instance variable
        this.mm = mm;
        this.yy = yy;
    }

    // Method to display the date in dd-mm-yy format
    public void displayDate() {
        System.out.println("Date: " + this.dd + "-" + this.mm + "-" + this.yy);
    }

	public static void main(String[] args) {
		// Using default constructor
        MyDate date1 = new MyDate();
        date1.displayDate();  // Output: Date: 01-10-2003

        // Using parameterized constructor
        MyDate date2 = new MyDate(20, 9, 2024);
        date2.displayDate();  // Output: Date: 20-9-20204

	}

}
