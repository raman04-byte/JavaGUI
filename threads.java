import java.util.*;

public class threads implements Runnable {
    String name;
    int time;
    Random r = new Random();
    
    public threads(String x, int y) {
        name = x;
        time = r.nextInt(y);

    }

    public void run() {
        try {
            System.out.printf("%s is sleeping for %d time \n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done sleeping \n", name);
        } catch (Exception e) {
        }
    }
}
