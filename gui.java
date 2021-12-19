import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class gui extends JFrame
{
    private JButton reg;
    private JButton custom;    

    public gui()
    {
        super("I am doing GUI");
        setLayout(new FlowLayout());

        reg = new JButton("Reg Button");
        add(reg);

        Icon a = new ImageIcon(getClass().getResource("Goku.jpg")); 
        Icon b = new ImageIcon(getClass().getResource("Pikachu.jpg"));
        
        custom = new JButton("Custom", a);
        custom.setRolloverIcon(b);

        add(custom);

        HandlerClass handler = new HandlerClass(); 
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }

    private class HandlerClass implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}
