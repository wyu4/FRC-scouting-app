

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoutScreen extends JFrame implements ActionListener{

    private JButton[] corals;

private JPanel backgroundPanel;
JButton coral1, coral2, coral3, coral4, coralMiss, balgae, palgae, dcage, scage, park, auto, disable, allianceB, allianceR;
ImageIcon titleIcon, bgIcon, parkIconY, parkIconN, sclimbIconY, sclimbIconN, dclimbIconY, dclimbIconN, allianceBY, allianceBN, allianceRY, allianceRN;
JTextField teamNum, matchNum, comments;

 static team scoutingrn = new team(0, null);




    
    
    public ScoutScreen(){
        JFrame ScoutScreen = new JFrame();
        setBounds(0, 0, 1500, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

    backgroundPanel = new BackgroundPanel();
    backgroundPanel.setBounds(0, 0, 1500, 900);
    backgroundPanel.setLayout(null);
    setContentPane(backgroundPanel);
 
    coral1 = new JButton();
    coral1.setBounds(50,250,90,90);
    coral1.setVisible(true);
    coral1.setOpaque(false);
    coral1.setContentAreaFilled(false);
    coral1.setBorderPainted(false);
    coral1.addActionListener(this);
       
    backgroundPanel.add(coral1);
    setVisible(true);


    coral2 = new JButton();
    coral2.setBounds(145,250,90,90);
    coral2.setVisible(true);
    coral2.setOpaque(false);
    coral2.setContentAreaFilled(false);
    coral2.setBorderPainted(false);
    coral2.addActionListener(this);

    backgroundPanel.add(coral2);
    setVisible(true);

    coral3 = new JButton();
    coral3.setBounds(275,430,375,225);
    coral3.setVisible(false);
    coral3.setOpaque(false);
    coral3.setContentAreaFilled(false);
    coral3.setBorderPainted(false);
    coral3.addActionListener(this);

    coral4 = new JButton();
    coral4.setBounds(275,455,275,225);
    coral4.setVisible(false);
    coral4.setOpaque(false);
    coral4.setContentAreaFilled(false);
    coral4.setBorderPainted(false);
    coral4.addActionListener(this);

    coralMiss = new JButton();
    coralMiss.setBounds(293,299,100,100);
    coralMiss.setVisible(false);
    coralMiss.setOpaque(false);
    coralMiss.setContentAreaFilled(false);
    coralMiss.setBorderPainted(false);
    coralMiss.addActionListener(this);


    balgae = new JButton();
    balgae.setBounds(400,600,50,30);
    balgae.setVisible(false);
    balgae.setOpaque(false);
    balgae.setContentAreaFilled(false);
    balgae.setBorderPainted(false);
    balgae.addActionListener(this);

    palgae = new JButton();
    palgae.setBounds(400,600,50,30);
    palgae.setVisible(false);
    palgae.setOpaque(false);
    palgae.setContentAreaFilled(false);
    palgae.setBorderPainted(false);
    palgae.addActionListener(this);

    dcage = new JButton();
    dcage.setBounds(400,600,30,30);
    dcage.setVisible(false);
    dcage.setOpaque(false);
    dcage.setContentAreaFilled(false);

    scage = new JButton();
    scage.setBounds(500,200,380,120);
    scage.setVisible(false);
    scage.setOpaque(false);
    scage.setContentAreaFilled(false);
    scage.setBorderPainted(false);
    scage.addActionListener(this);


    auto = new JButton();
    auto.setBounds(800,200,120,120);
    auto.setVisible(false);
    auto.setOpaque(false);
    auto.setContentAreaFilled(false);
    auto.setBorderPainted(false);

    disable = new JButton();
    disable.setBounds(200,100,100,120);
    disable.setVisible(false);
    disable.setOpaque(false);
    disable.setContentAreaFilled(false);
    disable.setBorderPainted(false);

    allianceB = new JButton();
    allianceB.setBounds(200,100,230,203);
    allianceB.setVisible(false);
    allianceB.setOpaque(false);
    allianceB.setContentAreaFilled(false);
    allianceB.setBorderPainted(false);

    allianceR = new JButton();
    allianceR.setBounds(200,400,200,200);
    allianceR.setVisible(false);
    allianceR.setOpaque(false);
    allianceR.setContentAreaFilled(false);
    allianceR.setBorderPainted(false);



    

    }





 // Removed actionPerformed from BackgroundPanel since it does not implement ActionListener




 @Override
 public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if (e.getSource() == coral1){
        scoutingrn.coral(1);
        System.out.println("input!");
    } else if (e.getSource() == coral2){
        scoutingrn.coral(2);
        System.out.println("output!");
    } else if (e.getSource() == coral3){
        scoutingrn.coral(3);
    } else if (e.getSource() == coral4){
        scoutingrn.coral(4);
    } else if (e.getSource() == coralMiss) {
        scoutingrn.coral(5);
    }

    if (e.getSource() == balgae){
        scoutingrn.bargeAlgae();
    }

    if (e.getSource() == palgae){
        scoutingrn.processorAlgae();
    }

    if (e.getSource() == dcage){
        scoutingrn.endgame(1);

    } else if (e.getSource() == scage){
        scoutingrn.endgame(2);

    } else if (e.getSource() == park){
        scoutingrn.endgame(3);
    }


 }

    
 class BackgroundPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image background = new ImageIcon("C://Users//enchi//.vscode//Scouting app//src//GUI//Scouter.png").getImage();
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }

    public static void main(String[] args){
        new Scout();
    }
    }

   
 }



