package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonDemo {

	public static void main(String[] args) {
		 // Create the main frame
        JFrame frame = new JFrame("JRadioButton Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Use null layout for manual positioning

        // Create JRadioButtons
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");

        // Group the radio buttons to allow selection of only one at a time
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        // Set bounds for radio buttons
        radioButton1.setBounds(50, 30, 150, 30);
        radioButton2.setBounds(50, 60, 150, 30);
        radioButton3.setBounds(50, 90, 150, 30);

        // Create a JButton
        JButton button = new JButton("Show Selected");
        button.setBounds(80, 130, 150, 30);  // Set position and size

        // Add an action listener to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Determine which radio button is selected
                String selectedOption = "";
                if (radioButton1.isSelected()) {
                    selectedOption = "Option 1";
                } else if (radioButton2.isSelected()) {
                    selectedOption = "Option 2";
                } else if (radioButton3.isSelected()) {
                    selectedOption = "Option 3";
                }

                // Show selected option in a message dialog
                if (!selectedOption.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "You selected: " + selectedOption);
                } else {
                    JOptionPane.showMessageDialog(frame, "No option selected.");
                }
            }
        });

        // Add components to the frame
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);

	}

}
