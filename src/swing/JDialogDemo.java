package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JDialogDemo {

	public static void main(String[] args) {
		// Create the main frame
        JFrame frame = new JFrame("JDialog Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button to open the dialog
        JButton openDialogButton = new JButton("Open Dialog");
        
        // Add action listener to the button
        openDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create the dialog
                JDialog dialog = new JDialog(frame, "Dialog", true); // Modal dialog
                dialog.setSize(300, 150);
                
                // Create a label in the dialog
                JLabel label = new JLabel("This is a JDialog!", SwingConstants.CENTER);
                dialog.add(label, "North");
                
                // Create OK and Cancel buttons
                JButton okButton = new JButton("OK");
                JButton cancelButton = new JButton("Cancel");

                // Add action listener for OK button
                okButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(dialog, "OK button clicked.");
                        dialog.dispose(); // Close the dialog
                    }
                });

                // Add action listener for Cancel button
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose(); // Close the dialog
                    }
                });

                // Create a panel for the buttons and add them
                JPanel buttonPanel = new JPanel();
                buttonPanel.add(okButton);
                buttonPanel.add(cancelButton);
                
                dialog.add(buttonPanel, "South"); // Add button panel to the dialog
                
                // Make the dialog visible
                dialog.setLocationRelativeTo(frame); // Center dialog relative to the frame
                dialog.setVisible(true);
            }
        });

        // Add the button to the frame
        frame.add(openDialogButton);
        
        // Make the frame visible
        frame.setVisible(true);

	}

}
