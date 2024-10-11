package swing;
import javax.swing.*;
public class JLabelDemo {

	public static void main(String[] args) {
		 // Create a new JFrame (main window)
        JFrame frame = new JFrame("JLabel Example");
        frame.setSize(400, 300);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the app when the window is closed

        // Create a label with text
        JLabel textLabel = new JLabel("UserName");

        // Create another label with an icon (image)
        ImageIcon icon = new ImageIcon("path_to_image.png");  // Provide the correct path to your image
        JLabel imageLabel = new JLabel(icon);

        // Create a label with both text and an icon
        JLabel textImageLabel = new JLabel("Password", icon, JLabel.CENTER);
        textImageLabel.setHorizontalTextPosition(JLabel.RIGHT);  // Position text to the right of the image
        textImageLabel.setVerticalTextPosition(JLabel.CENTER);   // Align text vertically with the center of the image

        // Create a panel to hold the labels
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  // Arrange labels vertically
        panel.add(textLabel);
        panel.add(imageLabel);
        panel.add(textImageLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
		

	}

}
