import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color; // Import Color class for color settings
import java.awt.Font; // Import Font class for font settings
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Log {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login to Kaishahero");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200); // Adjusted size for better layout
        frame.setResizable(false);
        // Create a panel to hold the button and text
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK); // Set background color to black

        // Create and style the title label
        JLabel titleLabel = new JLabel("Please log in to Kaishahero");
        titleLabel.setForeground(Color.WHITE); // Set text color to white
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set font style
        titleLabel.setOpaque(true);
        titleLabel.setBackground(Color.DARK_GRAY); // Set background color of the title block
        titleLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding
        titleLabel.setOpaque(false);
        // Add the title label to the panel
        panel.add(titleLabel);

        // Create and style the button
        JButton openButton = new JButton("Click here to proceed");
        openButton.setBackground(Color.GRAY); // Set button background color
        openButton.setForeground(Color.WHITE); // Set button text color
        openButton.setFocusPainted(false); // Remove button focus border

        // Add an ActionListener to the button
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Create a URI for the website
                    URI uri = new URI("https://kaishahero.com");
                    // Open the default web browser to the specified URI
                    Desktop.getDesktop().browse(uri);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Add the button to the panel
        panel.add(openButton);

        // Add the panel to the frame
        frame.add(panel);
 
         // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
