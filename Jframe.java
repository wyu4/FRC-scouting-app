import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jframe extends JFrame implements ActionListener {
    int coralCounter = 0;
    JLabel mylabel;
    JButton button1;
    JTextField input;
    public static void main(String[] args){
        
        new Jframe();
    }

    public Jframe() {
    setBounds(100,200,1500,800);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JLabel myLabel = new JLabel("FRCSCOUT");
    this.add(myLabel);

    setLayout(null);
    myLabel.setBounds(700,350,400,100);

    button1 = new JButton ("Start?");
    button1.setBounds(650,500,200,100);
    button1.addActionListener(this);
    this.add(button1);
   

    input = new JTextField("add new text here");
    input.setBounds(600,650,200,300);
    this.add(input);
    
}
@Override
public void actionPerformed(ActionEvent e){
    if (e.getSource() == button1){
        button1.setText("clicked");
        coralCounter ++;
        button1.setText(input.getText());

    }
    
}



}

