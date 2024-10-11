package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleSwingApp {

	public static void main(String[] args) {
		 // Create a new JFrame (main window)
        JFrame frame = new JFrame("Simple Swing App");
        frame.setSize(400, 200);  // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the app when the window is closed

        // Create a button
        JButton button = new JButton("Click Me");

        // Create a label to display the message
        JLabel label = new JLabel("Click the button to see a message.");

        // Add an action listener to the button to detect clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the label text when the button is clicked
                label.setText("Button clicked! Hello, Swing!");
            }
        });

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);

	}

}
