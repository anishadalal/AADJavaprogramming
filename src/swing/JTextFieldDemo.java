package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo {

	public static void main(String[] args) {
		// Create the main frame
        JFrame frame = new JFrame("JTextField Demo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Use null layout for manual positioning

        // Create a JTextField for user input
        JTextField textField = new JTextField();
        textField.setBounds(50, 20, 200, 30);  // Set position and size (x, y, width, height)

        // Create a JButton
        JButton button = new JButton("Show Text");
        button.setBounds(100, 60, 100, 30);  // Set position and size

        // Add an action listener to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get text from the text field and show it in a message dialog
                String inputText = textField.getText();
                JOptionPane.showMessageDialog(frame, "You entered: " + inputText);
            }
        });

        // Add components to the frame
        frame.add(textField);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);

	}

}
