import javax.swing.JFrame;
import java.awt.*;
public class main extends JFrame
{
    public static void main(String[] args) 
    {
        DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN); 
        main m = new main();
        m.run(dm);
    }
    public void run(DisplayMode dm)
    {
        setForeground(Color.WHITE);
        setBackground(Color.PINK);
        setFont(new Font("Arial", Font.PLAIN,24));

        screen s = new screen();
        try {
            s.setFullScreen(dm, this);
            try{
                Thread.sleep(5000);
            }
            catch(Exception ex){}
        } finally {
            s.restoreScreen();
        }
    }
    public void paint(Graphics g)
    {
        if(g instanceof Graphics2D)
        {
            Graphics2D g2= (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); 
        }
        g.drawString("This is gonna be awesome now", 200, 200);
    }
}
