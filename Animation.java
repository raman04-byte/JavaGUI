import java.awt.Image;
import java.util.ArrayList;

public class Animation {
    private ArrayList scenes;
    private int sceneIndex;
    private long movietime;
    private long totaltime;

    // Constructor is made
    public Animation()
    {
        scenes = new ArrayList();
        totaltime = 0;
        start();
    }
    public synchronized void addscene(Image i,long t)
    {
        totaltime += t;
        scenes.add(new OneScene(i, totaltime));
    }
    // Starting animation from starting 
    public synchronized void start()
    {
        movietime = 0;
        sceneIndex = 0;
    } 
    public synchronized void update(long timepassed)
    {
        if(scenes.size()>1)
        {
            movietime+=timepassed;
            if(movietime>=totaltime)
            {
                movietime = 0;
                sceneIndex = 0;
            }
            while(movietime > getScene(sceneIndex).endTime){
                sceneIndex++;
            }
        }
    }
    // Getting animation current scene (aka current image)
    public synchronized Image getImage()
    {
        if(scenes.size() == 0)
        {
            return null;
        }
        else
        {
            return getScene(sceneIndex).pic;
        }
    }

    // Getting scene
    private OneScene getScene(int x)
    {
        return (OneScene)scenes.get(x);
    }
    private class OneScene{
        Image pic;
        long endTime;
        public OneScene(Image pic, long endTime)
        {
            this.pic = pic;
            this.endTime = endTime;
        }
    }
}
