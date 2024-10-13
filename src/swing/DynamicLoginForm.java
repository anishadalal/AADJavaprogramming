package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DynamicLoginForm {

	public static void main(String[] args) {
		// Create the frame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Create components
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 10, 80, 25);
        frame.add(userLabel);
        
        JTextField userText = new JTextField();
        userText.setBounds(100, 10, 160, 25);
        frame.add(userText);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 40, 80, 25);
        frame.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 40, 160, 25);
        frame.add(passwordText);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 70, 80, 25);
        frame.add(loginButton);
        
        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(10, 100, 250, 25);
        frame.add(messageLabel);
        
        // Predefined credentials
        String predefinedUsername = "anishad";
        String predefinedPassword = "hihihi";
        
        // Action Listener for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if (username.equals(predefinedUsername) && password.equals(predefinedPassword)) {
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setText("Invalid username or password.");
                }
            }
        });
        
        // Set frame visibility
        frame.setVisible(true);

	}

}
