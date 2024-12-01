import java.awt.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

/*Here's some stuff that still needs to be done here: 
 * - Get the map fully working, have it linking to the state variables 
 * - Do some nice and neat formatting for the state GUIs 
 * - Link all the content needed for the states 
 * - And then clean up and call it a day 
 * 
 * I can't wait to be done with this shitty thing 
 */

public class StateInfoGUI{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Mainmap();
            }
        });
}
   // Variables to be linked
        private static int var1 = 0;
        private static int var2 = 0;
        private static int var3 = 0;
        private static int var4 = 0;
        private static int var5 = 0;
        private static int var6 = 0;
        private static int var7 = 0;
        private static int var8 = 0;
        private static int var9 = 0;
        private static int var10 = 0;
        private static int var11 = 0;
        private static int var12 = 0;
        private static int var13 = 0;
        private static int var14 = 0;
        private static int var15 = 0;
        private static int var16 = 0;
        private static int var17 = 0;
        private static int var18 = 0;
        private static int var19 = 0;
        private static int var20 = 0;
        private static int var21 = 0;
        private static int var22 = 0;
        private static int var23 = 0;
        private static int var24 = 0;
        private static int var25 = 0;
        private static int var26 = 0;
        private static int var27 = 0;
        private static int var28 = 0;
        private static int var29 = 0;
        private static int var30 = 0;
        private static int var31 = 0;
        private static int var32 = 0;
        private static int var33 = 0;
        private static int var34 = 0;
        private static int var35 = 0;
        private static int var36 = 0;
        private static int var37 = 0;
        private static int var38 = 0;
        private static int var39 = 0;
        private static int var40 = 0;  
        private static int var41 = 0;
        private static int var42 = 0;
        private static int var43 = 0;
        private static int var44 = 0;
        private static int var45 = 0;
        private static int var46 = 0;
        private static int var47 = 0;
        private static int var48 = 0;
        private static int var49 = 0;
        private static int var50 = 0;


public static void Mainmap(){
       // Create a new frame
    // Create the JPanel to hold the buttons
           // Create the JFrame (window)
           JFrame frame = new JFrame("United States Map");
           frame.setSize(1600, 900);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setLayout(new BorderLayout());
           
           // Set background image
           JLabel background = new JLabel(new ImageIcon("images/us_map.png"));
           frame.setContentPane(background);
           background.setLayout(new GridBagLayout());
           
        JPanel panel = new JPanel();
           panel.setOpaque(false); // Make the panel transparent
           background.add(panel, new GridBagConstraints());
               




JButton UT = new JButton();
panel.add(UT);


UT.setBounds(200,-100,1000,2000);
UT.setOpaque(true);//makes it invisible, set true to see on map
UT.addActionListener(e->{
//put images and sound call signs here
});


// ... add ActionListeners for other buttons



    // Set frame visibility
    frame.pack(); // Adjust the frame size to fit the preferred size of its components
    frame.setVisible(true);

}
 

    


    public static void playSound(String soundFile) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.err.println("Error playing sound: " + e.getMessage());
        }
    }


                      // Alabama
                          private static void Alabama() {
                                // Create the main frame
                                JFrame frame = new JFrame("State Info");
                                frame.setSize(800, 800);  
                                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                
                                // Create panel
                                JPanel panel = new JPanel();
                                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                                frame.add(panel);
                                
                                // State flag
                                JLabel flagLabelAlabama = new JLabel(new ImageIcon("path/to/alabama_flag.png"));
                                panel.add(flagLabelAlabama);

                        // State description
                        JTextArea descriptionTextAlabama = new JTextArea(
                                "State Description: Alabama is known for its rich history, diverse landscapes, and vibrant culture.");
                        descriptionTextAlabama.setLineWrap(true);
                        descriptionTextAlabama.setWrapStyleWord(true);
                        descriptionTextAlabama.setEditable(false);
                        panel.add(descriptionTextAlabama);

                        // State Flower
                        JLabel flowerImageAlabama = new JLabel(new ImageIcon("path/to/camellia.png"));
                        panel.add(flowerImageAlabama);

                        // State Bird
                        JLabel birdImageAlabama = new JLabel(new ImageIcon("path/to/yellowhammer.png"));
                        panel.add(birdImageAlabama);

                        // Play Bird Song button
                        JButton playBirdSongButtonAlabama = new JButton("Play Yellowhammer Song");
                        playBirdSongButtonAlabama.addActionListener(e -> playSound("path/to/yellowhammer_song.wav"));
                        // Add a button to show the main map
                        JButton mainMapButton = new JButton("Show Main Map");
                        mainMapButton.setAlignmentX(Component.CENTER_ALIGNMENT);
                        mainMapButton.addActionListener(e -> Mainmap());
                        panel.add(mainMapButton);

                        // Set frame visibility
                        frame.setVisible(true);}}
         
        // Method to play sound



        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code

                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                                       // I want more lines of code      
    