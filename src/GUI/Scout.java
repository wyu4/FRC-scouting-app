package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;

import ScoutScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Scout extends JFrame implements ActionListener {
    int coralCounter = 0;
    boolean hello = true;
    private Image backgroundImage;
    private JPanel backgroundPanel;
    static JFrame frame;

    JButton start, data, exit, home;




public Scout(){

    setBounds(200, 200, 1500, 900);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);

    backgroundPanel = new BackgroundPanel();
    backgroundPanel.setBounds(0, 0, 1500, 900);
    backgroundPanel.setLayout(null);
    setContentPane(backgroundPanel);

    start = new JButton();
    start.setBounds(240,430,375,225);
    start.setVisible(true);
    start.setOpaque(false);
    start.setContentAreaFilled(false);
    start.setBorderPainted(false);
    start.addActionListener(this);



    backgroundPanel.add(start);
    setVisible(true);


}


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            new ScoutScreen();
            dispose();
        }

     
        if (e.getSource() == data) {
            data.setText("Yipee");

        }

    } 

    public static void main(String[] args){
        new Scout();

    }



}

 class BackgroundPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image background = new ImageIcon("C:/Users/enchi/.vscode/Scouting app/src/GUI/title.png").getImage();
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }
}