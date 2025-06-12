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
    JButton start, data;
    ImageIcon backGround;
    boolean hello = true;
    private Image backgroundImage;
    static URL titleUrl;


    public TitleScreen() {

        setBounds(100, 200, 1500, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel myLabel = new JLabel("FRCSCOUT");
        this.add(myLabel);

        setLayout(null);
        myLabel.setBounds(700, 350, 400, 100);

   
        start = new JButton("HI");
        start.setBounds(600,500,232,86);
        start.setVisible(true);
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(true);
        this.add(start);

        
        backGround = new ImageIcon("C:/Users/enchi/.vscode/Scouting app/src/cyberTruck.png");
        JLabel backgroundLabel = new JLabel(backGround);
        backgroundLabel.setLayout(new BorderLayout());
        backgroundLabel.setIcon(backGround);
        this.add(back)


        setContentPane(backgroundLabel);



        


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            start.setText("let's go!");
            
        }

     
        if (e.getSource() == data) {
            data.setText("Yipee");

        }

    } 

    public boolean getActive(){
        return hello;
    }

    public static void main(String[] args){
        new TitleScreen();
    }

}

