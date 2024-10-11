package swing;
import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {

	public static void main(String[] args) {
		// Create a new JFrame (main window)
        JFrame frame = new JFrame("GridLayout Example - 3x3");
        frame.setSize(400, 400);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the app when the window is closed

        // Set the layout manager to GridLayout with 3 rows and 3 columns
        frame.setLayout(new GridLayout(3, 3, 10, 10));  // 3 rows, 3 columns, with 10px gaps

        // Create and add buttons labeled 1 to 9 to the grid
        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton(String.valueOf(i)));  // Add buttons labeled 1, 2, 3, ... 9
        }

        // Make the frame visible
        frame.setVisible(true);
	}

}
