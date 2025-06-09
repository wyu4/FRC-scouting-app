package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoutScreen extends JFrame implements ActionListener{
    private JButton coral1;
    private JButton coral2;
    private JButton coral3;
    private JButton coral4;
    private JButton balgae;
    private JButton palgae;
    private JButton dcage;
    private JButton scage;
    private JButton park;
    private JButton[] corals;
    
    
    public ScoutScreen(){
        setBounds(100, 200, 1500, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

     



    }

    public static void main(String[] args){
        new ScoutScreen();

    }

     @Override
    public void actionPerformed(ActionEvent e) {
    } 
}
