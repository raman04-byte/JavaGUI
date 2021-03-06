import java.awt.*;

public abstract class Core {
    private static DisplayMode modes[] = {
        new DisplayMode(800,600,32,0),
        new DisplayMode(800,600,24,0),
        new DisplayMode(800,600,16,0),
        new DisplayMode(640,480,32,0),
        new DisplayMode(640,480,24,0),
        new DisplayMode(640,480,16,0),
    };
    private boolean running;
    protected ScreenManager s;

    // Stop method
    public void stop(){
        running = false;
    }

    // Running method
    public void run(){
        try{
            init();
            gameloop();
        }finally{
            s.restoreScreen();
        }
    }
    // sets to full screen

    public void init(){
        s = new ScreenManager();
        DisplayMode dm = s.findFirstCompatablMode(modes);
        s.setFullScreen(dm);

        Window w = s.getFullScreenWindow();
        w.setFont(new Font("Arial", Font.PLAIN,30));
        w.setBackground(Color.GREEN);
        w.setForeground(Color.WHITE);
        running = true;
    }

    // Main game loop

    public void gameloop(){
        long startTime = System.currentTimeMillis();
        long cumTime = startTime;

        while(running){
            long timePassed = System.currentTimeMillis()-cumTime;
            cumTime+=timePassed;

            update(timePassed);

            Graphics2D g = s.getGraphics(); 
            draw(g);
            g.dispose();
            s.update();
            try{
                Thread.sleep(20);
            }
            catch(Exception ex){}
        }
    }
    public void update(long timePassed){}    
    public abstract void draw(Graphics2D g);
}
