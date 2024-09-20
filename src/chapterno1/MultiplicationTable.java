package chapterno1;

public class MultiplicationTable {

	public static void main(String[] args) {
		int number = 5;  // Change this to any number

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
	}

}
