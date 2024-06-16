import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {

    public Login() {
        // Set up the main frame
        setTitle("TICKIFY");
        setSize(1200, 900);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setBackground(new Color(216, 223, 236));

        // Create the main panel with GridLayout to split into two parts
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(new Color(216, 223, 236));
        add(mainPanel);

        // Left Panel for Sign In
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(new Color(216, 223, 236));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        JLabel signInLabel = new JLabel("Sign In");
        signInLabel.setFont(new Font("Arial", Font.BOLD, 36));
        signInLabel.setForeground(new Color(0, 153, 102));
        signInLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 15));
        emailField.setPreferredSize(new Dimension(300, 70));
        emailField.setMaximumSize(new Dimension(300, 70));
        emailField.setBorder(BorderFactory.createTitledBorder("Email"));
        emailField.setBackground(new Color(216, 223, 236));

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setPreferredSize(new Dimension(300, 70));
        passwordField.setMaximumSize(new Dimension(300, 70));
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
        passwordField.setBackground(new Color(216, 223, 236));

        JLabel forgotPasswordLabel = new JLabel("Forgot your password?");
        forgotPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        forgotPasswordLabel.setForeground(Color.GRAY);
        forgotPasswordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton signInButton = new JButton("SIGN IN");
        signInButton.setFont(new Font("Arial", Font.BOLD, 20));
        signInButton.setFocusable(false);
        signInButton.setBackground(new Color(0, 153, 102));
        signInButton.setForeground(Color.WHITE);
        signInButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signInButton.setPreferredSize(new Dimension(200, 50));
        signInButton.setMaximumSize(new Dimension(200, 50));

        // Add action listener to the sign in button
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sign In button clicked");
            }
        });

        JLabel donthaveaccount = new JLabel("Don't have account? ");
        donthaveaccount.setFont(new Font("Arial", Font.PLAIN, 14));
        donthaveaccount.setForeground(Color.GRAY);
        donthaveaccount.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton signUpButton = new JButton("SIGN UP");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 20));
        signUpButton.setBackground(new Color(0, 153, 102));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        signUpButton.setPreferredSize(new Dimension(200, 50));
        signUpButton.setMaximumSize(new Dimension(200, 50));

        signUpButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == signUpButton)
                    ;
                dispose();
                signUp signUp = new signUp();
            }

        });

        leftPanel.add(signInLabel);
        leftPanel.add(Box.createVerticalStrut(100));
        leftPanel.add(emailField);
        leftPanel.add(Box.createVerticalStrut(50));
        leftPanel.add(passwordField);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(forgotPasswordLabel);
        leftPanel.add(Box.createVerticalStrut(40));
        leftPanel.add(signInButton);
        leftPanel.add(Box.createVerticalStrut(200));
        leftPanel.add(donthaveaccount);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(signUpButton);

        // Add panels to main panel
        mainPanel.add(leftPanel);
        // mainPanel.add(rightPanel);

        // Add main panel to frame
        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login());
    }
}
