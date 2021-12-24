import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;
// import javax.swing.JFrame;
public class ASMD
{
    public static void main(String[] args) 
    {
        // Adapt nn = new Adapt();
        // nn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // nn.setSize(350,350);
        // nn.setVisible(true);

        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("This is for GUI ");
            System.out.println("Enter what you want to do ");
            System.out.println("1 For addition");
            System.out.println("2 For Substraction");
            System.out.println("3 For Multiplication");
            System.out.println("4 For Division");

            int number = scn.nextInt();

            switch (number) {
                case 1:
                    
                String fn = JOptionPane.showInputDialog("Enter a number 1");
                String sn = JOptionPane.showInputDialog("Enter a number 2");
   
                int fi = Integer.parseInt(fn);
                int si = Integer.parseInt(sn);
   
                int sum = fi + si;
                JOptionPane.showMessageDialog(null, "The addition of the number is " + sum, "Addition", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    
                String ffn = JOptionPane.showInputDialog("Enter a number 1");
                String ssn = JOptionPane.showInputDialog("Enter a number 2");
   
                int ffi = Integer.parseInt(ffn);
                int ssi = Integer.parseInt(ssn);
   
                int substraction = ffi - ssi;
                JOptionPane.showMessageDialog(null, "The substraction of the number is " + substraction, "Substraction", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    
                String fffn = JOptionPane.showInputDialog("Enter a number 1");
                String sssn = JOptionPane.showInputDialog("Enter a number 2");
   
                int fffi = Integer.parseInt(fffn);
                int sssi = Integer.parseInt(sssn);
   
                int multiplication = fffi * sssi;
                JOptionPane.showMessageDialog(null, "The multiplication of the number is " + multiplication, "Multiplication", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    
                String ffffn = JOptionPane.showInputDialog("Enter a number 1");
                String ssssn = JOptionPane.showInputDialog("Enter a number 2");
   
                int ffffi = Integer.parseInt(ffffn);
                int ssssi = Integer.parseInt(ssssn);
   
                int division = ffffi / ssssi;
                JOptionPane.showMessageDialog(null, "The division of the number is " + division, "Division", JOptionPane.PLAIN_MESSAGE);
                    break;
            
                default:
                System.out.println("Enter valid number");
                    break;
            }
        } catch (HeadlessException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}