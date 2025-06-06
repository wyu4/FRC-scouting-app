package GUI;

import javax.swing.*;
import java.awt.*;

public class ScoutScreen extends JPanel {
    public void painComponent(Graphics g) {
        ImageIcon image = new ImageIcon("cyberTruck.png");

        g.drawImage(image.getImage(), 300, 400, 44, 24, null);
    }
}
