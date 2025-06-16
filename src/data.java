import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class data extends JFrame implements ActionListener {
    
    public data() {
        JFrame newFrame = new JFrame();
        newFrame.setBounds(0, 0, 1500, 900);
        newFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Dataholder holder = new Dataholder();
        String[] columnNames = {"Team Number", "Match Number", "l1 coral", "l2 coral", 
                               "l3 coral", "l4 coral", "Missed Coral", "Deep Climb", 
                               "Shallow Climb", "Park", "Disabled", "Comments"};
        team storedTeam = null;
        try {
            FileReader fr = new FileReader("src/Scouting.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null && line != " ") {
                storedTeam = new team(line);
                holder.addTeam(storedTeam);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("File reading error");
        }
        

        // Create model with correct columns
        DefaultTableModel model = new DefaultTableModel(columnNames, 20);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Add to frame using BorderLayout
        newFrame.add(scrollPane, BorderLayout.CENTER);
        
        // Add data from holder
        for (int i = 0; i < holder.getTeamCount(); i++) {
            team currentTeam = storedTeam;
            model.addRow(new Object[]{
                currentTeam.getTeamNum(),
                currentTeam.getQualNum(),
                currentTeam.getCoral(1),
                currentTeam.getCoral(2),
                currentTeam.getCoral(3),
                currentTeam.getCoral(4),
                currentTeam.getCoral(5),
                currentTeam.getDeepClimb(),
                currentTeam.getShallowClimb(),
                currentTeam.getpark(),
                currentTeam.getDisabled(),
                currentTeam.getComments()
            });
        }
        
        newFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implementation needed
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new data());
    }
}