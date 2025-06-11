package GUI;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TitleScreen extends JFrame implements ActionListener {
    int coralCounter = 0;
    boolean hello = true;
    private Image backgroundImage;
    private JPanel backgroundPanel;
    static JFrame frame;

    JButton coral1, coral2, coral3, coral4, balgae, palgae, dcage, scage, park, auto, disable, allianceB, allianceR, start, data;
    ImageIcon titleIcon, bgIcon, parkIconY, parkIconN, sclimbIconY, sclimbIconN, dclimbIconY, dclimbIconN, allianceBY, allianceBN, allianceRY, allianceRN;
    JTextField teamNum, matchNum, comments;
    static JPanel mainPanel;
    static JFrame mainFrame;


    public static void main(String[] args){
        mainFrame = new JFrame();
        mainPanel = new JPanel();
 


    }




public TitleScreen() {

    setBounds(100, 200, 1500, 900);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);

    backgroundPanel = new BackgroundPanel();
    backgroundPanel.setBounds(0, 0, 1500, 900);
    backgroundPanel.setLayout(null);
    setContentPane(backgroundPanel);

    JLabel myLabel = new JLabel("FRCSCOUT");
    myLabel.setBounds(700, 350, 400, 100);
    backgroundPanel.add(myLabel);

    backgroundPanel.add(start);
    setVisible(true);

    JButton start = new JButton();
    start.setBounds(240,430,375,225);
    start.setVisible(true);
    start.setOpaque(false);
    start.setContentAreaFilled(false);
    start.setBorderPainted(false);

    start.addActionListener(this);

}

private class BackgroundPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image background = new ImageIcon("C:/Users/enchi/.vscode/Scouting app/src/GUI/title.png").getImage();
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }
}


public void ScoutScreen(){
        setBounds(100, 200, 1500, 900);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
}


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            ScoutScreen();

        }

     
        if (e.getSource() == data) {
            data.setText("Yipee");

        }

    } 

    private void switchPanel (){

    }
    public boolean getActive(){
        return hello;
    }
}

