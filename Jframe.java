import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jframe extends JFrame implements ActionListener {
    int coralCounter = 0;
    JLabel mylabel;
    JButton button1;
    JButton button2;
    JTextField input;
    boolean gotitle = true;
    boolean goScout = false;
    boolean goData = false;

    public static void main(String[] args) {

        new Jframe();
    }

    public Jframe() {
        setBounds(100, 200, 1500, 750);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        if (gotitle) {
            titleScreen();
        } else if (goScout) {
            ScoutScreen();
        } else if (goData) {

        }
    }

    public void titleScreen() {

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

        input = new JTextField("add new text here");
        input.setBounds(600, 600, 200, 100);
        this.add(input);

    }

    public void ScoutScreen() {
        button2 = new JButton("Scouting data");
        button2.setBounds(800, 500, 200, 100);
        button1.addActionListener(this);
        this.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            button1.setText("let's go!");
            goScout = true;
            gotitle = false;
            coralCounter++;
        }

        if (e.getSource() == button2) {
            button2.setText("Yipee");

        }

    }

}
