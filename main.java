import javax.swing.JOptionPane;

import java.nio.file.AccessDeniedException;
import java.util.EnumSet;
public class main{
    public static void main(String[] args) {
        // for (pikachu people : pikachu.values())
        //     System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getage());
        //     System.out.println();
        //     for(pikachu people: EnumSet.range(pikachu.Gargi, pikachu.chutki))
        //     System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getage());
        //  Static1 pObject = new Static1("Raman ","Tank");   
        //  Static1 pObject1 = new Static1("Rajat ","Tank");   
        //  Static1 pObject2 = new Static1("Nitin ","Agarwal");   

        //  System.out.println();
        //  System.out.println(pObject.getFirst());
        //  System.out.println(pObject.getSecond());
        //  System.out.println(pObject.getMembers());
        // final1 finalobj = new final1(7);
        
        // for (int i = 0; i < 5; i++) {
        //         finalobj.add();
        //     System.out.printf("%s", finalobj);
        // }
        // togipi objTogipi = new togipi();
        // pikachu pikaobj = new pikachu();
        // objTogipi.eat();
        // pikaobj.eat();

        String fn = JOptionPane.showInputDialog("Enter a number 1");
        String sn = JOptionPane.showInputDialog("Enter a number 2");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1+num2;

        JOptionPane.showMessageDialog(null, "The addition of the numbers are " + sum, "Addition",JOptionPane.PLAIN_MESSAGE);
    }
}