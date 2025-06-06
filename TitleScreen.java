package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleScreen extends JFrame implements ActionListener {
    int coralCounter = 0;
    JLabel mylabel;
    JButton button1;
    JButton button2;
    JTextField input;
    private ScoutScreen hi;


    public TitleScreen() {

        setBounds(100, 200, 1500, 750);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel myLabel = new JLabel("FRCSCOUT");
        this.add(myLabel);

        setLayout(null);
        myLabel.setBounds(700, 350, 400, 100);

        button1 = new JButton("Start?");
        button1.setBounds(500, 500, 200, 100);
        button1.addActionListener(this);
        this.add(button1);

        button2 = new JButton("Scouting data");
        button2.setBounds(800, 500, 200, 100);
        button1.addActionListener(this);
        this.add(button2);

        frame.add(new JLabel(new ImageIcon("Path/To/Your/Image.png")));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            button1.setText("let's go!");
        }

        if (e.getSource() == button2) {
            button2.setText("Yipee");

        }

    } 

    public static void main (String[] args){
    }

}
