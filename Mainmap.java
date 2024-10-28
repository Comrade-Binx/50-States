import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mainmap {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Button Template GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 900);

        // Create a panel to hold the buttons
        JPanel panel = new JPanel();

        // Create a button and add it to the panel
        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked!");
            }
        });
        panel.add(button1);

        // Create another button and add it to the panel
        JButton button2 = new JButton("Button 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked!");
            }
        });
        panel.add(button2);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
