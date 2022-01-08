// The main class is starting now
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
public class Images extends JFrame
{
    public static void main(String... args) 
    {
        DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN); 
        Images i = new Images();
        i.run(dm);
    }

    private screen s;
    private Image bg;
    private Image pic;
    private boolean loaded;
    // This is a run method start and this is it
    public void run(DisplayMode dm)
    {
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN,24));
        loaded = false;
        screen s = new screen();
        try {
            s.setFullScreen(dm, this);
            loadpics();
            try{
                Thread.sleep(5000);
            }
            catch(Exception ex){}
        } finally {
            s.restoreScreen();
        }
    }
    // Load picture
    public void loadpics()
    {
        bg = new ImageIcon("Goku.jpg").getImage();
        pic = new ImageIcon("Pikachu.jpg").getImage();
        loaded = true;
        repaint();
    }
    public void paint(Graphics g)
    {
        if(g instanceof Graphics2D)
        {
            Graphics2D g2= (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); 
        }
        if(loaded)
        {
            g.drawImage(bg,0,0,null);
            g.drawImage(pic,0,0,null);
        }
    }
}
