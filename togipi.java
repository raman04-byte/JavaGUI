import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;

public class togipi extends JFrame
{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    
    private JPasswordField passwordField;
    public togipi()
    {
        super("Title here");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("Enter Text here");
        add(item2);

        item3 = new JTextField("Uneditable",20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("Mypass");
        add(passwordField);

        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);

        passwordField.addActionListener(handler);
    }

    private class thehandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String string = "";
            if(event.getSource()==item1)
            {
                string = String.format("field 1: %s", event.getActionCommand());
            }
            else if(event.getSource()==item2)
            {
                string = String.format("field 2: %s", event.getActionCommand());
            }
            else if(event.getSource()==item3)
            {
                string = String.format("field 3: %s", event.getActionCommand());
            }
            else if(event.getSource()==passwordField)
            {
                string = String .format("Password field is %s", event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null,string);
        }
    }

}
