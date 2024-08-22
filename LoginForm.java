import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener {
    
    // Declare UI components
    Label userLabel, passLabel;
    TextField userField, passField;
    Button loginButton, cancelButton;
    
    public LoginForm() {
        // Set the title of the window
        setTitle("Login Form");
        
        // Set the layout manager
        setLayout(new GridLayout(3, 2, 10, 10));
        
        // Initialize components
        userLabel = new Label("Username:");
        passLabel = new Label("Password:");
        userField = new TextField();
        passField = new TextField();
        passField.setEchoChar('*'); // Mask the password field
        loginButton = new Button("Login");
        cancelButton = new Button("Cancel");
        
        // Add action listeners to buttons
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);
        
        // Add components to the frame
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginButton);
        add(cancelButton);
        
        // Set frame properties
        setSize(300, 150);
        setVisible(true);
        
        // Add window listener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    //Override
    public void actionPerformed(ActionEvent e) {
        // Check which button was pressed
        if (e.getSource() == loginButton) {
            String username = userField.getText();
            String password = passField.getText();
            
            // Simple validation logic
            if (username.equals("admin") && password.equals("password")) {
                System.out.println("Login successful!");
                // Handle successful login here (e.g., open a new window or perform other actions)
            } else {
                System.out.println("Invalid username or password.");
            }
        } else if (e.getSource() == cancelButton) {
            // Clear the text fields
            userField.setText("");
            passField.setText("");
        }
    }
    
    public static void main(String[] args) {
        new LoginForm();
    }
}
