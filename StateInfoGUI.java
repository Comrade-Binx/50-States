import java.awt.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

/*I'M DONE, FINALLY!!! */ 

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
washingtonButton.setBounds(150, 150, 60, 50);
oregonButton.setBounds(122, 233, 60, 50);
californiaButton.setBounds(84, 423, 60, 50);
idahoButton.setBounds(236, 273, 60, 50);
nevadaButton.setBounds(132, 324, 60, 50);
arizonaButton.setBounds(236, 512, 60, 50);
utahButton.setBounds(250, 354, 60, 50);
montanaButton.setBounds(290, 156, 60, 50);
wyomingButton.setBounds(320, 271, 60, 50);
coloradoButton.setBounds(380, 416, 60, 50);
newMexicoButton.setBounds(342, 502, 60, 50);
alaskaButton.setBounds(126, 692, 60, 50);
hawaiiButton.setBounds(396, 780, 60, 50);

// Great Plains & Central States
northDakotaButton.setBounds(490, 179, 60, 50);
southDakotaButton.setBounds(492, 265, 60, 50);
nebraskaButton.setBounds(500, 353, 60, 50);
kansasButton.setBounds(510, 438, 60, 50);
oklahomaButton.setBounds(540, 512, 60, 50);
texasButton.setBounds(485, 618, 60, 50);

// Upper Midwest
minnesotaButton.setBounds(621, 194, 60, 50);
iowaButton.setBounds(626, 321, 60, 50);
missouriButton.setBounds(651, 418, 60, 50);
arkansasButton.setBounds(663, 528, 60, 50);
louisianaButton.setBounds(673, 629, 60, 50);
wisconsinButton.setBounds(700, 251, 60, 50);
illinoisButton.setBounds(735, 382, 60, 50);

// Deep South & Adjacent
mississippiButton.setBounds(740, 576, 60, 50);
michiganButton.setBounds(827, 280, 60, 50);
indianaButton.setBounds(802, 374, 60, 50);
ohioButton.setBounds(864, 368, 60, 50);
kentuckyButton.setBounds(830, 458, 60, 50);
tennesseeButton.setBounds(791, 495, 60, 50);
alabamaButton.setBounds(803, 563, 60, 50);
georgiaButton.setBounds(874, 567, 60, 50);
floridaButton.setBounds(949, 709, 60, 50);
southCarolinaButton.setBounds(920, 529, 60, 50);
northCarolinaButton.setBounds(965, 483, 60, 50);

// Mid-Atlantic & East
virginiaButton.setBounds(960, 424, 60, 50);
westVirginiaButton.setBounds(919, 404, 60, 50);
marylandButton.setBounds(1000, 371, 60, 50);
delawareButton.setBounds(1030, 376, 60, 50);
pennsylvaniaButton.setBounds(955, 340, 60, 50);
newJerseyButton.setBounds(1044, 340, 60, 50);
newYorkButton.setBounds(992, 266, 60, 50);

// New England
connecticutButton.setBounds(1063, 285, 60, 50);
rhodeIslandButton.setBounds(1093, 275, 60, 50);
massachusettsButton.setBounds(1077, 260, 60, 50);
vermontButton.setBounds(1050, 209, 60, 50);
newHampshireButton.setBounds(1080, 235, 60, 50);
maineButton.setBounds(1104, 151, 60, 50);




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


    // Below are individual methods for creating a GUI for each state.
// Each method is based EXACTLY on the given code template, with the following adjustments:
// - Replace "State" with the state's full name for displayed text (frame title, button text, description).
// - For the filenames (images and sounds), use the exact rules given:
//    * flags: (state name or abbreviation)flg.png
//    * flowers: (state name or abbreviation)flwr.jpg
//    * birds: (state name or abbreviation).jpg
//    * sounds: (state name or abbreviation).wav or .mp3 depending on the state
// - Abbreviations for filenames only (not for displayed text):
//    Massachusetts -> Massa
//    Montana -> Monty
//    New Hampshire -> NewHamp
//    New Jersey -> NewJer
//    New Mexico -> NewMex
//    New York -> NewYork
//    North Carolina -> NorthCaro
//    North Dakota -> NorthDako
//    Pennsylvania -> Penn
//    Rhode Island -> Rhode
//    South Carolina -> SouthCaro
//    South Dakota -> SouthDako
//    Tennessee -> Tennis
//    West Virginia -> WVirgin
// - The following states use .mp3 for the bird sound instead of .wav:
//    Hawaii, Maine, New Hampshire, Oklahoma, Rhode Island, South Carolina, South Dakota, Utah, Vermont, Virginia, Washington

