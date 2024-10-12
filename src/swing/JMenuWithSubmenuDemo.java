package swing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JMenuWithSubmenuDemo {

	public static void main(String[] args) {
		// Create the main frame
        JFrame frame = new JFrame("JMenu with Submenu Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu for File
        JMenu fileMenu = new JMenu("File");

        // Create JMenuItems for File menu
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listeners to file menu items
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Open option selected.");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Save option selected.");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });

        // Add menu items to the File menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Add a separator
        fileMenu.add(exitItem);

        // Create a JMenu for Help
        JMenu helpMenu = new JMenu("Help");

        // Create JMenuItems for Help menu
        JMenuItem aboutItem = new JMenuItem("About");

        // Create a submenu for Documentation
        JMenu documentationMenu = new JMenu("Documentation");

        // Create JMenuItems for Documentation submenu
        JMenuItem userGuideItem = new JMenuItem("User Guide");
        JMenuItem apiDocsItem = new JMenuItem("API Documentation");

        // Add action listeners for Help menu items
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "This is a demo application.");
            }
        });

        // Add action listeners for Documentation submenu items
        userGuideItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "User Guide selected.");
            }
        });

        apiDocsItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "API Documentation selected.");
            }
        });

        // Add menu items to the Documentation submenu
        documentationMenu.add(userGuideItem);
        documentationMenu.add(apiDocsItem);

        // Add items to the Help menu
        helpMenu.add(aboutItem);
        helpMenu.add(documentationMenu); // Add the Documentation submenu

        // Add the File and Help menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);  

	}

}
