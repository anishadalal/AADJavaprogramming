package swing;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		// Create a new JFrame (main window)
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setSize(400, 300);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the app when the window is closed

        // Set the layout manager for the frame to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create some buttons for each region of the BorderLayout
        JButton buttonNorth = new JButton("NORTH");
        JButton buttonSouth = new JButton("SOUTH");
        JButton buttonEast = new JButton("EAST");
        JButton buttonWest = new JButton("WEST");
        JButton buttonCenter = new JButton("CENTER");

        // Add the buttons to the frame with their respective BorderLayout positions
        frame.add(buttonNorth, BorderLayout.NORTH);
        frame.add(buttonSouth, BorderLayout.SOUTH);
        frame.add(buttonEast, BorderLayout.EAST);
        frame.add(buttonWest, BorderLayout.WEST);
        frame.add(buttonCenter, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);

	}

}
