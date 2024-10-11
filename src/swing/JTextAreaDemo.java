package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaDemo {

	public static void main(String[] args) {
		 // Create the main frame
        JFrame frame = new JFrame("JTextArea Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Use null layout for manual positioning

        // Create a JTextArea for multi-line input
        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 340, 150);  // Set position and size (x, y, width, height)
        textArea.setLineWrap(true);  // Enable line wrapping
        textArea.setWrapStyleWord(true);  // Wrap at word boundaries

        // Create a JButton
        JButton button = new JButton("Show Text");
        button.setBounds(150, 200, 100, 30);  // Set position and size

        // Add an action listener to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get text from the JTextArea and show it in a message dialog
                String inputText = textArea.getText();
                JOptionPane.showMessageDialog(frame, "You entered:\n" + inputText);
            }
        });

        // Add components to the frame
        frame.add(textArea);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);

	}

}
