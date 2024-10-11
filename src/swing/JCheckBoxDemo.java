package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxDemo {

	public static void main(String[] args) {
		// Create the main frame
        JFrame frame = new JFrame("JCheckBox Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Use null layout for manual positioning

        // Create JCheckBoxes
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        // Set bounds for checkboxes
        checkBox1.setBounds(50, 30, 150, 30);
        checkBox2.setBounds(50, 60, 150, 30);
        checkBox3.setBounds(50, 90, 150, 30);

        // Create a JButton
        JButton button = new JButton("Show Selected");
        button.setBounds(80, 130, 150, 30);  // Set position and size

        // Add an action listener to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a string to hold selected options
                StringBuilder selectedOptions = new StringBuilder("You selected:\n");
                if (checkBox1.isSelected()) selectedOptions.append("Option 1\n");
                if (checkBox2.isSelected()) selectedOptions.append("Option 2\n");
                if (checkBox3.isSelected()) selectedOptions.append("Option 3\n");

                // Show selected options in a message dialog
                JOptionPane.showMessageDialog(frame, selectedOptions.toString());
            }
        });

        // Add components to the frame
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);

	}

}
