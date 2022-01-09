import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class raman extends JFrame {
    public static void main(String[] args) {
        DisplayMode displayMode = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
        raman r = new raman();
        r.run(displayMode);
    }
    
    private Screen screen;
    private Image bg;
    private Animation a;

    public void loadpics() {
        bg = new ImageIcon("Goku.jpg").getImage();
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
     public void run(DisplayMode dm)
     {
        screen = new Screen();
        try {
            screen.setFullScreen(dm, new JFrame());
            loadpics();
            movieLoop();
        }finally{
            screen.restoreScreen();
        }
     }
     public void movieLoop()
     {
         long startingTime = System.currentTimeMillis();
         long cumtime = startingTime;

         while(cumtime - startingTime < 5000)
         {
             long timepassed = System.currentTimeMillis() - cumtime;
             cumtime += timepassed;
             a.update(timepassed);

             Graphics g = screen.getFullScreeWindow().getGraphics();
             draw(g);
             g.dispose();

             try{
                 Thread.sleep(20);
             }
             catch(Exception ex){}
         }
     }
     public void draw(Graphics g)
     {
         g.drawImage(bg, 0, 0, null);
         g.drawImage(a.getImage(), 0, 0, null);
 
}}
