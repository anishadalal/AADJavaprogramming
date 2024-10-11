package swing;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {

	public static void main(String[] args) {
		// Create a new JFrame (main window)
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(400, 200);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the app when the window is closed

        // Set the layout manager for the frame to FlowLayout
        frame.setLayout(new FlowLayout());

        // Create and add some buttons to the frame
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Add buttons to the frame (they will be arranged using FlowLayout)
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5); 

        // Make the frame visible
        frame.setVisible(true);

	}

}
