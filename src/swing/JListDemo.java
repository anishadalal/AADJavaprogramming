package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JListDemo {

	public static void main(String[] args) {
		 // Create the main frame
        JFrame frame = new JFrame("JList Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Use null layout for manual positioning

        // Create an array of items for the JList
        String[] items = {"Apple", "Banana", "Cherry", "Date"};

        // Create a JList with the items
        JList<String> itemList = new JList<>(items);
        itemList.setBounds(50, 30, 150, 80);  // Set position and size (x, y, width, height)

        // Create a JButton
        JButton button = new JButton("Show Selected");
        button.setBounds(80, 120, 150, 30);  // Set position and size

        // Add an action listener to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected value from the JList
                String selectedItem = itemList.getSelectedValue();

                // Show selected item in a message dialog
                if (selectedItem != null) {
                    JOptionPane.showMessageDialog(frame, "You selected: " + selectedItem);
                } else {
                    JOptionPane.showMessageDialog(frame, "No item selected.");
                }
            }
        });

        // Add components to the frame
        frame.add(itemList);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);

	}

}
