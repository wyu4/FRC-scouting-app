package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoutScreen extends JFrame implements ActionListener{

    private JButton[] corals;

private JPanel backgroundPanel;
JButton coral1, coral2, coral3, coral4, balgae, palgae, dcage, scage, park, auto, disable, allianceB, allianceR;
ImageIcon titleIcon, bgIcon, parkIconY, parkIconN, sclimbIconY, sclimbIconN, dclimbIconY, dclimbIconN, allianceBY, allianceBN, allianceRY, allianceRN;
JTextField teamNum, matchNum, comments;




    
    
    public ScoutScreen(){
        JFrame ScoutScreen = new JFrame();
        setBounds(100, 200, 1500, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    backgroundPanel = new BackgroundPanel();
    backgroundPanel.setBounds(0, 0, 1500, 900);
    backgroundPanel.setLayout(null);
    setContentPane(backgroundPanel);


    coral1 = new JButton();
    coral1.setBounds(240,430,375,225);
    coral1.setVisible(true);
    coral1.setOpaque(true);
    coral1.setContentAreaFilled(true);
    coral1.setBorderPainted(true);
    coral1.addActionListener(this);

    coral2 = new JButton();
    coral2.setBounds(240,430,375,225);
    coral2.setVisible(true);
    coral2.setOpaque(true);
    coral2.setContentAreaFilled(true);
    coral2.setBorderPainted(true);
    coral2.addActionListener(this);

    coral3 = new JButton();
    coral3.setBounds(275,430,375,225);
    coral3.setVisible(true);
    coral3.setOpaque(true);
    coral3.setContentAreaFilled(true);
    coral3.setBorderPainted(true);
    coral3.addActionListener(this);

    coral4 = new JButton();
    coral4.setBounds(275,455,275,225);
    coral4.setVisible(true);
    coral4.setOpaque(true);
    coral4.setContentAreaFilled(true);
    coral4.setBorderPainted(true);
    coral4.addActionListener(this);


     



    }




 // Removed actionPerformed from BackgroundPanel since it does not implement ActionListener




 @Override
 public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
 }

    
 class BackgroundPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image background = new ImageIcon("C://Users//enchi//.vscode//Scouting app//src//GUI//Scouter.png").getImage();
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }

    public static void main(String[] args){

    }

   
 }

}