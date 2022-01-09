import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class main extends JFrame {
    public static void main(String[] args) {
        DisplayMode displayMode = new DisplayMode(800,600,16, DisplayMode.REFRESH_RATE_UNKNOWN);
        main m = new main();
        m.run(displayMode);
        
    }
    private Screen scn;
    private Image bg;
    private Animation a;

    public void loadpics() {
        bg = new ImageIcon("Goku.jpg").getImage();
        Image face1 = new ImageIcon("Pikachu.jpg").getImage();
        Image face2 = new ImageIcon("Pikachu1.jpg").getImage();
        Image face3 = new ImageIcon("Pikachu2.jpg").getImage();
        Image face4 = new ImageIcon("Pikachu3.jpg").getImage();
        Image face5 = new ImageIcon("Pikachu4.jpg").getImage();
        Image face6 = new ImageIcon("Pikachu5.jpg").getImage();

        a = new Animation();
        a.addscene(face1, 250);
        a.addscene(face2, 250);
        a.addscene(face3, 250);
        a.addscene(face4, 250);
        a.addscene(face5, 250);
        a.addscene(face6, 250);
     }
     public void run(DisplayMode m)
     {
         scn = new Screen();
        try {
            // scn.setFullScreen(dm, new JFrame());
            loadpics();
            movieLoop();
        }finally{
            scn.restoreScreen();
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

             Graphics g = scn.getFullScreeWindow().getGraphics();
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
     }
}