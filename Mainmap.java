import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;


public class StateInfoGUI {
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
           
           JPanel panel = new JPanel(new GridBagLayout());
           panel.setOpaque(false); // Make the panel transparent
           background.add(panel, new GridBagConstraints());
               


    // Create buttons
    JButton button1 = new JButton("Alabama");
    JButton button2 = new JButton("Illinois");
    JButton button3 = new JButton("template");
    JButton button4 = new JButton("template");
    JButton button5 = new JButton("template");
    JButton button6 = new JButton("template");
    JButton button7 = new JButton("template");
    JButton button8 = new JButton("template");
    JButton button9 = new JButton("template");
    JButton button10 = new JButton("template");
    JButton button11 = new JButton("template");
    JButton button12 = new JButton("template");
    JButton button13 = new JButton("template");
    JButton button14 = new JButton("template");
    JButton button15 = new JButton("template");
    JButton button16 = new JButton("template");
    JButton button17 = new JButton("template");
    JButton button18 = new JButton("template");
    JButton button19 = new JButton("template");
    JButton button20 = new JButton("template");
    JButton button21 = new JButton("template");
    JButton button22 = new JButton("template");
    JButton button23 = new JButton("template");
    JButton button24 = new JButton("template");
    JButton button25 = new JButton("template");
    JButton button26 = new JButton("template");
    JButton button27 = new JButton("template");
    JButton button28 = new JButton("template");
    JButton button29 = new JButton("template");
    JButton button30 = new JButton("template");
    JButton button31 = new JButton("template");
    JButton button32 = new JButton("template");
    JButton button33 = new JButton("template");
    JButton button34 = new JButton("template");
    JButton button35 = new JButton("template");
    JButton button36 = new JButton("template");
    JButton button37 = new JButton("template");
    JButton button38 = new JButton("template");
    JButton button39 = new JButton("template");
    JButton button40 = new JButton("template");
    JButton button41 = new JButton("template");
    JButton button42 = new JButton("template");
    JButton button43 = new JButton("template");
    JButton button44 = new JButton("template");
    JButton button45 = new JButton("template");
    JButton button46 = new JButton("template");
    JButton button47 = new JButton("template");
    JButton button48 = new JButton("template");
    JButton button49 = new JButton("template");
    JButton button50 = new JButton("template");


    // Set different sizes for buttons
    button1.setPreferredSize(new Dimension(150, 50));
    button2.setPreferredSize(new Dimension(100, 40));
        button3.setPreferredSize(new Dimension(200, 60));
        button4.setPreferredSize(new Dimension(200, 60));
        button5.setPreferredSize(new Dimension(200, 60));
        button6.setPreferredSize(new Dimension(200, 60));
        button7.setPreferredSize(new Dimension(200, 60));
        button8.setPreferredSize(new Dimension(200, 60));
        button9.setPreferredSize(new Dimension(200, 60));
        button10.setPreferredSize(new Dimension(200, 60));
        button11.setPreferredSize(new Dimension(200, 60));
        button12.setPreferredSize(new Dimension(200, 60));
        button13.setPreferredSize(new Dimension(200, 60));
        button14.setPreferredSize(new Dimension(200, 60));
        button15.setPreferredSize(new Dimension(200, 60));
        button16.setPreferredSize(new Dimension(200, 60));
        button17.setPreferredSize(new Dimension(200, 60));
        button18.setPreferredSize(new Dimension(200, 60));
        button19.setPreferredSize(new Dimension(200, 60));
        button20.setPreferredSize(new Dimension(200, 60));
        button21.setPreferredSize(new Dimension(200, 60));
        button22.setPreferredSize(new Dimension(200, 60));
        button23.setPreferredSize(new Dimension(200, 60));
        button24.setPreferredSize(new Dimension(200, 60));
        button25.setPreferredSize(new Dimension(200, 60));
        button26.setPreferredSize(new Dimension(200, 60));
        button27.setPreferredSize(new Dimension(200, 60));
        button28.setPreferredSize(new Dimension(200, 60));
        button29.setPreferredSize(new Dimension(200, 60));
        button30.setPreferredSize(new Dimension(200, 60));
        button31.setPreferredSize(new Dimension(200, 60));
        button32.setPreferredSize(new Dimension(200, 60));
        button33.setPreferredSize(new Dimension(200, 60));
        button34.setPreferredSize(new Dimension(200, 60));
        button35.setPreferredSize(new Dimension(200, 60));
        button36.setPreferredSize(new Dimension(200, 60));
        button37.setPreferredSize(new Dimension(200, 60));
        button38.setPreferredSize(new Dimension(200, 60));
        button39.setPreferredSize(new Dimension(200, 60));
        button40.setPreferredSize(new Dimension(200, 60));
        button41.setPreferredSize(new Dimension(200, 60));
        button42.setPreferredSize(new Dimension(200, 60));
        button43.setPreferredSize(new Dimension(200, 60));
        button44.setPreferredSize(new Dimension(200, 60));
        button45.setPreferredSize(new Dimension(200, 60));
        button46.setPreferredSize(new Dimension(200, 60));
        button47.setPreferredSize(new Dimension(200, 60));
        button48.setPreferredSize(new Dimension(200, 60));
        button49.setPreferredSize(new Dimension(200, 60));
        button50.setPreferredSize(new Dimension(200, 60));

