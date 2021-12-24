import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gra extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.CYAN);
        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(120,98,67));
        g.fillOval(50, 60, 100, 340);
    }
}
