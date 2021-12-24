import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class main
{
    public static void main(String[] args) 
    {
        // lays go = new lays();
        // go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // go.setSize(350,350);
        // go.setVisible(true);

        JFrame j = new JFrame("Awesome title is this");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra gg = new gra();
        j.add(gg);
        j.setSize(350,350);
        j.setVisible(true);
    }
}