    // Add ActionListeners to the buttons
    button1.addActionListener(e -> {
        var1++;
        System.out.println("Var1: " + var1);
    });

    button2.addActionListener(e -> {
        var2++;
        System.out.println("Var2: " + var2);
    });



    // Use GridBagConstraints to arrange the buttons
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10); // Add some padding

    gbc.gridx = 0;
    gbc.gridy = 0;
    panel.add(button1, gbc);

    gbc.gridx = 1;
    gbc.gridy = 0;
    panel.add(button2, gbc);



    // Set frame visibility
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

    public static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        // State flag
        JLabel flagLabel = new JLabel(new ImageIcon("path/to/flag.png"));
        panel.add(flagLabel);

        // State description
        JLabel descriptionLabel = new JLabel(
                "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
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
        frame.setVisible(true);
                      // Alabama
                      // State flag
                      JLabel flagLabelAlabama = new JLabel(new ImageIcon("path/to/flag.png"));
                        panel.add(flagLabel);
                         // State description
                       JLabel descriptionLabelAlabama = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                       panel.add(descriptionLabel);
                       //State Flower
                       JLabel flowerLabelAlabama = new JLabel("State Flower: Camellia");
                      panel.add(flowerLabel);
                      //State Bird
                       JLabel birdLabelAlabama = new JLabel("State Bird: Yellowhammer");
                       panel.add(birdLabel);
                      
                      // Alaska
                      // State flag
                      JLabel flagLabelAlaska = new JLabel(new ImageIcon("path/to/flag.png"));
                      panel.add(flagLabel);
                      // State description
                      JLabel descriptionLabelAlaksa = new JLabel(
                              "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                      panel.add(descriptionLabel);
                      //State Flower
                      JLabel flowerLabelAlaska = new JLabel("State Flower: Alpine Forget me not");
                      panel.add(flowerLabel);
                      //State Bird
                      JLabel birdLabelAlaska = new JLabel("State Bird: Willow ptarmigan");
                      panel.add(birdLabel);
                      //add audio here
                    
                      // Arizona
                      // State flag
                      JLabel flagLabelArizona = new JLabel(new ImageIcon("path/to/flag.png"));
                      panel.add(flagLabel);
                      // State description
                      JLabel descriptionLabelArizona = new JLabel(
                              "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                       panel.add(descriptionLabel);
                       //State Flower
                        JLabel flowerLabelArizona = new JLabel("State Flower: Cactus Flower");
                       panel.add(flowerLabel);
                      //State Bird
                      JLabel birdLabelArizona = new JLabel("State Bird: Cactus Wren");
                      panel.add(birdLabel);
                       //add audio here
            
                      // Arkansas
                      // State flag
                       JLabel flagLabelArkansas = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                        // State description
                       JLabel descriptionLabelArkansas = new JLabel(
                              "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                      panel.add(descriptionLabel);
                      //State Flower
                      JLabel flowerLabelArkansas = new JLabel("State Flower: Apple Blossom");
                       panel.add(flowerLabel);
                       //State Bird
                  JLabel birdLabelArkansas = new JLabel("State Bird: Northern Mockingbird");
                        panel.add(birdLabel);
                         //add audio here
               
                       // California
                       // State flag
                       JLabel flagLabelCalifornia = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelCalifornia = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelCalifornia = new JLabel("State Flower: California Poppy");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelCalifornia = new JLabel("State Bird: California Quail");
                       panel.add(birdLabel);
                        //add audio here
             
                        // Colorado
                        // State flag
                         JLabel flagLabelColorado = new JLabel(new ImageIcon("path/to/flag.png"));
                         panel.add(flagLabel);
                         // State description
                         JLabel descriptionLabelColorado = new JLabel(
                                "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                        JLabel flowerLabelColorado = new JLabel("State Flower: Rocky Mountain Columbine");
                       panel.add(flowerLabel);
                       //State Bird
                        JLabel birdLabelColorado = new JLabel("State Bird: Lark Bunting");
                        panel.add(birdLabel);
                         //add audio here
               
                       // Connecticut
                       // State flag
                       JLabel flagLabelConnecticut = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                      JLabel descriptionLabelConnecticut = new JLabel(
                              "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                       panel.add(descriptionLabel);
                       //State Flower
                        JLabel flowerLabelConnecticut = new JLabel("State Flower: Mountain Laurel");
                       panel.add(flowerLabel);
                      //State Bird
                      JLabel birdLabelConnecticut = new JLabel("State Bird: American Robin");
                      panel.add(birdLabel);
                       //add audio here
            
                      // Delaware
                      // State flag
                       JLabel flagLabelDelaware = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                        // State description
                       JLabel descriptionLabelDelaware = new JLabel(
                              "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                      panel.add(descriptionLabel);
                      //State Flower
                      JLabel flowerLabelDelaware = new JLabel("State Flower: Peach Blossom");
                      panel.add(flowerLabel);
                      //State Bird
                       JLabel birdLabelDelaware = new JLabel("State Bird: Delaware Blue Hen");
                       panel.add(birdLabel);
                        //add audio here
              
                       // Florida
                      // State flag
                      JLabel flagLabelFlorida = new JLabel(new ImageIcon("path/to/flag.png"));
                      panel.add(flagLabel);
                      // State description
                      JLabel descriptionLabelFlorida = new JLabel(
                              "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                       panel.add(descriptionLabel);
                       //State Flower
                        JLabel flowerLabelFlorida = new JLabel("State Flower: Orange Blossom");
                       panel.add(flowerLabel);
                      //State Bird
                      JLabel birdLabelFlorida  = new JLabel("State Bird: Norhtern Mockingbird");
                      panel.add(birdLabel);
                       //add audio here
            
                       // Georgia
                       // State flag
                        JLabel flagLabelGeorgia = new JLabel(new ImageIcon("path/to/flag.png"));
                        panel.add(flagLabel);
                         // State description
                        JLabel descriptionLabelGeorgia = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                       panel.add(descriptionLabel);
                       //State Flower
                       JLabel flowerLabelGeorgia = new JLabel("State Flower: Cherokee Rose");
                       panel.add(flowerLabel);
                       //State Bird
                        JLabel birdLabelGeorgia = new JLabel("State Bird: Brown Thrasher");
                        panel.add(birdLabel);
                         //add audio here
               
                        // Hawaii
                       // State flag
                       JLabel flagLabelHawaii = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                        JLabel descriptionLabelHawaii = new JLabel(
                                "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                         panel.add(descriptionLabel);
                         //State Flower
                          JLabel flowerLabelHawaii = new JLabel("State Flower: Pua Aloalo");
                         panel.add(flowerLabel);
                        //State Bird
                        JLabel birdLabelHawaii = new JLabel("State Bird: Nene");
                        panel.add(birdLabel);
                         //add audio here
              
                        // Idaho
                        // State flag
                         JLabel flagLabelIdaho = new JLabel(new ImageIcon("path/to/flag.png"));
                         panel.add(flagLabel);
                          // State description
                         JLabel descriptionLabelIdaho = new JLabel(
                                "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        
                        //State Flower
                        JLabel flowerLabelIdaho = new JLabel("State Flower: Syringa");
                         panel.add(flowerLabel);
                         //State Bird
                          JLabel birdLabelIdaho = new JLabel("State Bird: Mountain Bluebird");
                          panel.add(birdLabel);
                           //add audio here
           
                          // Illinois
                         // State flag
                         JLabel flagLabelIllinois = new JLabel(new ImageIcon("path/to/flag.png"));
                         panel.add(flagLabel);
                         // State description
                        JLabel descriptionLabelIllinois = new JLabel(
                                "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                         panel.add(descriptionLabel);
                         //State Flower
                          JLabel flowerLabelIllinois = new JLabel("State Flower: Violet");
                        panel.add(flowerLabel);
                        //State Bird
                        JLabel birdLabelIllinois = new JLabel("State Bird: Cardinal");
                        panel.add(birdLabel);
                         //add audio here
              
                       // Indiana
                       // State flag
                        JLabel flagLabelIndiana = new JLabel(new ImageIcon("path/to/flag.png"));
                        panel.add(flagLabel);
                         // State description
                        JLabel descriptionLabelIndiana = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                       panel.add(descriptionLabel);
                       //State Flower
                       JLabel flowerLabelIndiana = new JLabel("State Flower: Peony");
                       panel.add(flowerLabel);
                       //State Bird
                        JLabel birdLabelIndiana = new JLabel("State Bird: Cardinal");
                        panel.add(birdLabel);
                                //add audio here
               
                        // Iowa
                       // State flag
                       JLabel flagLabelIowa = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelIowa = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelIowa = new JLabel("State Flower: Wild Rose");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelIowa = new JLabel("State Bird: Eastern Goldfinch");
                       panel.add(birdLabel);
                        //add audio here
             
                       // Kansas
                       // State flag
                        JLabel flagLabelKansas = new JLabel(new ImageIcon("path/to/flag.png"));
                        panel.add(flagLabel);
                         // State description
                        JLabel descriptionLabelKansas = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                       panel.add(descriptionLabel);
                       //State Flower
                       JLabel flowerLabelKansas = new JLabel("State Flower: Sunflower");
                       panel.add(flowerLabel);
                       //State Bird
                        JLabel birdLabelKansas = new JLabel("State Bird: Western Meadowlark");
                        panel.add(birdLabel);
                                //add audio here
               
                       // Kentucky
                       // State flag
                       JLabel flagLabelKentucky = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelKentucky = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelKentucky = new JLabel("State Flower: Goldenrod Flower");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelKentucky = new JLabel("State Bird: Cardinal");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Louisiana
                       // State flag
                       JLabel flagLabelLouisiana = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelLouisiana = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelLouisiana = new JLabel("State Flower: Magnolia");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelLouisiana = new JLabel("State Bird: Eastern Brown Pelican");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Maine
                       // State flag
                       JLabel flagLabelMaine = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelMaine = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelMaine = new JLabel("State Flower: White Pine Cone and Tassel");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelMaine = new JLabel("State Bird: Chickadee");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Maryland
                       // State flag
                       JLabel flagLabelMaryland = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelMaryland = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelMaryland = new JLabel("State Flower: Black-eyed Susan");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelMaryland = new JLabel("State Bird: Baltimore Oriole");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Massachusetts
                       // State flag
                       JLabel flagLabelMassachusetts = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelMassachusetts = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelMassachusetts = new JLabel("State Flower: Trailing-Arbutus");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelMassachusetts = new JLabel("State Bird: Chickadee");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Michigan
                       // State flag
                       JLabel flagLabelMichigan = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelMichigan = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelMichigan = new JLabel("State Flower: Apple Blossom");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelMichigan = new JLabel("State Bird: Robin");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Minnesota
                       // State flag
                       JLabel flagLabelMinnesota = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelMinnesota = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelMinnesota = new JLabel("State Flower: Pink and White Lady Slipper");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelMinnesota = new JLabel("State Bird: Common Loon");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Mississippi
                       // State flag
                       JLabel flagLabelMississi = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelMississipi = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelMissippi = new JLabel("State Flower: Mangolia");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelMississippi = new JLabel("State Bird: Mockingbird");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Missouri
                       // State flag
                       JLabel flagLabelMissouri = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelMissouri = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelMissouri = new JLabel("State Flower: White Hawkthorn Blossom");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelMissouri = new JLabel("State Bird: Bluebird");
                       panel.add(birdLabel);
                        //add audio here
                      
                       // Montana
                       // State flag
                       JLabel flagLabelMontana = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelMontana = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelMontana = new JLabel("State Flower: Bitterroot");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelMontana = new JLabel("State Bird: Western Meadowlark");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Nebraska
                       // State flag
                       JLabel flagLabelNebraska = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelNebraska = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelNebraska = new JLabel("State Flower: Goldenrod");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelNebraska = new JLabel("State Bird: Western Meadowlark");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Nevada
                       // State flag
                       JLabel flagLabelNevada = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelNevada = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelNevada = new JLabel("State Flower: Sagebrush");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelNevada = new JLabel("State Bird: Mountain Bluebird");
                       panel.add(birdLabel);
                        //add audio here
         
                       // NewHampshire
                       // State flag
                       JLabel flagLabelNewHampshire = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelNewHampshire = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelNewHampshire = new JLabel("State Flower: Purple Lilac");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelNewHampshire = new JLabel("State Bird: Purple Finch");
                       panel.add(birdLabel);
                        //add audio here
         
                       // NewJersey
                       // State flag
                       JLabel flagLabelNewJersey = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelNewJersey = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelNewJersey = new JLabel("State Flower: Violet");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelNewJersey = new JLabel("State Bird: Eastern Goldfinch");
                       panel.add(birdLabel);
                        //add audio here
         
                       // NewMexico
                       // State flag
                       JLabel flagLabelNewMexico = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelNewMexico = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelNewMexico = new JLabel("State Flower: Yucca Flower");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelNewMexico = new JLabel("State Bird: RoadRunner");
                       panel.add(birdLabel);
                        //add audio here
         
                       // NewYork
                       // State flag
                       JLabel flagLabelNewYork = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelNewYork = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelNewYork = new JLabel("State Flower: Rose");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelNewYork = new JLabel("State Bird: Eastren Bluebird");
                       panel.add(birdLabel);
                        //add audio here
         
                       // North Carolina
                       // State flag
                       JLabel flagLabelNorthCarolina = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelNorthCarolina = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelNorthCarolina = new JLabel("State Flower: American Dogwood");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelNorthCarolina = new JLabel("State Bird: Cardinal");
                       panel.add(birdLabel);
                        //add audio here
         
                       // NorthDakota
                       // State flag
                       JLabel flagLabelNorthDakota = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelNorthDakota = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelNorthDakota = new JLabel("State Flower: Wild Prairie Rose");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelNorthDakota = new JLabel("State Bird: Western Meadowlark");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Ohio
                       // State flag
                       JLabel flagLabelOhio = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelOhio = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelOhio = new JLabel("State Flower: Scarlet Carnation");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelOhio = new JLabel("State Bird: Cardinal");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Oklahoma
                       // State flag
                       JLabel flagLabelOklahoma = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelOklahoma = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelOklahoma = new JLabel("State Flower: Oklahoma Rose");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelOklohamo = new JLabel("State Bird: Scissor-Tailed Flycatcher");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Oregon
                       // State flag
                       JLabel flagLabelOregon = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelOregon = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelOregon = new JLabel("State Flower: Oregon Grape");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelOregon = new JLabel("State Bird: Weastern Meadowlark");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Pennsylvania
                       // State flag
                       JLabel flagLabelPennsylvania = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelPennsylvania = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelPennsylvania = new JLabel("State Flower: Mountain Laurel");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelPennsylvania = new JLabel("State Bird: Ruffed Grouse");
                       panel.add(birdLabel);
                        //add audio here
         
                       // RhodeIsland
                       // State flag
                       JLabel flagLabelRhodeIsland = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelRhodeIsland = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelRhodeIsland = new JLabel("State Flower: Common Blue Violet");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelRhodeIsland = new JLabel("State Bird: Rhode Island Red Hen");
                       panel.add(birdLabel);
                        //add audio here
         
                       // SouthCarolina
                       // State flag
                       JLabel flagLabelSouthCarolina = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelSouthCarolina = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelSouthCarolina = new JLabel("State Flower: Yellow Jessamine");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelSouthCarolina = new JLabel("State Bird: Carolina Wren");
                       panel.add(birdLabel);
                        //add audio here
         
                       // SouthDakota
                       // State flag
                       JLabel flagLabelSouthDakota = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelSouthDakota = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelSouthDakota = new JLabel("State Flower: Americiana Pasque");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelSouthDakota = new JLabel("State Bird: Ring-necked Pheasant");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Tennessee
                       // State flag
                       JLabel flagLabelTennessee = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelTennessee = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelTennessee = new JLabel("State Flower: Iris");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelTennessee = new JLabel("State Bird: Mockingbird");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Texas
                       // State flag
                       JLabel flagLabelTexas = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelTexas = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelTexas = new JLabel("State Flower: Blue Bonnet");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelTexas = new JLabel("State Bird: Mockingbird");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Utah
                       // State flag
                       JLabel flagLabelUtah = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelUtah = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelUtah = new JLabel("State Flower: Sego Lily");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelUtah = new JLabel("State Bird: Ring-billed Gull");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Vermont
                       // State flag
                       JLabel flagLabelVermont = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelVermont = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelVermont = new JLabel("State Flower: Red Clover");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelVermont = new JLabel("State Bird: Hermit Thrush");
                       panel.add(birdLabel);
                        //add audio here
         
                       // Virginia
                       // State flag
                       JLabel flagLabelVirginia = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelVirginia = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelVirginia = new JLabel("State Flower: American Dogwood");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelVirginia = new JLabel("State Bird: Cardinal");
                       panel.add(birdLabel);
                        //add audio here
                      
                       // Washington
                       // State flag
                       JLabel flagLabelWashington = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelWashington = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelWashington = new JLabel("State Flower: Coast Rhododendron");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelWashington = new JLabel("State Bird: Willow Goldfinch");
                       panel.add(birdLabel);
                        //add audio here
                      
                       // WestVirginia
                       // State flag
                       JLabel flagLabelWestVirginia = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelWestVirginia = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelWestVirginia = new JLabel("State Flower: Rhododendron");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelWestVirginia = new JLabel("State Bird: Cardinal");
                       panel.add(birdLabel);
                        //add audio here
                      
                       // Wisconsin
                       // State flag
                       JLabel flagLabelWisconsin = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelWisconsin = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelWisconsin = new JLabel("State Flower: Wood Violet");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelWisconsin = new JLabel("State Bird: Robin");
                       panel.add(birdLabel);
                        //add audio here
                      
                       // Wyoming
                       // State flag
                       JLabel flagLabelWyoming = new JLabel(new ImageIcon("path/to/flag.png"));
                       panel.add(flagLabel);
                       // State description
                       JLabel descriptionLabelWyoming = new JLabel(
                               "<html>State Description: Beautiful landscapes, rich history, etc.</html>");
                        panel.add(descriptionLabel);
                        //State Flower
                         JLabel flowerLabelWyoming = new JLabel("State Flower: Indian Paintbrush");
                        panel.add(flowerLabel);
                       //State Bird
                       JLabel birdLabelWyoming = new JLabel("State Bird: Western Meadowlark");
                       panel.add(birdLabel);
                        //add audio here
                        JButton playSoundButtonWyoming = new JButton("Play Bird Sound");
                        playSoundButtonWyoming.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                playSound("path/to/wyomingbird.wav");
                        }
                        });
                        panel.add(playSoundButtonWyoming);
    

         
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
    }}
