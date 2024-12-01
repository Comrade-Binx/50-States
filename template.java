import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;    

public class template{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                e();
            }
        });    
    }
}
    
public static void e() {
        // Create the main frame
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
//State flag
        JLabel flagLabel = new JLabel(new ImageIcon("path/to/flag.png"));
        panel.add(flagLabel);

        // State description
        JLabel descriptionLabel = new JLabel(
                "State Description: Beautiful landscapes, rich history, etc.");
        panel.add(descriptionLabel);

        // State flower
        JLabel flowerLabel = new JLabel("State Flower: Bluebonnet");
        panel.add(flowerLabel);

        // State bird
        JLabel birdLabel = new JLabel("State Bird: Mockingbird");
        panel.add(birdLabel);

        // Display the frame
        frame.setVisible(true);
    

   
        // Display the frame
        frame.setVisible(true);}