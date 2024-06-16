import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class signUp extends JFrame {

    public signUp() {
        // Set up the main frame
        setTitle("TICKIFY");
        setSize(1200, 900);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Create the main panel with GridLayout to split into two parts
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel);

        // form Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBackground(new Color(216, 223, 236)); // setting the background color
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Center the frame

        // Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 300, 30, 300));
        rightPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setPreferredSize(new Dimension(600, 0));

        JLabel createAccountLabel = new JLabel("Create Account");
        createAccountLabel.setFont(new Font("Arial", Font.BOLD, 35));
        createAccountLabel.setForeground(new Color(0, 153, 102));
        createAccountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 18));
        nameField.setPreferredSize(new Dimension(300, 50));
        nameField.setMaximumSize(new Dimension(300, 50));
        nameField.setBorder(BorderFactory.createTitledBorder("Name"));
        nameField.setBackground(Color.WHITE);

        JTextField emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 18));
        emailField.setPreferredSize(new Dimension(300, 50));
        emailField.setMaximumSize(new Dimension(300, 50));
        emailField.setBorder(BorderFactory.createTitledBorder("Email"));
        emailField.setBackground(Color.WHITE);

        JTextField phoneField = new JTextField();
        phoneField.setFont(new Font("Arial", Font.PLAIN, 18));
        phoneField.setPreferredSize(new Dimension(300, 50));
        phoneField.setMaximumSize(new Dimension(300, 50));
        phoneField.setBorder(BorderFactory.createTitledBorder("Phone Number"));
        phoneField.setBackground(Color.WHITE);

        JTextField addressField = new JTextField();
        addressField.setFont(new Font("Arial", Font.PLAIN, 18));
        addressField.setPreferredSize(new Dimension(300, 50));
        addressField.setMaximumSize(new Dimension(300, 50));
        addressField.setBorder(BorderFactory.createTitledBorder("Address"));
        addressField.setBackground(Color.WHITE);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
        passwordField.setPreferredSize(new Dimension(300, 50));
        passwordField.setMaximumSize(new Dimension(300, 50));
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
        passwordField.setBackground(Color.WHITE);

        JPasswordField passwordagainField = new JPasswordField();
        passwordagainField.setFont(new Font("Arial", Font.PLAIN, 18));
        passwordagainField.setPreferredSize(new Dimension(300, 50));
        passwordagainField.setMaximumSize(new Dimension(300, 50));
        passwordagainField.setBorder(BorderFactory.createTitledBorder("Password Again"));
        passwordagainField.setBackground(Color.WHITE);

        JButton signUpButton = new JButton("SIGN UP");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 20));
        signUpButton.setBackground(new Color(0, 153, 102));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signUpButton.setFocusable(false);
        signUpButton.setPreferredSize(new Dimension(150, 40));
        signUpButton.setMaximumSize(new Dimension(150, 40));

        // Add action listener to the sign up button
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sign Up button clicked");
            }
        });

        JLabel accountLabel = new JLabel("Have an account?");
        accountLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        accountLabel.setForeground(new Color(0, 153, 102));
        accountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton signInButton = new JButton("SIGN IN");
        signInButton.setFont(new Font("Arial", Font.BOLD, 20));
        signInButton.setBackground(new Color(0, 153, 102));
        signInButton.setForeground(Color.WHITE);
        signInButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signInButton.setFocusable(false);
        signInButton.setPreferredSize(new Dimension(150, 40));
        signInButton.setMaximumSize(new Dimension(150, 40));

        // Add action listener to the sign in button
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == signInButton)
                    ;
                dispose();
                Login login = new Login();
            }
        });

        rightPanel.add(createAccountLabel);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(nameField);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(emailField);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(phoneField);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(addressField);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(passwordField);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(passwordagainField);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(signUpButton);
        rightPanel.add(Box.createVerticalStrut(55));
        rightPanel.add(accountLabel);
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(signInButton);

        // Add panels to main panel
        panel.add(rightPanel);
        mainPanel.add(panel);

        // Add main panel to frame
        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new signUp());
    }
}
