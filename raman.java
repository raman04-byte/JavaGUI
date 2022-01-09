import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class raman extends JFrame {
    public static void main(String[] args) {
        DisplayMode displayMode = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
        raman r = new raman();
        r.run(displayMode);
    }
    private Animation a;
    private ScreenManager s;
    private Image bg;
    
    private static final DisplayMode modes1[] = {
        new DisplayMode(800,600,32,0),
        new DisplayMode(800,600,24,0),
        new DisplayMode(800,600,16,0),
        new DisplayMode(640,480,32,0),
        new DisplayMode(640,480,24,0),
        new DisplayMode(640,480,16,0),
    };

    public void loadImages(){
        bg = new ImageIcon().getImage();
        
    Image face1 = new ImageIcon("Pikachu.jpg").getImage();
    Image face2 = new ImageIcon("Pikachu1.jpg").getImage();
    Image face3 = new ImageIcon("Pikachu2.png").getImage();
    Image face4 = new ImageIcon("Pikachu3.png").getImage();
    Image face5 = new ImageIcon("Pikachu4.jpg").getImage();
    Image face6 = new ImageIcon("Pikachu5.png").getImage();

    a = new Animation();
        a.addscene(face1, 250);
        a.addscene(face2, 250);
        a.addscene(face3, 250);
        a.addscene(face4, 250);
        a.addscene(face5, 250);
        a.addscene(face6, 250);
    }
    public void run(DisplayMode displayMode){
        s = new ScreenManager();
        try{
            DisplayMode dm = s.findFirstCompatablMode(modes1);
            s.setFullScreen(dm);
            loadImages();
            movieloop();
        }finally{
            s.restoreScreen();
        }
    }
    public void movieloop(){
        long startingTime = System.currentTimeMillis();
        long cumTime = startingTime;
        while(cumTime - startingTime < 6000){
            long timepassed = System.currentTimeMillis() - cumTime;
            cumTime += timepassed;
            a.update(timepassed);
            
            // Drawing and updating screen
            Graphics2D g = s.getGraphics();
            draw(g);
            g.dispose();
            s.update();
            try
            {
                Thread.sleep(20);
            }catch(Exception ex){}
        }

    }
    public void draw (Graphics g){
        g.drawImage(bg, 0, 0, null);
        g.drawImage(a.getImage(), 0, 0, null);
    }
}
