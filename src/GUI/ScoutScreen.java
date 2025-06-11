package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoutScreen extends JFrame implements ActionListener{

    private JButton[] corals;


JButton coral1, coral2, coral3, coral4, balgae, palgae, dcage, scage, park, auto, disable, allianceB, allianceR;
ImageIcon titleIcon, bgIcon, parkIconY, parkIconN, sclimbIconY, sclimbIconN, dclimbIconY, dclimbIconN, allianceBY, allianceBN, allianceRY, allianceRN;
JTextField teamNum, matchNum, comments;




    
    
    public ScoutScreen(){
        setBounds(100, 200, 1500, 900);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

     



    }

    public static void main(String[] args){
        new ScoutScreen();

    }

     @Override
    public void actionPerformed(ActionEvent e) {
    } 
}
