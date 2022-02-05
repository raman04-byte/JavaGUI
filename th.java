import java.util.Random;
// import java.util.random.*;
public class th implements Runnable
{
    String name;
    int time;
    Random r = new Random();
    
    public th(String s)
    {
        name = s;
        time = r.nextInt(999);
    }
    public void run()
    {
        try {
            System.out.printf("%s is sleeping for %d\n ", name,time);
            Thread.sleep(time);
            System.out.printf("%s is done sleeping for %d time", time);
        } catch (Exception e) {
            
        }
    }
}
