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


public static void Mainmap(){
       // Create a new frame
    // Create the JPanel to hold the buttons
           // Create the JFrame (window)
           JFrame frame = new JFrame("United States Map");
           frame.setSize(1200, 900);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setLayout(new BorderLayout());
           
           // Set background image
           JLabel background = new JLabel(new ImageIcon("images/us.png"));
           frame.setContentPane(background);
           background.setLayout(new GridBagLayout());

     
        // Create buttons for each state
        JButton alabamaButton = new JButton("AL");
        JButton alaskaButton = new JButton("AK");
        JButton arizonaButton = new JButton("AZ"); 
        JButton arkansasButton = new JButton("AR");
        JButton californiaButton = new JButton("CA");
        JButton coloradoButton = new JButton("CO");
        JButton connecticutButton = new JButton("CT");
        JButton delawareButton = new JButton("DE");
        JButton floridaButton = new JButton("FL");
        JButton georgiaButton = new JButton("GA");
        JButton hawaiiButton = new JButton("HI");
        JButton idahoButton = new JButton("ID");
        JButton illinoisButton = new JButton("IL");
        JButton indianaButton = new JButton("IN");
        JButton iowaButton = new JButton("IA");
        JButton kansasButton = new JButton("KS");
        JButton kentuckyButton = new JButton("KY");
        JButton louisianaButton = new JButton("LA");
        JButton maineButton = new JButton("ME");
        JButton marylandButton = new JButton("MD");
        JButton massachusettsButton = new JButton("MA");
        JButton michiganButton = new JButton("MI");
        JButton minnesotaButton = new JButton("MN");
        JButton mississippiButton = new JButton("MS");
        JButton missouriButton = new JButton("MO");
        JButton montanaButton = new JButton("MT");
        JButton nebraskaButton = new JButton("NE");
        JButton nevadaButton = new JButton("NV");
        JButton newHampshireButton = new JButton("NH");
        JButton newJerseyButton = new JButton("NJ");
        JButton newMexicoButton = new JButton("NM");
        JButton newYorkButton = new JButton("NY");
        JButton northCarolinaButton = new JButton("NC");
        JButton northDakotaButton = new JButton("ND");
        JButton ohioButton = new JButton("OH");
        JButton oklahomaButton = new JButton("OK");
        JButton oregonButton = new JButton("OR");
        JButton pennsylvaniaButton = new JButton("PA");
        JButton rhodeIslandButton = new JButton("RI");
        JButton southCarolinaButton = new JButton("SC");
        JButton southDakotaButton = new JButton("SD");
        JButton tennesseeButton = new JButton("TN");
        JButton texasButton = new JButton("TX");
        JButton utahButton = new JButton("UT");
        JButton vermontButton = new JButton("VT");
        JButton virginiaButton = new JButton("VA");
        JButton washingtonButton = new JButton("WA");
        JButton westVirginiaButton = new JButton("WV");
        JButton wisconsinButton = new JButton("WI");
        JButton wyomingButton = new JButton("WY");

        // Set button properties
        //Alabama 
        alabamaButton.setOpaque(false);
        alabamaButton.setContentAreaFilled(false);
        alabamaButton.setBorderPainted(false);
        alabamaButton.setFocusPainted(false);
        
        //Alaska 
        alaskaButton.setOpaque(false);
        alaskaButton.setContentAreaFilled(false);
        alaskaButton.setBorderPainted(false);
        alaskaButton.setFocusPainted(false);

        //Arizona
        arizonaButton.setOpaque(false);
        arizonaButton.setContentAreaFilled(false);
        arizonaButton.setBorderPainted(false);
        arizonaButton.setFocusPainted(false);
        //Arkansas
        arkansasButton.setOpaque(false);
        arkansasButton.setContentAreaFilled(false);
        arkansasButton.setBorderPainted(false);
        arkansasButton.setFocusPainted(false);

        //California
        californiaButton.setOpaque(false);
        californiaButton.setContentAreaFilled(false);
        californiaButton.setBorderPainted(false);
        californiaButton.setFocusPainted(false);

        //Colorado
        coloradoButton.setOpaque(false);
        coloradoButton.setContentAreaFilled(false);
        coloradoButton.setBorderPainted(false);
        coloradoButton.setFocusPainted(false);

        //Connecticut
        connecticutButton.setOpaque(false);
        connecticutButton.setContentAreaFilled(false);
        connecticutButton.setBorderPainted(false);
        connecticutButton.setFocusPainted(false);

        //Delaware
        delawareButton.setOpaque(false);
        delawareButton.setContentAreaFilled(false);
        delawareButton.setBorderPainted(false);
        delawareButton.setFocusPainted(false);

        //Florida
        floridaButton.setOpaque(false);
        floridaButton.setContentAreaFilled(false);
        floridaButton.setBorderPainted(false);
        floridaButton.setFocusPainted(false);

        //Georgia
        georgiaButton.setOpaque(false);
        georgiaButton.setContentAreaFilled(false);
        georgiaButton.setBorderPainted(false);
        georgiaButton.setFocusPainted(false);

        //Hawaii
        hawaiiButton.setOpaque(false);
        hawaiiButton.setContentAreaFilled(false);
        hawaiiButton.setBorderPainted(false);
        hawaiiButton.setFocusPainted(false);

        //Idaho
        idahoButton.setOpaque(false);
        idahoButton.setContentAreaFilled(false);
        idahoButton.setBorderPainted(false);
        idahoButton.setFocusPainted(false);

        //Illinois
        illinoisButton.setOpaque(false);
        illinoisButton.setContentAreaFilled(false);
        illinoisButton.setBorderPainted(false);
        illinoisButton.setFocusPainted(false);

        //Indiana
        indianaButton.setOpaque(false);
        indianaButton.setContentAreaFilled(false);
        indianaButton.setBorderPainted(false);
        indianaButton.setFocusPainted(false);

        //Iowa
        iowaButton.setOpaque(false);
        iowaButton.setContentAreaFilled(false);
        iowaButton.setBorderPainted(false);
        iowaButton.setFocusPainted(false);

        //Kansas
        kansasButton.setOpaque(false);
        kansasButton.setContentAreaFilled(false);
        kansasButton.setBorderPainted(false);
        kansasButton.setFocusPainted(false);

        //Kentucky
        kentuckyButton.setOpaque(false);
        kentuckyButton.setContentAreaFilled(false);
        kentuckyButton.setBorderPainted(false);
        kentuckyButton.setFocusPainted(false);

        //Louisiana
        louisianaButton.setOpaque(false);
        louisianaButton.setContentAreaFilled(false);
        louisianaButton.setBorderPainted(false);
        louisianaButton.setFocusPainted(false);

        //Maine
        maineButton.setOpaque(false);
        maineButton.setContentAreaFilled(false);
        maineButton.setBorderPainted(false);
        maineButton.setFocusPainted(false);

        //Maryland
        marylandButton.setOpaque(false);
        marylandButton.setContentAreaFilled(false);
        marylandButton.setBorderPainted(false);
        marylandButton.setFocusPainted(false);

        //Massachusetts
        massachusettsButton.setOpaque(false);
        massachusettsButton.setContentAreaFilled(false);
        massachusettsButton.setBorderPainted(false);
        massachusettsButton.setFocusPainted(false);

        //Michigan
        michiganButton.setOpaque(false);
        michiganButton.setContentAreaFilled(false);
        michiganButton.setBorderPainted(false);
        michiganButton.setFocusPainted(false);

        //Minnesota
        minnesotaButton.setOpaque(false);
        minnesotaButton.setContentAreaFilled(false);
        minnesotaButton.setBorderPainted(false);
        minnesotaButton.setFocusPainted(false);

        //Mississippi
        mississippiButton.setOpaque(false);
        mississippiButton.setContentAreaFilled(false);
        mississippiButton.setBorderPainted(false);
        mississippiButton.setFocusPainted(false);

        //Missouri
        missouriButton.setOpaque(false);
        missouriButton.setContentAreaFilled(false);
        missouriButton.setBorderPainted(false);
        missouriButton.setFocusPainted(false);

        //Montana
        montanaButton.setOpaque(false);
        montanaButton.setContentAreaFilled(false);
        montanaButton.setBorderPainted(false);
        montanaButton.setFocusPainted(false);

        //Nebraska
        nebraskaButton.setOpaque(false);
        nebraskaButton.setContentAreaFilled(false);
        nebraskaButton.setBorderPainted(false);
        nebraskaButton.setFocusPainted(false);

        //Nevada
        nevadaButton.setOpaque(false);
        nevadaButton.setContentAreaFilled(false);
        nevadaButton.setBorderPainted(false);
        nevadaButton.setFocusPainted(false);

        //New Hampshire
        newHampshireButton.setOpaque(false);
        newHampshireButton.setContentAreaFilled(false);
        newHampshireButton.setBorderPainted(false);
        newHampshireButton.setFocusPainted(false);

        //New Jersey
        newJerseyButton.setOpaque(false);
        newJerseyButton.setContentAreaFilled(false);
        newJerseyButton.setBorderPainted(false);
        newJerseyButton.setFocusPainted(false);

        //New Mexico
        newMexicoButton.setOpaque(false);
        newMexicoButton.setContentAreaFilled(false);
        newMexicoButton.setBorderPainted(false);
        newMexicoButton.setFocusPainted(false);

        //New York
        newYorkButton.setOpaque(false);
        newYorkButton.setContentAreaFilled(false);
        newYorkButton.setBorderPainted(false);
        newYorkButton.setFocusPainted(false);

        //North Carolina
        northCarolinaButton.setOpaque(false);
        northCarolinaButton.setContentAreaFilled(false);
        northCarolinaButton.setBorderPainted(false);
        northCarolinaButton.setFocusPainted(false);

        //North Dakota
        northDakotaButton.setOpaque(false);
        northDakotaButton.setContentAreaFilled(false);
        northDakotaButton.setBorderPainted(false);
        northDakotaButton.setFocusPainted(false);

        //Ohio
        ohioButton.setOpaque(false);
        ohioButton.setContentAreaFilled(false);
        ohioButton.setBorderPainted(false);
        ohioButton.setFocusPainted(false);

        //Oklahoma
        oklahomaButton.setOpaque(false);
        oklahomaButton.setContentAreaFilled(false);
        oklahomaButton.setBorderPainted(false);
        oklahomaButton.setFocusPainted(false);

        //Oregon
        oregonButton.setOpaque(false);
        oregonButton.setContentAreaFilled(false);
        oregonButton.setBorderPainted(false);
        oregonButton.setFocusPainted(false);

        //Pennsylvania
        pennsylvaniaButton.setOpaque(false);
        pennsylvaniaButton.setContentAreaFilled(false);
        pennsylvaniaButton.setBorderPainted(false);
        pennsylvaniaButton.setFocusPainted(false);

        //Rhode Island
        rhodeIslandButton.setOpaque(false);
        rhodeIslandButton.setContentAreaFilled(false);
        rhodeIslandButton.setBorderPainted(false);
        rhodeIslandButton.setFocusPainted(false);

        //South Carolina
        southCarolinaButton.setOpaque(false);
        southCarolinaButton.setContentAreaFilled(false);
        southCarolinaButton.setBorderPainted(false);
        southCarolinaButton.setFocusPainted(false);

        //South Dakota
        southDakotaButton.setOpaque(false);
        southDakotaButton.setContentAreaFilled(false);
        southDakotaButton.setBorderPainted(false);
        southDakotaButton.setFocusPainted(false);

        //Tennessee
        tennesseeButton.setOpaque(false);
        tennesseeButton.setContentAreaFilled(false);
        tennesseeButton.setBorderPainted(false);
        tennesseeButton.setFocusPainted(false);

        //Texas
        texasButton.setOpaque(false);
        texasButton.setContentAreaFilled(false);
        texasButton.setBorderPainted(false);
        texasButton.setFocusPainted(false);

        //Utah
        utahButton.setOpaque(false);
        utahButton.setContentAreaFilled(false);
        utahButton.setBorderPainted(false);
        utahButton.setFocusPainted(false);

        //Vermont
        vermontButton.setOpaque(false);
        vermontButton.setContentAreaFilled(false);
        vermontButton.setBorderPainted(false);
        vermontButton.setFocusPainted(false);

        //Virginia
        virginiaButton.setOpaque(false);
        virginiaButton.setContentAreaFilled(false);
        virginiaButton.setBorderPainted(false);
        virginiaButton.setFocusPainted(false);

        //Washington
        washingtonButton.setOpaque(false);
        washingtonButton.setContentAreaFilled(false);
        washingtonButton.setBorderPainted(false);
        washingtonButton.setFocusPainted(false);

        //West Virginia
        westVirginiaButton.setOpaque(false);
        westVirginiaButton.setContentAreaFilled(false);
        westVirginiaButton.setBorderPainted(false);
        westVirginiaButton.setFocusPainted(false);

        //Wisconsin
        wisconsinButton.setOpaque(false);
        wisconsinButton.setContentAreaFilled(false);
        wisconsinButton.setBorderPainted(false);
        wisconsinButton.setFocusPainted(false);

        //Wyoming
        wyomingButton.setOpaque(false);
        wyomingButton.setContentAreaFilled(false);
        wyomingButton.setBorderPainted(false);
        wyomingButton.setFocusPainted(false);

      // Western States
washingtonButton.setBounds(120, 150, 80, 50);
oregonButton.setBounds(120, 210, 100, 70);
californiaButton.setBounds(80, 290, 120, 180);
idahoButton.setBounds(200, 160, 70, 200);
nevadaButton.setBounds(160, 300, 90, 150);
arizonaButton.setBounds(210, 460, 100, 80);
utahButton.setBounds(270, 300, 80, 120);
montanaButton.setBounds(260, 100, 130, 80);
wyomingButton.setBounds(290, 190, 110, 70);
coloradoButton.setBounds(330, 280, 100, 80);
newMexicoButton.setBounds(340, 380, 120, 70);

// Great Plains & Central States
northDakotaButton.setBounds(430, 110, 110, 60);
southDakotaButton.setBounds(430, 180, 110, 60);
nebraskaButton.setBounds(450, 250, 120, 60);
kansasButton.setBounds(470, 320, 110, 60);
oklahomaButton.setBounds(490, 380, 110, 60);
texasButton.setBounds(510, 450, 160, 120);

// Upper Midwest
minnesotaButton.setBounds(540, 110, 70, 140);
iowaButton.setBounds(550, 250, 70, 60);
missouriButton.setBounds(560, 310, 80, 90);
arkansasButton.setBounds(590, 400, 70, 50);
louisianaButton.setBounds(600, 450, 80, 60);
wisconsinButton.setBounds(610, 130, 60, 120);
illinoisButton.setBounds(620, 240, 60, 100);

// Deep South & Midwest to East
mississippiButton.setBounds(680, 460, 60, 90);
michiganButton.setBounds(690, 90, 70, 140);
indianaButton.setBounds(690, 260, 40, 60);
ohioButton.setBounds(730, 260, 50, 60);
kentuckyButton.setBounds(710, 330, 90, 40);
tennesseeButton.setBounds(720, 380, 110, 40);
alabamaButton.setBounds(780, 430, 60, 80);
georgiaButton.setBounds(840, 420, 80, 80);
floridaButton.setBounds(870, 500, 60, 140);
southCarolinaButton.setBounds(920, 430, 40, 60);
northCarolinaButton.setBounds(900, 370, 90, 50);

// Mid-Atlantic & East Coast
virginiaButton.setBounds(920, 320, 90, 40);
westVirginiaButton.setBounds(880, 300, 50, 50);
marylandButton.setBounds(970, 280, 40, 20);
delawareButton.setBounds(1010, 280, 20, 20);
pennsylvaniaButton.setBounds(930, 230, 80, 50);
newJerseyButton.setBounds(1010, 230, 20, 40);
newYorkButton.setBounds(960, 150, 100, 80);

// New England
connecticutButton.setBounds(1080, 180, 40, 20);
rhodeIslandButton.setBounds(1120, 200, 20, 20);
massachusettsButton.setBounds(1080, 140, 60, 30);
vermontButton.setBounds(1040, 100, 40, 50);
newHampshireButton.setBounds(1080, 90, 30, 60);
maineButton.setBounds(1120, 50, 60, 100);

// Alaska & Hawaii (Inset)
alaskaButton.setBounds(100, 750, 200, 100);
hawaiiButton.setBounds(360, 810, 60, 40);


        // Use absolute positioning
        background.setLayout(null);

        // Add buttons to background
        background.add(alabamaButton);
        background.add(alaskaButton);
        background.add(arizonaButton);
        background.add(arkansasButton);
        background.add(californiaButton);
        background.add(coloradoButton);
        background.add(connecticutButton);
        background.add(delawareButton);
        background.add(floridaButton);
        background.add(georgiaButton);
        background.add(hawaiiButton);
        background.add(idahoButton);
        background.add(illinoisButton);
        background.add(indianaButton);
        background.add(iowaButton);
        background.add(kansasButton);
        background.add(kentuckyButton);
        background.add(louisianaButton);
        background.add(maineButton);
        background.add(marylandButton);
        background.add(massachusettsButton);
        background.add(michiganButton);
        background.add(minnesotaButton);
        background.add(mississippiButton);
        background.add(missouriButton);
        background.add(montanaButton);
        background.add(nebraskaButton);
        background.add(nevadaButton);
        background.add(newHampshireButton);
        background.add(newJerseyButton);
        background.add(newMexicoButton);
        background.add(newYorkButton);
        background.add(northCarolinaButton);
        background.add(northDakotaButton);
        background.add(ohioButton);
        background.add(oklahomaButton);
        background.add(oregonButton);
        background.add(pennsylvaniaButton);
        background.add(rhodeIslandButton);
        background.add(southCarolinaButton);
        background.add(southDakotaButton);
        background.add(tennesseeButton);
        background.add(texasButton);
        background.add(utahButton);
        background.add(vermontButton);
        background.add(virginiaButton);
        background.add(washingtonButton);
        background.add(westVirginiaButton);
        background.add(wisconsinButton);
        background.add(wyomingButton);

        // Add click handlers
        alabamaButton.addActionListener(e -> Alabama());
        alaskaButton.addActionListener(e -> Alaska());
        arizonaButton.addActionListener(e -> Arizona());
        arkansasButton.addActionListener(e -> Arkansas());
        californiaButton.addActionListener(e -> California());
        coloradoButton.addActionListener(e -> Colorado());
        connecticutButton.addActionListener(e -> Connecticut());
        delawareButton.addActionListener(e -> Delaware());
        floridaButton.addActionListener(e -> Florida());
        georgiaButton.addActionListener(e -> Georgia());
        hawaiiButton.addActionListener(e -> Hawaii());
        idahoButton.addActionListener(e -> Idaho());
        illinoisButton.addActionListener(e -> Illinois());
        indianaButton.addActionListener(e -> Indiana());
        iowaButton.addActionListener(e -> Iowa());
        kansasButton.addActionListener(e -> Kansas());
        kentuckyButton.addActionListener(e -> Kentucky());
        louisianaButton.addActionListener(e -> Louisiana());
        maineButton.addActionListener(e -> Maine());
        marylandButton.addActionListener(e -> Maryland());
        massachusettsButton.addActionListener(e -> Massachusetts());
        michiganButton.addActionListener(e -> Michigan());
        minnesotaButton.addActionListener(e -> Minnesota());
        mississippiButton.addActionListener(e -> Mississippi());
        missouriButton.addActionListener(e -> Missouri());
        montanaButton.addActionListener(e -> Montana());
        nebraskaButton.addActionListener(e -> Nebraska());
        nevadaButton.addActionListener(e -> Nevada());
        newHampshireButton.addActionListener(e -> NewHampshire());
        newJerseyButton.addActionListener(e -> NewJersey());
        newMexicoButton.addActionListener(e -> NewMexico());
        newYorkButton.addActionListener(e -> NewYork());
        northCarolinaButton.addActionListener(e -> NorthCarolina());
        northDakotaButton.addActionListener(e -> NorthDakota());
        ohioButton.addActionListener(e -> Ohio());
        oklahomaButton.addActionListener(e -> Oklahoma());
        oregonButton.addActionListener(e -> Oregon());
        pennsylvaniaButton.addActionListener(e -> Pennsylvania());
        rhodeIslandButton.addActionListener(e -> RhodeIsland());
        southCarolinaButton.addActionListener(e -> SouthCarolina());
        southDakotaButton.addActionListener(e -> SouthDakota());
        tennesseeButton.addActionListener(e -> Tennessee());
        texasButton.addActionListener(e -> Texas());
        utahButton.addActionListener(e -> Utah());
        vermontButton.addActionListener(e -> Vermont());
        virginiaButton.addActionListener(e -> Virginia());
        washingtonButton.addActionListener(e -> Washington());
        westVirginiaButton.addActionListener(e -> WestVirginia());
        wisconsinButton.addActionListener(e -> Wisconsin());
        wyomingButton.addActionListener(e -> Wyoming());




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
                        JLabel flagLabelAlabama = new JLabel(new ImageIcon("images/flags/Alabamaflg.png"));
                        panel.add(flagLabelAlabama);

                        // State description
                        JTextArea descriptionTextAlabama = new JTextArea(
                                                        "Known for its role in the Civil Rights Movement and sweet southern charm.\r\n" + //
                                                                                                                                                                        "");
                        descriptionTextAlabama.setLineWrap(true);
                        descriptionTextAlabama.setWrapStyleWord(true);
                        descriptionTextAlabama.setEditable(false);
                        descriptionTextAlabama.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size
                        panel.add(descriptionTextAlabama);

                        // State Flower
                        JLabel flowerImageAlabama = new JLabel(new ImageIcon("images/flowers/alabama.jpg.jpg"));
                        panel.add(flowerImageAlabama);

                        // State Bird
                        JLabel birdImageAlabama = new JLabel(new ImageIcon("images/birds/Alabama.jpg"));
                        panel.add(birdImageAlabama);

                        // Play Bird Song button
                        JButton playBirdSongButtonAlabama = new JButton("Play Yellowhammer Song");
                        playBirdSongButtonAlabama.addActionListener(e -> playSound("path/to/yellowhammer_song.wav"));
                        panel.add(playBirdSongButtonAlabama);

                        // Set frame visibility
                        frame.setVisible(true);
                }

                // Alaska
