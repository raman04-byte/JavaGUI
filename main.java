
import java.util.Scanner;
public class main
{
    public static void main(String[] args) 
    {
    try (//     TheWindow h = new TheWindow();
        //     h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //     h.setSize(230,280);
        //     h.setVisible(true);
    Scanner scn = new Scanner(System.in)) {
        System.out.println("Enter how many times you want to set a thread a sleep");
        int a,b,c,d;
        
        System.out.println("For first");
        a = scn.nextInt();
        System.out.println("For second");
        b = scn.nextInt();
        System.out.println("For third");
        c = scn.nextInt();
        System.out.println("For fourth");
        d = scn.nextInt();

        Thread t1 = new Thread(new threads("First",a));
        Thread t2 = new Thread(new threads("Second",b));
        Thread t3 = new Thread(new threads("Third",c));
        Thread t4 = new Thread(new threads("Fourth",d));
            
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
}
