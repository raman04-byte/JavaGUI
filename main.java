import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class main
{
    public static void main(String[] args) 
    {
        // Bug1 nn = new Bug1();
        // nn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // nn.setSize(350,350);
        // nn.setVisible(true);
        // Bug nn = new Bug();
        // nn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // nn.setSize(350,350);
        // nn.setVisible(true);
        Adapt nn = new Adapt();
        nn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nn.setSize(350,350);
        nn.setVisible(true);
    }
}