private static void Alaska() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Alaskaflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/alaska.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Alaska.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    } 

    // Arizona
private static void Arizona() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Arizonaflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/arizona.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Arizona.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    } 

    // Arkansas
private static void Arkansas() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Arkansasflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/arkansas.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Arkansas.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    } 
    
// California
private static void California() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Californiaflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/california.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/California.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    } 
    
    // Colorado
private static void Colorado() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Coloradoflg.png")); 
        panel.add(flagLabelState); 
        
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
        
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/colorado.jpg.jpg")); 
        panel.add(flowerImageState); 
        
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Colorado.jpg")); 
        panel.add(birdImageState); 
        
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
        
        frame.setVisible(true);
    } 
    

    // Connecticut
private static void Connecticut() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Connecticutflg.png"));
        panel.add(flagLabelState);
        JTextArea descriptionTextState = new JTextArea("Description");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/connecticut.jpg.jpg"));
        panel.add(flowerImageState);
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Connecticut.jpg"));
        panel.add(birdImageState);
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song");
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav"));
        panel.add(playBirdSongButtonState);
        frame.setVisible(true);
    }
    
    // Delaware
    private static void Delaware() {
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Delawareflg.png"));
        panel.add(flagLabelState);
        JTextArea descriptionTextState = new JTextArea("Description");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/delaware.jpg.jpg"));
        panel.add(flowerImageState);
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Delaware.jpg"));
        panel.add(birdImageState);
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song");
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav"));
        panel.add(playBirdSongButtonState);
        frame.setVisible(true);
    }

    // Florida