// NOTE: The variables inside the code (like flagLabelState, playBirdSongButtonState) remain as in the template.
//       Only the strings have been changed accordingly.

private static void Alabama() {
        JFrame frame = new JFrame("Alabama Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Alabamaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Known for its role in the Civil Rights Movement and sweet southern charm.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Alabamaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Alabama.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Alabama Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Alabama.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Alaska() {
        JFrame frame = new JFrame("Alaska Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Alaskaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("A vast wilderness with stunning glaciers and abundant wildlife.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Alaskaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Alaska.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Alaska Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Alaska.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Arizona() {
        JFrame frame = new JFrame("Arizona Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Arizonaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Famous for the Grand Canyon and desert landscapes.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Arizonaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Arizona.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Arizona Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Arizona.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Arkansas() {
        JFrame frame = new JFrame("Arkansas Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Arkansasflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Home to the Ozark Mountains and beautiful natural hot springs.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Arkansasflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Arkansas.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Arkansas Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Arkansas.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void California() {
        JFrame frame = new JFrame("California Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Californiaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("The Golden State with Hollywood, tech hubs, and diverse scenery.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Californiaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/California.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play California Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/California.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Colorado() {
        JFrame frame = new JFrame("Colorado Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Coloradoflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Rocky Mountain paradise with outdoor adventures galore.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Coloradoflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Colorado.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Colorado Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Colorado.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Connecticut() {
        JFrame frame = new JFrame("Connecticut Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Connecticutflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("A charming mix of coastal towns and historic landmarks.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Connecticutflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Connecticut.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Connecticut Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Connecticut.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Delaware() {
        JFrame frame = new JFrame("Delaware Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Delawareflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("America’s first state, known for its tax-free shopping.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Delawareflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Delaware.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Delaware Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Delaware.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Florida() {
        JFrame frame = new JFrame("Florida Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Floridaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Beaches, theme parks, and sunny weather year-round.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Floridaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Florida.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Florida Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Florida.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Georgia() {
        JFrame frame = new JFrame("Georgia Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Georgiaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Peaches, Southern hospitality, and Atlanta’s bustling city life.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Georgiaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Georgia.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Georgia Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Georgia.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Hawaii() {
        JFrame frame = new JFrame("Hawaii Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Hawaiiflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Tropical islands with stunning beaches and vibrant culture.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Hawaiiflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Hawaii.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Hawaii Bird Song");
        // Hawaii uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Hawaii.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Idaho() {
        JFrame frame = new JFrame("Idaho Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Idahoflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Famous for potatoes and scenic mountain landscapes.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Idahoflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Idaho.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Idaho Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Idaho.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Illinois() {
        JFrame frame = new JFrame("Illinois Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Illinoisflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Home to Chicago and a hub of Midwest culture and industry.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Illinoisflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Illinois.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Illinois Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Illinois.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Indiana() {
        JFrame frame = new JFrame("Indiana Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Indianaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Known for the Indianapolis 500 and rolling farmlands.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Indianaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Indiana.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Indiana Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Indiana.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Iowa() {
        JFrame frame = new JFrame("Iowa Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Iowaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("A heartland state with vast cornfields and friendly small towns.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Iowaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Iowa.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Iowa Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Iowa.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Kansas() {
        JFrame frame = new JFrame("Kansas Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Kansasflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Prairies, agriculture, and Wizard of Oz nostalgia.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Kansasflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Kansas.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Kansas Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Kansas.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Kentucky() {
        JFrame frame = new JFrame("Kentucky Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Kentuckyflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Known for bourbon, horse racing, and bluegrass music.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Kentuckyflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Kentucky.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Kentucky Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Kentucky.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Louisiana() {
        JFrame frame = new JFrame("Louisiana Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Louisianaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Home to New Orleans, jazz, and Creole culture.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Louisianaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Louisiana.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Louisiana Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Louisiana.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Maine() {
        JFrame frame = new JFrame("Maine Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Maineflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Famous for lighthouses, lobster, and rugged coastlines.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Maineflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Maine.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Maine Bird Song");
        // Maine uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Maine.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Maryland() {
        JFrame frame = new JFrame("Maryland Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Marylandflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Chesapeake Bay crabs and historic landmarks near D.C.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Marylandflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Maryland.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Maryland Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Maryland.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Massachusetts() {
        JFrame frame = new JFrame("Massachusetts Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Massaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Rich in history with Boston and iconic coastal towns.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        // Use "Massa" for filenames:
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Massaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Massa.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Massachusetts Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Massa.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Michigan() {
        JFrame frame = new JFrame("Michigan Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Michiflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Great Lakes, auto industry, and beautiful Upper Peninsula.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Michiganflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Michigan.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Michigan Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Michigan.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Minnesota() {
        JFrame frame = new JFrame("Minnesota Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Minnesotaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Land of 10,000 lakes and friendly Midwestern culture.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Minnesotaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Minnesota.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Minnesota Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Minnesota.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Mississippi() {
        JFrame frame = new JFrame("Mississippi Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Mississippiflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Southern charm, blues music, and the mighty Mississippi River.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Mississippiflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Mississippi.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Mississippi Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Mississippi.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Missouri() {
        JFrame frame = new JFrame("Missouri Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Missouriflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Gateway Arch, Ozarks, and rich history.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Missouriflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Missouri.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Missouri Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Missouri.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Montana() {
        JFrame frame = new JFrame("Montana Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Montyflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Big Sky Country with stunning national parks and open spaces.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        // Use "Monty" for filenames:
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Montyflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Monty.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Montana Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Monty.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Nebraska() {
        JFrame frame = new JFrame("Nebraska Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Nebraskaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Known for prairies, agriculture, and the Sandhills.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Nebraskaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Nebraska.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Nebraska Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Nebraska.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Nevada() {
        JFrame frame = new JFrame("Nevada Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Nevadaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Glittering Las Vegas and breathtaking desert scenery.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Nevadaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Nevada.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Nevada Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Nevada.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void NewHampshire() {
        JFrame frame = new JFrame("New Hampshire Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/NewHampflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Autumn foliage and quaint New England charm.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        // Use "NewHamp" for filenames:
        ImageIcon flowerIcon = new ImageIcon("images/flowers/NewHampflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/NewHamp.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play New Hampshire Bird Song");
        // New Hampshire uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/NewHamp.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void NewJersey() {
        JFrame frame = new JFrame("New Jersey Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/NewJerflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Boardwalks, beaches, and proximity to NYC.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/NewJerflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/NewJer.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play New Jersey Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/NewJer.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void NewMexico() {
        JFrame frame = new JFrame("New Mexico Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/NewMexflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Desert beauty, unique cuisine, and Native American culture.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/NewMexflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/NewMex.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play New Mexico Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/NewMex.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void NewYork() {
        JFrame frame = new JFrame("New York Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/NewYorkflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("The Empire State with NYC and stunning upstate landscapes.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/NewYorkflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/NewYork.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play New York Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/NewYork.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void NorthCarolina() {
        JFrame frame = new JFrame("North Carolina Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/NorthCaroflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Beaches, mountains, and a hub of innovation.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/NorthCaroflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/NorthCaro.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play North Carolina Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/NorthCaro.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void NorthDakota() {
        JFrame frame = new JFrame("North Dakota Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/NorthDakoflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Open plains, oil industry, and rugged Badlands.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/NorthDakoflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/NorthDako.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play North Dakota Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/NorthDako.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Ohio() {
        JFrame frame = new JFrame("Ohio Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Ohioflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Rock and Roll Hall of Fame and Buckeye State pride.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Ohioflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Ohio.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Ohio Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Ohio.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Oklahoma() {
        JFrame frame = new JFrame("Oklahoma Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Oklahomaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Native American heritage and wide-open plains.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Oklahomaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Oklahoma.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Oklahoma Bird Song");
        // Oklahoma uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Oklahoma.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Oregon() {
        JFrame frame = new JFrame("Oregon Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Oregonflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Stunning coastlines, forests, and quirky Portland culture.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Oregonflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Oregon.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Oregon Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Oregon.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Pennsylvania() {
        JFrame frame = new JFrame("Pennsylvania Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Pennflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("American Revolution landmarks and Amish country.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Pennflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Penn.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Pennsylvania Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Penn.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void RhodeIsland() {
        JFrame frame = new JFrame("Rhode Island Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Rhodeflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Small but full of seaside charm and history.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        // Use "Rhode" for filenames:
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Rhodeflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Rhode.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Rhode Island Bird Song");
        // Rhode Island uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Rhode.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void SouthCarolina() {
        JFrame frame = new JFrame("South Carolina Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/SouthCaroflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Historic Charleston and beautiful beaches.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        // Use "SouthCaro" for filenames:
        ImageIcon flowerIcon = new ImageIcon("images/flowers/SouthCaroflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/SouthCaro.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play South Carolina Bird Song");
        // South Carolina uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/SouthCaro.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void SouthDakota() {
        JFrame frame = new JFrame("South Dakota Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/SouthDakoflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Mount Rushmore and the Badlands.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        // Use "SouthDako" for filenames:
        ImageIcon flowerIcon = new ImageIcon("images/flowers/SouthDakoflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/SouthDako.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play South Dakota Bird Song");
        // South Dakota uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/SouthDako.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Tennessee() {
        JFrame frame = new JFrame("Tennessee Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Tennisflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Country music, Great Smoky Mountains, and BBQ.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        // Use "Tennis" for filenames:
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Tennisflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Tennis.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Tennessee Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Tennis.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Texas() {
        JFrame frame = new JFrame("Texas Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Texasflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Big everything—cowboys, BBQ, and vibrant cities.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Texasflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Texas.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Texas Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Texas.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Utah() {
        JFrame frame = new JFrame("Utah Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Utahflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Mormons, breathtaking national parks and outdoor recreation.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Utahflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Utah.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Utah Bird Song");
        // Utah uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Utah.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Vermont() {
        JFrame frame = new JFrame("Vermont Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Vermontflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Maple syrup, charming villages, and ski resorts.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Vermontflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Vermont.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Vermont Bird Song");
        // Vermont uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Vermont.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Virginia() {
        JFrame frame = new JFrame("Virginia Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Virginiaflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Historic landmarks and scenic Blue Ridge Mountains.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Virginiaflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Virginia.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Virginia Bird Song");
        // Virginia uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Virginia.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Washington() {
        JFrame frame = new JFrame("Washington Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Washingtonflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Evergreen state with Seattle and stunning coastal views.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Washingtonflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Washington.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Washington Bird Song");
        // Washington uses mp3:
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Washington.mp3"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void WestVirginia() {
        JFrame frame = new JFrame("West Virginia Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/WVirginflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Appalachian Mountains and outdoor adventure.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        // Use "WVirgin" for filenames:
        ImageIcon flowerIcon = new ImageIcon("images/flowers/WVirginflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/WVirgin.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play West Virginia Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/WVirgin.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Wisconsin() {
        JFrame frame = new JFrame("Wisconsin Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Wisconsinflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Cheese, dairy farms, and picturesque lake towns.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Wisconsinflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Wisconsin.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Wisconsin Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Wisconsin.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    private static void Wyoming() {
        JFrame frame = new JFrame("Wyoming Info");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
    
        JLabel flagLabelState = new JLabel(new ImageIcon("images/flags/Wyomingflg.png"));
        flagLabelState.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(flagLabelState);
    
        JTextArea descriptionTextState = new JTextArea("Yellowstone, cowboy culture, and stunning landscapes.\r\n" + //
                                "");
        descriptionTextState.setLineWrap(true);
        descriptionTextState.setWrapStyleWord(true);
        descriptionTextState.setEditable(false);
        descriptionTextState.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(descriptionTextState);
    
        JPanel imagesPanel = new JPanel();
        imagesPanel.setLayout(new FlowLayout());
    
        ImageIcon flowerIcon = new ImageIcon("images/flowers/Wyomingflwr.jpg");
        Image flowerImage = flowerIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel flowerImageState = new JLabel(new ImageIcon(flowerImage));
        imagesPanel.add(flowerImageState);
    
        ImageIcon birdIcon = new ImageIcon("images/birds/Wyoming.jpg");
        Image birdImage = birdIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel birdImageState = new JLabel(new ImageIcon(birdImage));
        imagesPanel.add(birdImageState);
    
        panel.add(imagesPanel);
    
        JButton playBirdSongButtonState = new JButton("Play Wyoming Bird Song");
        playBirdSongButtonState.addActionListener(e -> playSound("sounds/Wyoming.wav"));
        panel.add(playBirdSongButtonState);
    
        frame.setVisible(true);
    }
    
    // End of all state methods.
    
    
    

                
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
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
        // I want more lines of code
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code       
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code     
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code      
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code      
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code   
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code      
                // I want more lines of code
                        // I want more lines of code
                                // I want more lines of code
                                        // I want more lines of code
                                                // I want more lines of code
                                                        // I want more lines of code
                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                                        // I want more lines of code
                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code       
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                                // I want more lines of code
                                                                                                                                                                        // I want more lines of code
                                                                                                                                                                // I want more lines of code
                                                                                                                                                        // I want more lines of code
                                                                                                                                                // I want more lines of code
                                                                                                                                        // I want more lines of code        
                                                                                                                                // I want more lines of code        
                                                                                                                        // I want more lines of code
                                                                                                                // I want more lines of code
                                                                                                        // I want more lines of code
                                                                                                // I want more lines of code
                                                                                        // I want more lines of code
                                                                                // I want more lines of code
                                                                        // I want more lines of code
                                                                // I want more lines of code
                                                        // I want more lines of code
                                                // I want more lines of code
                                        // I want more lines of code
                                // I want more lines of code
                        // I want more lines of code
                // I want more lines of code
        // I want more lines of code
// I want more lines of code
