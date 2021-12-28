import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class app extends JApplet
{
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("This actually works", 25, 25);
    }
}