private static void Florida() { 
        // Create the main frame
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        
        // State flag
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Floridaflg.png")); 
        panel.add(flagLabelState); 
    
        // State description
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextState); 
    
        // State Flower
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/florida.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        // State Bird
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Florida.jpg")); 
        panel.add(birdImageState); 
    
        // Play Bird Song button
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        // Set frame visibility
        frame.setVisible(true);
    } 
    // Georgia
private static void Georgia() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Georgiaflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/georgia.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Georgia.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    }
    
// Hawaii
private static void Hawaii() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Hawaiiflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/hawaii.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Hawaii.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    }
    // Idaho
private static void Idaho() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Idahoflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/idaho.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Idaho.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    }
    // Illinois
private static void Illinois() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Illinoisflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/illinois.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Illinois.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    }
    // Indiana
private static void Indiana() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Indianaflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/indiana.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Indiana.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    }
    // Iowa
private static void Iowa() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Iowaflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/iowa.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Iowa.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    }
    // Kansas
private static void Kansas() { 
        JFrame frame = new JFrame("State Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Kansasflg.png")); 
        panel.add(flagLabelState); 
    
        JTextArea descriptionTextState = new JTextArea("Description"); 
        descriptionTextState.setLineWrap(true); 
        descriptionTextState.setWrapStyleWord(true); 
        descriptionTextState.setEditable(false); 
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16)); 
        panel.add(descriptionTextState); 
    
        JLabel flowerImageState = new JLabel(new ImageIcon("images/flowers/kansas.jpg.jpg")); 
        panel.add(flowerImageState); 
    
        JLabel birdImageState = new JLabel(new ImageIcon("images/birds/Kansas.jpg")); 
        panel.add(birdImageState); 
    
        JButton playBirdSongButtonState = new JButton("Play Yellowhammer Song"); 
        playBirdSongButtonState.addActionListener(e -> playSound("path/to/yellowhammer_song.wav")); 
        panel.add(playBirdSongButtonState); 
    
        frame.setVisible(true);
    }
    // Kentucky

private static void Kentucky() { 

        // Create the main frame
        JFrame frame = new JFrame("Kentucky Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelKentucky = new JLabel(new ImageIcon("images/flags/Kentuckyflg.png")); 
        panel.add(flagLabelKentucky); 
    
        // State description
        JTextArea descriptionTextKentucky = new JTextArea(
            "Kentucky, known as the Bluegrass State, is famous for its horse racing, bourbon, and natural beauty."
        ); 
        descriptionTextKentucky.setLineWrap(true); 
        descriptionTextKentucky.setWrapStyleWord(true); 
        descriptionTextKentucky.setEditable(false); 
        descriptionTextKentucky.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextKentucky); 
    
        // State Flower
        JLabel flowerImageKentucky = new JLabel(new ImageIcon("images/flowers/KentuckyFlower.jpg")); 
        panel.add(flowerImageKentucky); 
    
        // State Bird
        JLabel birdImageKentucky = new JLabel(new ImageIcon("images/birds/KentuckyBird.jpg")); 
        panel.add(birdImageKentucky); 
    
        // Play Bird Song button
        JButton playBirdSongButtonKentucky = new JButton("Play Cardinal Song"); 
        playBirdSongButtonKentucky.addActionListener(e -> playSound("path/to/cardinal_song.wav")); 
        panel.add(playBirdSongButtonKentucky); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Louisiana
    
    private static void Louisiana() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Louisiana Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelLouisiana = new JLabel(new ImageIcon("images/flags/Louisianaflg.png")); 
        panel.add(flagLabelLouisiana); 
    
        // State description
        JTextArea descriptionTextLouisiana = new JTextArea(
            "Louisiana is renowned for its vibrant culture, Creole cuisine, and the lively city of New Orleans."
        ); 
        descriptionTextLouisiana.setLineWrap(true); 
        descriptionTextLouisiana.setWrapStyleWord(true); 
        descriptionTextLouisiana.setEditable(false); 
        descriptionTextLouisiana.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextLouisiana); 
    
        // State Flower
        JLabel flowerImageLouisiana = new JLabel(new ImageIcon("images/flowers/LouisianaFlower.jpg")); 
        panel.add(flowerImageLouisiana); 
    
        // State Bird
        JLabel birdImageLouisiana = new JLabel(new ImageIcon("images/birds/LouisianaBird.jpg")); 
        panel.add(birdImageLouisiana); 
    
        // Play Bird Song button
        JButton playBirdSongButtonLouisiana = new JButton("Play Brown Pelican Song"); 
        playBirdSongButtonLouisiana.addActionListener(e -> playSound("path/to/brown_pelican_song.wav")); 
        panel.add(playBirdSongButtonLouisiana); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Maine
    
    private static void Maine() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Maine Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelMaine = new JLabel(new ImageIcon("images/flags/Maineflg.png")); 
        panel.add(flagLabelMaine); 
    
        // State description
        JTextArea descriptionTextMaine = new JTextArea(
            "Maine, known for its picturesque coastline, maritime history, and natural landscapes, is a favorite destination for nature lovers."
        ); 
        descriptionTextMaine.setLineWrap(true); 
        descriptionTextMaine.setWrapStyleWord(true); 
        descriptionTextMaine.setEditable(false); 
        descriptionTextMaine.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextMaine); 
    
        // State Flower
        JLabel flowerImageMaine = new JLabel(new ImageIcon("images/flowers/MaineFlower.jpg")); 
        panel.add(flowerImageMaine); 
    
        // State Bird
        JLabel birdImageMaine = new JLabel(new ImageIcon("images/birds/MaineBird.jpg")); 
        panel.add(birdImageMaine); 
    
        // Play Bird Song button
        JButton playBirdSongButtonMaine = new JButton("Play Black-capped Chickadee Song"); 
        playBirdSongButtonMaine.addActionListener(e -> playSound("path/to/chickadee_song.wav")); 
        panel.add(playBirdSongButtonMaine); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Maryland
    
    private static void Maryland() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Maryland Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelMaryland = new JLabel(new ImageIcon("images/flags/Marylandflg.png")); 
        panel.add(flagLabelMaryland); 
    
        // State description
        JTextArea descriptionTextMaryland = new JTextArea(
            "Maryland, known as the Old Line State, boasts a rich history, diverse landscapes, and vibrant cultural heritage."
        ); 
        descriptionTextMaryland.setLineWrap(true); 
        descriptionTextMaryland.setWrapStyleWord(true); 
        descriptionTextMaryland.setEditable(false); 
        descriptionTextMaryland.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextMaryland); 
    
        // State Flower
        JLabel flowerImageMaryland = new JLabel(new ImageIcon("images/flowers/MarylandFlower.jpg")); 
        panel.add(flowerImageMaryland); 
    
        // State Bird
        JLabel birdImageMaryland = new JLabel(new ImageIcon("images/birds/MarylandBird.jpg")); 
        panel.add(birdImageMaryland); 
    
        // Play Bird Song button
        JButton playBirdSongButtonMaryland = new JButton("Play Baltimore Oriole Song"); 
        playBirdSongButtonMaryland.addActionListener(e -> playSound("path/to/baltimore_oriole_song.wav")); 
        panel.add(playBirdSongButtonMaryland); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Massachusetts
    
    private static void Massachusetts() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Massachusetts Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelMassachusetts = new JLabel(new ImageIcon("images/flags/Massachusettsflg.png")); 
        panel.add(flagLabelMassachusetts); 
    
        // State description
        JTextArea descriptionTextMassachusetts = new JTextArea(
            "Massachusetts, known for its significant Colonial history, prestigious universities, and vibrant cities like Boston."
        ); 
        descriptionTextMassachusetts.setLineWrap(true); 
        descriptionTextMassachusetts.setWrapStyleWord(true); 
        descriptionTextMassachusetts.setEditable(false); 
        descriptionTextMassachusetts.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextMassachusetts); 
    
        // State Flower
        JLabel flowerImageMassachusetts = new JLabel(new ImageIcon("images/flowers/MassachusettsFlower.jpg")); 
        panel.add(flowerImageMassachusetts); 
    
        // State Bird
        JLabel birdImageMassachusetts = new JLabel(new ImageIcon("images/birds/MassachusettsBird.jpg")); 
        panel.add(birdImageMassachusetts); 
    
        // Play Bird Song button
        JButton playBirdSongButtonMassachusetts = new JButton("Play Black-capped Chickadee Song"); 
        playBirdSongButtonMassachusetts.addActionListener(e -> playSound("path/to/chickadee_song.wav")); 
        panel.add(playBirdSongButtonMassachusetts); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Michigan
    
    private static void Michigan() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Michigan Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelMichigan = new JLabel(new ImageIcon("images/flags/Michiganflg.png")); 
        panel.add(flagLabelMichigan); 
    
        // State description
        JTextArea descriptionTextMichigan = new JTextArea(
            "Michigan, the Great Lakes State, is famous for its automotive industry, stunning lakeshores, and vibrant cities like Detroit."
        ); 
        descriptionTextMichigan.setLineWrap(true); 
        descriptionTextMichigan.setWrapStyleWord(true); 
        descriptionTextMichigan.setEditable(false); 
        descriptionTextMichigan.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextMichigan); 
    
        // State Flower
        JLabel flowerImageMichigan = new JLabel(new ImageIcon("images/flowers/MichiganFlower.jpg")); 
        panel.add(flowerImageMichigan); 
    
        // State Bird
        JLabel birdImageMichigan = new JLabel(new ImageIcon("images/birds/MichiganBird.jpg")); 
        panel.add(birdImageMichigan); 
    
        // Play Bird Song button
        JButton playBirdSongButtonMichigan = new JButton("Play American Robin Song"); 
        playBirdSongButtonMichigan.addActionListener(e -> playSound("path/to/robin_song.wav")); 
        panel.add(playBirdSongButtonMichigan); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Minnesota
    
    private static void Minnesota() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Minnesota Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelMinnesota = new JLabel(new ImageIcon("images/flags/Minnesotaflg.png")); 
        panel.add(flagLabelMinnesota); 
    
        // State description
        JTextArea descriptionTextMinnesota = new JTextArea(
            "Minnesota, the Land of 10,000 Lakes, is known for its beautiful waterways, vibrant arts scene, and friendly communities."
        ); 
        descriptionTextMinnesota.setLineWrap(true); 
        descriptionTextMinnesota.setWrapStyleWord(true); 
        descriptionTextMinnesota.setEditable(false); 
        descriptionTextMinnesota.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextMinnesota); 
    
        // State Flower
        JLabel flowerImageMinnesota = new JLabel(new ImageIcon("images/flowers/MinnesotaFlower.jpg")); 
        panel.add(flowerImageMinnesota); 
    
        // State Bird
        JLabel birdImageMinnesota = new JLabel(new ImageIcon("images/birds/MinnesotaBird.jpg")); 
        panel.add(birdImageMinnesota); 
    
        // Play Bird Song button
        JButton playBirdSongButtonMinnesota = new JButton("Play Common Loon Song"); 
        playBirdSongButtonMinnesota.addActionListener(e -> playSound("path/to/loon_song.wav")); 
        panel.add(playBirdSongButtonMinnesota); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Mississippi
    
    private static void Mississippi() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Mississippi Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelMississippi = new JLabel(new ImageIcon("images/flags/Mississippiflg.png")); 
        panel.add(flagLabelMississippi); 
    
        // State description
        JTextArea descriptionTextMississippi = new JTextArea(
            "Mississippi, named after the mighty Mississippi River, is rich in cultural heritage, blues music, and southern charm."
        ); 
        descriptionTextMississippi.setLineWrap(true); 
        descriptionTextMississippi.setWrapStyleWord(true); 
        descriptionTextMississippi.setEditable(false); 
        descriptionTextMississippi.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextMississippi); 
    
        // State Flower
        JLabel flowerImageMississippi = new JLabel(new ImageIcon("images/flowers/MississippiFlower.jpg")); 
        panel.add(flowerImageMississippi); 
    
        // State Bird
        JLabel birdImageMississippi = new JLabel(new ImageIcon("images/birds/MississippiBird.jpg")); 
        panel.add(birdImageMississippi); 
    
        // Play Bird Song button
        JButton playBirdSongButtonMississippi = new JButton("Play Northern Mockingbird Song"); 
        playBirdSongButtonMississippi.addActionListener(e -> playSound("path/to/mockingbird_song.wav")); 
        panel.add(playBirdSongButtonMississippi); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Missouri
    
    private static void Missouri() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Missouri Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelMissouri = new JLabel(new ImageIcon("images/flags/Missouriflg.png")); 
        panel.add(flagLabelMissouri); 
    
        // State description
        JTextArea descriptionTextMissouri = new JTextArea(
            "Missouri, the Show Me State, is known for its diverse landscapes, from the Ozarks to bustling cities like St. Louis and Kansas City."
        ); 
        descriptionTextMissouri.setLineWrap(true); 
        descriptionTextMissouri.setWrapStyleWord(true); 
        descriptionTextMissouri.setEditable(false); 
        descriptionTextMissouri.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextMissouri); 
    
        // State Flower
        JLabel flowerImageMissouri = new JLabel(new ImageIcon("images/flowers/MissouriFlower.jpg")); 
        panel.add(flowerImageMissouri); 
    
        // State Bird
        JLabel birdImageMissouri = new JLabel(new ImageIcon("images/birds/MissouriBird.jpg")); 
        panel.add(birdImageMissouri); 
    
        // Play Bird Song button
        JButton playBirdSongButtonMissouri = new JButton("Play Eastern Bluebird Song"); 
        playBirdSongButtonMissouri.addActionListener(e -> playSound("path/to/bluebird_song.wav")); 
        panel.add(playBirdSongButtonMissouri); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Montana
    
    private static void Montana() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Montana Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelMontana = new JLabel(new ImageIcon("images/flags/Montanaflg.png")); 
        panel.add(flagLabelMontana); 
    
        // State description
        JTextArea descriptionTextMontana = new JTextArea(
            "Montana, known as Big Sky Country, offers stunning natural beauty, including Yellowstone National Park and expansive wilderness areas."
        ); 
        descriptionTextMontana.setLineWrap(true); 
        descriptionTextMontana.setWrapStyleWord(true); 
        descriptionTextMontana.setEditable(false); 
        descriptionTextMontana.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextMontana); 
    
        // State Flower
        JLabel flowerImageMontana = new JLabel(new ImageIcon("images/flowers/MontanaFlower.jpg")); 
        panel.add(flowerImageMontana); 
    
        // State Bird
        JLabel birdImageMontana = new JLabel(new ImageIcon("images/birds/MontanaBird.jpg")); 
        panel.add(birdImageMontana); 
    
        // Play Bird Song button
        JButton playBirdSongButtonMontana = new JButton("Play Western Meadowlark Song"); 
        playBirdSongButtonMontana.addActionListener(e -> playSound("path/to/meadowlark_song.wav")); 
        panel.add(playBirdSongButtonMontana); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Nebraska
    
    private static void Nebraska() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Nebraska Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelNebraska = new JLabel(new ImageIcon("images/flags/Nebraskaflg.png")); 
        panel.add(flagLabelNebraska); 
    
        // State description
        JTextArea descriptionTextNebraska = new JTextArea(
            "Nebraska, known for its prairies and agriculture, is home to vibrant cities like Omaha and Lincoln, rich in culture and history."
        ); 
        descriptionTextNebraska.setLineWrap(true); 
        descriptionTextNebraska.setWrapStyleWord(true); 
        descriptionTextNebraska.setEditable(false); 
        descriptionTextNebraska.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextNebraska); 
    
        // State Flower
        JLabel flowerImageNebraska = new JLabel(new ImageIcon("images/flowers/NebraskaFlower.jpg")); 
        panel.add(flowerImageNebraska); 
    
        // State Bird
        JLabel birdImageNebraska = new JLabel(new ImageIcon("images/birds/NebraskaBird.jpg")); 
        panel.add(birdImageNebraska); 
    
        // Play Bird Song button
        JButton playBirdSongButtonNebraska = new JButton("Play Western Meadowlark Song"); 
        playBirdSongButtonNebraska.addActionListener(e -> playSound("path/to/meadowlark_song.wav")); 
        panel.add(playBirdSongButtonNebraska); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Nevada
    
    private static void Nevada() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Nevada Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelNevada = new JLabel(new ImageIcon("images/flags/Nevadaflg.png")); 
        panel.add(flagLabelNevada); 
    
        // State description
        JTextArea descriptionTextNevada = new JTextArea(
            "Nevada, the Silver State, is famous for its vibrant nightlife in Las Vegas, vast deserts, and stunning mountain ranges."
        ); 
        descriptionTextNevada.setLineWrap(true); 
        descriptionTextNevada.setWrapStyleWord(true); 
        descriptionTextNevada.setEditable(false); 
        descriptionTextNevada.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextNevada); 
    
        // State Flower
        JLabel flowerImageNevada = new JLabel(new ImageIcon("images/flowers/NevadaFlower.jpg")); 
        panel.add(flowerImageNevada); 
    
        // State Bird
        JLabel birdImageNevada = new JLabel(new ImageIcon("images/birds/NevadaBird.jpg")); 
        panel.add(birdImageNevada); 
    
        // Play Bird Song button
        JButton playBirdSongButtonNevada = new JButton("Play Mountain Bluebird Song"); 
        playBirdSongButtonNevada.addActionListener(e -> playSound("path/to/bluebird_song.wav")); 
        panel.add(playBirdSongButtonNevada); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // New Hampshire
    
    private static void NewHampshire() { 
    
        // Create the main frame
        JFrame frame = new JFrame("New Hampshire Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelNewHampshire = new JLabel(new ImageIcon("images/flags/NewHampshireflg.png")); 
        panel.add(flagLabelNewHampshire); 
    
        // State description
        JTextArea descriptionTextNewHampshire = new JTextArea(
            "New Hampshire, known for its quaint towns and large expanses of wilderness, offers stunning fall foliage and outdoor activities."
        ); 
        descriptionTextNewHampshire.setLineWrap(true); 
        descriptionTextNewHampshire.setWrapStyleWord(true); 
        descriptionTextNewHampshire.setEditable(false); 
        descriptionTextNewHampshire.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextNewHampshire); 
    
        // State Flower
        JLabel flowerImageNewHampshire = new JLabel(new ImageIcon("images/flowers/NewHampshireFlower.jpg")); 
        panel.add(flowerImageNewHampshire); 
    
        // State Bird
        JLabel birdImageNewHampshire = new JLabel(new ImageIcon("images/birds/NewHampshireBird.jpg")); 
        panel.add(birdImageNewHampshire); 
    
        // Play Bird Song button
        JButton playBirdSongButtonNewHampshire = new JButton("Play Purple Finch Song"); 
        playBirdSongButtonNewHampshire.addActionListener(e -> playSound("path/to/finch_song.wav")); 
        panel.add(playBirdSongButtonNewHampshire); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // New Jersey
    
    private static void NewJersey() { 
    
        // Create the main frame
        JFrame frame = new JFrame("New Jersey Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelNewJersey = new JLabel(new ImageIcon("images/flags/NewJerseyflg.png")); 
        panel.add(flagLabelNewJersey); 
    
        // State description
        JTextArea descriptionTextNewJersey = new JTextArea(
            "New Jersey, the Garden State, is known for its beaches, diverse culture, and significant historical landmarks."
        ); 
        descriptionTextNewJersey.setLineWrap(true); 
        descriptionTextNewJersey.setWrapStyleWord(true); 
        descriptionTextNewJersey.setEditable(false); 
        descriptionTextNewJersey.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextNewJersey); 
    
        // State Flower
        JLabel flowerImageNewJersey = new JLabel(new ImageIcon("images/flowers/NewJerseyFlower.jpg")); 
        panel.add(flowerImageNewJersey); 
    
        // State Bird
        JLabel birdImageNewJersey = new JLabel(new ImageIcon("images/birds/NewJerseyBird.jpg")); 
        panel.add(birdImageNewJersey); 
    
        // Play Bird Song button
        JButton playBirdSongButtonNewJersey = new JButton("Play American Goldfinch Song"); 
        playBirdSongButtonNewJersey.addActionListener(e -> playSound("path/to/goldfinch_song.wav")); 
        panel.add(playBirdSongButtonNewJersey); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    // New Mexico

private static void NewMexico() { 

        // Create the main frame
        JFrame frame = new JFrame("New Mexico Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelNewMexico = new JLabel(new ImageIcon("images/flags/NewMexicoflg.png")); 
        panel.add(flagLabelNewMexico); 
    
        // State description
        JTextArea descriptionTextNewMexico = new JTextArea(
            "New Mexico, the Land of Enchantment, is renowned for its rich cultural heritage, stunning deserts, and vibrant arts scene."
        ); 
        descriptionTextNewMexico.setLineWrap(true); 
        descriptionTextNewMexico.setWrapStyleWord(true); 
        descriptionTextNewMexico.setEditable(false); 
        descriptionTextNewMexico.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextNewMexico); 
    
        // State Flower
        JLabel flowerImageNewMexico = new JLabel(new ImageIcon("images/flowers/NewMexicoFlower.jpg")); 
        panel.add(flowerImageNewMexico); 
    
        // State Bird
        JLabel birdImageNewMexico = new JLabel(new ImageIcon("images/birds/NewMexicoBird.jpg")); 
        panel.add(birdImageNewMexico); 
    
        // Play Bird Song button
        JButton playBirdSongButtonNewMexico = new JButton("Play Greater Roadrunner Song"); 
        playBirdSongButtonNewMexico.addActionListener(e -> playSound("path/to/roadrunner_song.wav")); 
        panel.add(playBirdSongButtonNewMexico); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // New York
    
    private static void NewYork() { 
    
        // Create the main frame
        JFrame frame = new JFrame("New York Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelNewYork = new JLabel(new ImageIcon("images/flags/NewYorkflg.png")); 
        panel.add(flagLabelNewYork); 
    
        // State description
        JTextArea descriptionTextNewYork = new JTextArea(
            "New York, the Empire State, is famous for its iconic cities like New York City, diverse culture, and significant historical landmarks."
        ); 
        descriptionTextNewYork.setLineWrap(true); 
        descriptionTextNewYork.setWrapStyleWord(true); 
        descriptionTextNewYork.setEditable(false); 
        descriptionTextNewYork.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextNewYork); 
    
        // State Flower
        JLabel flowerImageNewYork = new JLabel(new ImageIcon("images/flowers/NewYorkFlower.jpg")); 
        panel.add(flowerImageNewYork); 
    
        // State Bird
        JLabel birdImageNewYork = new JLabel(new ImageIcon("images/birds/NewYorkBird.jpg")); 
        panel.add(birdImageNewYork); 
    
        // Play Bird Song button
        JButton playBirdSongButtonNewYork = new JButton("Play Eastern Bluebird Song"); 
        playBirdSongButtonNewYork.addActionListener(e -> playSound("path/to/bluebird_song.wav")); 
        panel.add(playBirdSongButtonNewYork); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // North Carolina
    
    private static void NorthCarolina() { 
    
        // Create the main frame
        JFrame frame = new JFrame("North Carolina Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelNorthCarolina = new JLabel(new ImageIcon("images/flags/NorthCarolinaflg.png")); 
        panel.add(flagLabelNorthCarolina); 
    
        // State description
        JTextArea descriptionTextNorthCarolina = new JTextArea(
            "North Carolina, known for its diverse landscapes from the Atlantic Coast to the Appalachian Mountains, offers rich history and vibrant cities."
        ); 
        descriptionTextNorthCarolina.setLineWrap(true); 
        descriptionTextNorthCarolina.setWrapStyleWord(true); 
        descriptionTextNorthCarolina.setEditable(false); 
        descriptionTextNorthCarolina.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextNorthCarolina); 
    
        // State Flower
        JLabel flowerImageNorthCarolina = new JLabel(new ImageIcon("images/flowers/NorthCarolinaFlower.jpg")); 
        panel.add(flowerImageNorthCarolina); 
    
        // State Bird
        JLabel birdImageNorthCarolina = new JLabel(new ImageIcon("images/birds/NorthCarolinaBird.jpg")); 
        panel.add(birdImageNorthCarolina); 
    
        // Play Bird Song button
        JButton playBirdSongButtonNorthCarolina = new JButton("Play Cardinal Song"); 
        playBirdSongButtonNorthCarolina.addActionListener(e -> playSound("path/to/cardinal_song.wav")); 
        panel.add(playBirdSongButtonNorthCarolina); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // North Dakota
    
    private static void NorthDakota() { 
    
        // Create the main frame
        JFrame frame = new JFrame("North Dakota Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelNorthDakota = new JLabel(new ImageIcon("images/flags/NorthDakotaflg.png")); 
        panel.add(flagLabelNorthDakota); 
    
        // State description
        JTextArea descriptionTextNorthDakota = new JTextArea(
            "North Dakota, known for its vast plains and rugged beauty, is rich in Native American heritage and offers stunning natural landscapes."
        ); 
        descriptionTextNorthDakota.setLineWrap(true); 
        descriptionTextNorthDakota.setWrapStyleWord(true); 
        descriptionTextNorthDakota.setEditable(false); 
        descriptionTextNorthDakota.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextNorthDakota); 
    
        // State Flower
        JLabel flowerImageNorthDakota = new JLabel(new ImageIcon("images/flowers/NorthDakotaFlower.jpg")); 
        panel.add(flowerImageNorthDakota); 
    
        // State Bird
        JLabel birdImageNorthDakota = new JLabel(new ImageIcon("images/birds/NorthDakotaBird.jpg")); 
        panel.add(birdImageNorthDakota); 
    
        // Play Bird Song button
        JButton playBirdSongButtonNorthDakota = new JButton("Play Western Meadowlark Song"); 
        playBirdSongButtonNorthDakota.addActionListener(e -> playSound("path/to/meadowlark_song.wav")); 
        panel.add(playBirdSongButtonNorthDakota); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Ohio
    
    private static void Ohio() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Ohio Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelOhio = new JLabel(new ImageIcon("images/flags/Ohioflg.png")); 
        panel.add(flagLabelOhio); 
    
        // State description
        JTextArea descriptionTextOhio = new JTextArea(
            "Ohio, the Buckeye State, is known for its diverse economy, rich history, and vibrant cities like Columbus and Cleveland."
        ); 
        descriptionTextOhio.setLineWrap(true); 
        descriptionTextOhio.setWrapStyleWord(true); 
        descriptionTextOhio.setEditable(false); 
        descriptionTextOhio.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextOhio); 
    
        // State Flower
        JLabel flowerImageOhio = new JLabel(new ImageIcon("images/flowers/OhioFlower.jpg")); 
        panel.add(flowerImageOhio); 
    
        // State Bird
        JLabel birdImageOhio = new JLabel(new ImageIcon("images/birds/OhioBird.jpg")); 
        panel.add(birdImageOhio); 
    
        // Play Bird Song button
        JButton playBirdSongButtonOhio = new JButton("Play Cardinal Song"); 
        playBirdSongButtonOhio.addActionListener(e -> playSound("path/to/cardinal_song.wav")); 
        panel.add(playBirdSongButtonOhio); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Oklahoma
    
    private static void Oklahoma() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Oklahoma Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelOklahoma = new JLabel(new ImageIcon("images/flags/Oklahomaflg.png")); 
        panel.add(flagLabelOklahoma); 
    
        // State description
        JTextArea descriptionTextOklahoma = new JTextArea(
            "Oklahoma, known for its Great Plains, rich Native American heritage, and vibrant music scene, offers a blend of cultural experiences."
        ); 
        descriptionTextOklahoma.setLineWrap(true); 
        descriptionTextOklahoma.setWrapStyleWord(true); 
        descriptionTextOklahoma.setEditable(false); 
        descriptionTextOklahoma.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextOklahoma); 
    
        // State Flower
        JLabel flowerImageOklahoma = new JLabel(new ImageIcon("images/flowers/OklahomaFlower.jpg")); 
        panel.add(flowerImageOklahoma); 
    
        // State Bird
        JLabel birdImageOklahoma = new JLabel(new ImageIcon("images/birds/OklahomaBird.jpg")); 
        panel.add(birdImageOklahoma); 
    
        // Play Bird Song button
        JButton playBirdSongButtonOklahoma = new JButton("Play Scissor-tailed Flycatcher Song"); 
        playBirdSongButtonOklahoma.addActionListener(e -> playSound("path/to/flycatcher_song.wav")); 
        panel.add(playBirdSongButtonOklahoma); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Oregon
    
    private static void Oregon() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Oregon Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelOregon = new JLabel(new ImageIcon("images/flags/Oregonflg.png")); 
        panel.add(flagLabelOregon); 
    
        // State description
        JTextArea descriptionTextOregon = new JTextArea(
            "Oregon, known for its diverse landscapes from beaches to mountains, vibrant tech industry, and rich cultural heritage."
        ); 
        descriptionTextOregon.setLineWrap(true); 
        descriptionTextOregon.setWrapStyleWord(true); 
        descriptionTextOregon.setEditable(false); 
        descriptionTextOregon.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextOregon); 
    
        // State Flower
        JLabel flowerImageOregon = new JLabel(new ImageIcon("images/flowers/OregonFlower.jpg")); 
        panel.add(flowerImageOregon); 
    
        // State Bird
        JLabel birdImageOregon = new JLabel(new ImageIcon("images/birds/OregonBird.jpg")); 
        panel.add(birdImageOregon); 
    
        // Play Bird Song button
        JButton playBirdSongButtonOregon = new JButton("Play Western Meadowlark Song"); 
        playBirdSongButtonOregon.addActionListener(e -> playSound("path/to/meadowlark_song.wav")); 
        panel.add(playBirdSongButtonOregon); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Pennsylvania
    
    private static void Pennsylvania() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Pennsylvania Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelPennsylvania = new JLabel(new ImageIcon("images/flags/Pennsylvaniaflg.png")); 
        panel.add(flagLabelPennsylvania); 
    
        // State description
        JTextArea descriptionTextPennsylvania = new JTextArea(
            "Pennsylvania, the Keystone State, is rich in American history, diverse landscapes, and bustling cities like Philadelphia and Pittsburgh."
        ); 
        descriptionTextPennsylvania.setLineWrap(true); 
        descriptionTextPennsylvania.setWrapStyleWord(true); 
        descriptionTextPennsylvania.setEditable(false); 
        descriptionTextPennsylvania.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextPennsylvania); 
    
        // State Flower
        JLabel flowerImagePennsylvania = new JLabel(new ImageIcon("images/flowers/PennsylvaniaFlower.jpg")); 
        panel.add(flowerImagePennsylvania); 
    
        // State Bird
        JLabel birdImagePennsylvania = new JLabel(new ImageIcon("images/birds/PennsylvaniaBird.jpg")); 
        panel.add(birdImagePennsylvania); 
    
        // Play Bird Song button
        JButton playBirdSongButtonPennsylvania = new JButton("Play Ruffed Grouse Song"); 
        playBirdSongButtonPennsylvania.addActionListener(e -> playSound("path/to/grouse_song.wav")); 
        panel.add(playBirdSongButtonPennsylvania); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Rhode Island
    
    private static void RhodeIsland() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Rhode Island Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelRhodeIsland = new JLabel(new ImageIcon("images/flags/RhodeIslandflg.png")); 
        panel.add(flagLabelRhodeIsland); 
    
        // State description
        JTextArea descriptionTextRhodeIsland = new JTextArea(
            "Rhode Island, the Ocean State, is known for its beautiful coastal towns, historic landmarks, and vibrant maritime culture."
        ); 
        descriptionTextRhodeIsland.setLineWrap(true); 
        descriptionTextRhodeIsland.setWrapStyleWord(true); 
        descriptionTextRhodeIsland.setEditable(false); 
        descriptionTextRhodeIsland.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextRhodeIsland); 
    
        // State Flower
        JLabel flowerImageRhodeIsland = new JLabel(new ImageIcon("images/flowers/RhodeIslandFlower.jpg")); 
        panel.add(flowerImageRhodeIsland); 
    
        // State Bird
        JLabel birdImageRhodeIsland = new JLabel(new ImageIcon("images/birds/RhodeIslandBird.jpg")); 
        panel.add(birdImageRhodeIsland); 
    
        // Play Bird Song button
        JButton playBirdSongButtonRhodeIsland = new JButton("Play Rhode Island Red Song"); 
        playBirdSongButtonRhodeIsland.addActionListener(e -> playSound("path/to/rhodeislandred_song.wav")); 
        panel.add(playBirdSongButtonRhodeIsland); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // South Carolina
    
    private static void SouthCarolina() { 
    
        // Create the main frame
        JFrame frame = new JFrame("South Carolina Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelSouthCarolina = new JLabel(new ImageIcon("images/flags/SouthCarolinaflg.png")); 
        panel.add(flagLabelSouthCarolina); 
    
        // State description
        JTextArea descriptionTextSouthCarolina = new JTextArea(
            "South Carolina, known for its historic plantations, beautiful beaches, and vibrant cultural festivals, offers a blend of tradition and modernity."
        ); 
        descriptionTextSouthCarolina.setLineWrap(true); 
        descriptionTextSouthCarolina.setWrapStyleWord(true); 
        descriptionTextSouthCarolina.setEditable(false); 
        descriptionTextSouthCarolina.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextSouthCarolina); 
    
        // State Flower
        JLabel flowerImageSouthCarolina = new JLabel(new ImageIcon("images/flowers/SouthCarolinaFlower.jpg")); 
        panel.add(flowerImageSouthCarolina); 
    
        // State Bird
        JLabel birdImageSouthCarolina = new JLabel(new ImageIcon("images/birds/SouthCarolinaBird.jpg")); 
        panel.add(birdImageSouthCarolina); 
    
        // Play Bird Song button
        JButton playBirdSongButtonSouthCarolina = new JButton("Play Carolina Wren Song"); 
        playBirdSongButtonSouthCarolina.addActionListener(e -> playSound("path/to/wren_song.wav")); 
        panel.add(playBirdSongButtonSouthCarolina); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // South Dakota
    
    private static void SouthDakota() { 
    
        // Create the main frame
        JFrame frame = new JFrame("South Dakota Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelSouthDakota = new JLabel(new ImageIcon("images/flags/SouthDakotaflg.png")); 
        panel.add(flagLabelSouthDakota); 
    
        // State description
        JTextArea descriptionTextSouthDakota = new JTextArea(
            "South Dakota, home to Mount Rushmore and the Badlands, offers stunning natural wonders and a rich Native American heritage."
        ); 
        descriptionTextSouthDakota.setLineWrap(true); 
        descriptionTextSouthDakota.setWrapStyleWord(true); 
        descriptionTextSouthDakota.setEditable(false); 
        descriptionTextSouthDakota.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextSouthDakota); 
    
        // State Flower
        JLabel flowerImageSouthDakota = new JLabel(new ImageIcon("images/flowers/SouthDakotaFlower.jpg")); 
        panel.add(flowerImageSouthDakota); 
    
        // State Bird
        JLabel birdImageSouthDakota = new JLabel(new ImageIcon("images/birds/SouthDakotaBird.jpg")); 
        panel.add(birdImageSouthDakota); 
    
        // Play Bird Song button
        JButton playBirdSongButtonSouthDakota = new JButton("Play Ring-necked Pheasant Song"); 
        playBirdSongButtonSouthDakota.addActionListener(e -> playSound("path/to/pheasant_song.wav")); 
        panel.add(playBirdSongButtonSouthDakota); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Tennessee
    
    private static void Tennessee() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Tennessee Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelTennessee = new JLabel(new ImageIcon("images/flags/Tennesseeflg.png")); 
        panel.add(flagLabelTennessee); 
    
        // State description
        JTextArea descriptionTextTennessee = new JTextArea(
            "Tennessee, the Volunteer State, is renowned for its contributions to music, including country, blues, and rock 'n' roll, as well as its scenic landscapes."
        ); 
        descriptionTextTennessee.setLineWrap(true); 
        descriptionTextTennessee.setWrapStyleWord(true); 
        descriptionTextTennessee.setEditable(false); 
        descriptionTextTennessee.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextTennessee); 
    
        // State Flower
        JLabel flowerImageTennessee = new JLabel(new ImageIcon("images/flowers/TennesseeFlower.jpg")); 
        panel.add(flowerImageTennessee); 
    
        // State Bird
        JLabel birdImageTennessee = new JLabel(new ImageIcon("images/birds/TennesseeBird.jpg")); 
        panel.add(birdImageTennessee); 
    
        // Play Bird Song button
        JButton playBirdSongButtonTennessee = new JButton("Play Mockingbird Song"); 
        playBirdSongButtonTennessee.addActionListener(e -> playSound("path/to/mockingbird_song.wav")); 
        panel.add(playBirdSongButtonTennessee); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Texas
    
    private static void Texas() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Texas Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelTexas = new JLabel(new ImageIcon("images/flags/Texasflg.png")); 
        panel.add(flagLabelTexas); 
    
        // State description
        JTextArea descriptionTextTexas = new JTextArea(
            "Texas, the Lone Star State, is known for its vast landscapes, rich cultural diversity, and vibrant cities like Houston, Austin, and Dallas."
        ); 
        descriptionTextTexas.setLineWrap(true); 
        descriptionTextTexas.setWrapStyleWord(true); 
        descriptionTextTexas.setEditable(false); 
        descriptionTextTexas.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextTexas); 
    
        // State Flower
        JLabel flowerImageTexas = new JLabel(new ImageIcon("images/flowers/TexasFlower.jpg")); 
        panel.add(flowerImageTexas); 
    
        // State Bird
        JLabel birdImageTexas = new JLabel(new ImageIcon("images/birds/TexasBird.jpg")); 
        panel.add(birdImageTexas); 
    
        // Play Bird Song button
        JButton playBirdSongButtonTexas = new JButton("Play Northern Mockingbird Song"); 
        playBirdSongButtonTexas.addActionListener(e -> playSound("path/to/mockingbird_song.wav")); 
        panel.add(playBirdSongButtonTexas); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Utah
    
    private static void Utah() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Utah Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelUtah = new JLabel(new ImageIcon("images/flags/Utahflg.png")); 
        panel.add(flagLabelUtah); 
    
        // State description
        JTextArea descriptionTextUtah = new JTextArea(
            "Utah, known for its stunning national parks, vibrant ski resorts, and rich Mormon heritage, offers a unique blend of natural beauty and cultural depth."
        ); 
        descriptionTextUtah.setLineWrap(true); 
        descriptionTextUtah.setWrapStyleWord(true); 
        descriptionTextUtah.setEditable(false); 
        descriptionTextUtah.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextUtah); 
    
        // State Flower
        JLabel flowerImageUtah = new JLabel(new ImageIcon("images/flowers/UtahFlower.jpg")); 
        panel.add(flowerImageUtah); 
    
        // State Bird
        JLabel birdImageUtah = new JLabel(new ImageIcon("images/birds/UtahBird.jpg")); 
        panel.add(birdImageUtah); 
    
        // Play Bird Song button
        JButton playBirdSongButtonUtah = new JButton("Play California Gull Song"); 
        playBirdSongButtonUtah.addActionListener(e -> playSound("path/to/gull_song.wav")); 
        panel.add(playBirdSongButtonUtah); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Vermont
    
    private static void Vermont() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Vermont Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelVermont = new JLabel(new ImageIcon("images/flags/Vermontflg.png")); 
        panel.add(flagLabelVermont); 
    
        // State description
        JTextArea descriptionTextVermont = new JTextArea(
            "Vermont, known for its picturesque landscapes, vibrant fall foliage, and charming small towns, offers a peaceful and scenic environment."
        ); 
        descriptionTextVermont.setLineWrap(true); 
        descriptionTextVermont.setWrapStyleWord(true); 
        descriptionTextVermont.setEditable(false); 
        descriptionTextVermont.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextVermont); 
    
        // State Flower
        JLabel flowerImageVermont = new JLabel(new ImageIcon("images/flowers/VermontFlower.jpg")); 
        panel.add(flowerImageVermont); 
    
        // State Bird
        JLabel birdImageVermont = new JLabel(new ImageIcon("images/birds/VermontBird.jpg")); 
        panel.add(birdImageVermont); 
    
        // Play Bird Song button
        JButton playBirdSongButtonVermont = new JButton("Play Hermit Thrush Song"); 
        playBirdSongButtonVermont.addActionListener(e -> playSound("path/to/thrush_song.wav")); 
        panel.add(playBirdSongButtonVermont); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Virginia
    
    private static void Virginia() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Virginia Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelVirginia = new JLabel(new ImageIcon("images/flags/Virginiaflg.png")); 
        panel.add(flagLabelVirginia); 
    
        // State description
        JTextArea descriptionTextVirginia = new JTextArea(
            "Virginia, known as the Old Dominion, is rich in American history, diverse landscapes from beaches to mountains, and vibrant cities like Richmond and Virginia Beach."
        ); 
        descriptionTextVirginia.setLineWrap(true); 
        descriptionTextVirginia.setWrapStyleWord(true); 
        descriptionTextVirginia.setEditable(false); 
        descriptionTextVirginia.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextVirginia); 
    
        // State Flower
        JLabel flowerImageVirginia = new JLabel(new ImageIcon("images/flowers/VirginiaFlower.jpg")); 
        panel.add(flowerImageVirginia); 
    
        // State Bird
        JLabel birdImageVirginia = new JLabel(new ImageIcon("images/birds/VirginiaBird.jpg")); 
        panel.add(birdImageVirginia); 
    
        // Play Bird Song button
        JButton playBirdSongButtonVirginia = new JButton("Play Cardinal Song"); 
        playBirdSongButtonVirginia.addActionListener(e -> playSound("path/to/cardinal_song.wav")); 
        panel.add(playBirdSongButtonVirginia); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Washington
    
    private static void Washington() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Washington Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelWashington = new JLabel(new ImageIcon("images/flags/Washingtonflg.png")); 
        panel.add(flagLabelWashington); 
    
        // State description
        JTextArea descriptionTextWashington = new JTextArea(
            "Washington, the Evergreen State, is known for its lush landscapes, thriving tech industry in Seattle, and iconic landmarks like Mount Rainier."
        ); 
        descriptionTextWashington.setLineWrap(true); 
        descriptionTextWashington.setWrapStyleWord(true); 
        descriptionTextWashington.setEditable(false); 
        descriptionTextWashington.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextWashington); 
    
        // State Flower
        JLabel flowerImageWashington = new JLabel(new ImageIcon("images/flowers/WashingtonFlower.jpg")); 
        panel.add(flowerImageWashington); 
    
        // State Bird
        JLabel birdImageWashington = new JLabel(new ImageIcon("images/birds/WashingtonBird.jpg")); 
        panel.add(birdImageWashington); 
    
        // Play Bird Song button
        JButton playBirdSongButtonWashington = new JButton("Play Willow Ptarmigan Song"); 
        playBirdSongButtonWashington.addActionListener(e -> playSound("path/to/ptarmigan_song.wav")); 
        panel.add(playBirdSongButtonWashington); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // West Virginia
    
    private static void WestVirginia() { 
    
        // Create the main frame
        JFrame frame = new JFrame("West Virginia Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelWestVirginia = new JLabel(new ImageIcon("images/flags/WestVirginiaflg.png")); 
        panel.add(flagLabelWestVirginia); 
    
        // State description
        JTextArea descriptionTextWestVirginia = new JTextArea(
            "West Virginia, the Mountain State, is renowned for its rugged terrain, outdoor recreational activities, and rich Appalachian culture."
        ); 
        descriptionTextWestVirginia.setLineWrap(true); 
        descriptionTextWestVirginia.setWrapStyleWord(true); 
        descriptionTextWestVirginia.setEditable(false); 
        descriptionTextWestVirginia.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextWestVirginia); 
    
        // State Flower
        JLabel flowerImageWestVirginia = new JLabel(new ImageIcon("images/flowers/WestVirginiaFlower.jpg")); 
        panel.add(flowerImageWestVirginia); 
    
        // State Bird
        JLabel birdImageWestVirginia = new JLabel(new ImageIcon("images/birds/WestVirginiaBird.jpg")); 
        panel.add(birdImageWestVirginia); 
    
        // Play Bird Song button
        JButton playBirdSongButtonWestVirginia = new JButton("Play Cardinal Song"); 
        playBirdSongButtonWestVirginia.addActionListener(e -> playSound("path/to/cardinal_song.wav")); 
        panel.add(playBirdSongButtonWestVirginia); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Wisconsin
    
    private static void Wisconsin() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Wisconsin Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelWisconsin = new JLabel(new ImageIcon("images/flags/Wisconsinflg.png")); 
        panel.add(flagLabelWisconsin); 
    
        // State description
        JTextArea descriptionTextWisconsin = new JTextArea(
            "Wisconsin, known as America's Dairyland, is famous for its cheese production, beautiful lakes, and vibrant cities like Milwaukee and Madison."
        ); 
        descriptionTextWisconsin.setLineWrap(true); 
        descriptionTextWisconsin.setWrapStyleWord(true); 
        descriptionTextWisconsin.setEditable(false); 
        descriptionTextWisconsin.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextWisconsin); 
    
        // State Flower
        JLabel flowerImageWisconsin = new JLabel(new ImageIcon("images/flowers/WisconsinFlower.jpg")); 
        panel.add(flowerImageWisconsin); 
    
        // State Bird
        JLabel birdImageWisconsin = new JLabel(new ImageIcon("images/birds/WisconsinBird.jpg")); 
        panel.add(birdImageWisconsin); 
    
        // Play Bird Song button
        JButton playBirdSongButtonWisconsin = new JButton("Play American Robin Song"); 
        playBirdSongButtonWisconsin.addActionListener(e -> playSound("path/to/robin_song.wav")); 
        panel.add(playBirdSongButtonWisconsin); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    // Wyoming
    
    private static void Wyoming() { 
    
        // Create the main frame
        JFrame frame = new JFrame("Wyoming Info");
        frame.setSize(800, 800);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        // State flag
        JLabel flagLabelWyoming = new JLabel(new ImageIcon("images/flags/Wyomingflg.png")); 
        panel.add(flagLabelWyoming); 
    
        // State description
        JTextArea descriptionTextWyoming = new JTextArea(
            "Wyoming, the Equality State, is renowned for its stunning national parks like Yellowstone, vast open spaces, and rich wildlife."
        ); 
        descriptionTextWyoming.setLineWrap(true); 
        descriptionTextWyoming.setWrapStyleWord(true); 
        descriptionTextWyoming.setEditable(false); 
        descriptionTextWyoming.setFont(new Font("Arial", Font.PLAIN, 16)); // Increase font size 
        panel.add(descriptionTextWyoming); 
    
        // State Flower
        JLabel flowerImageWyoming = new JLabel(new ImageIcon("images/flowers/WyomingFlower.jpg")); 
        panel.add(flowerImageWyoming); 
    
        // State Bird
        JLabel birdImageWyoming = new JLabel(new ImageIcon("images/birds/WyomingBird.jpg")); 
        panel.add(birdImageWyoming); 
    
        // Play Bird Song button
        JButton playBirdSongButtonWyoming = new JButton("Play Western Meadowlark Song"); 
        playBirdSongButtonWyoming.addActionListener(e -> playSound("path/to/meadowlark_song.wav")); 
        panel.add(playBirdSongButtonWyoming); 
    
        // Set frame visibility
        frame.setVisible(true);
    }    
    
    

                
        // Method to play sound

        }

// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
