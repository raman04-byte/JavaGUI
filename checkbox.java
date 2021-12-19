import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkbox extends JFrame 
{
    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public checkbox()
    {
        super("This is a title");
        setLayout(new FlowLayout());

        tf = new JTextField("This is a sentece and I am very bad at typing here ,LOL", 100);
        tf.setFont(new Font("Serif", Font.PLAIN,14));
        add(tf);

        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);

        Handler thehandler =  new Handler();
        boldbox.addItemListener(thehandler);
        italicbox.addItemListener(thehandler);

    }

    private class Handler implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            Font font = null;

            if(boldbox.isSelected() && italicbox.isSelected())
            {
                font = new Font("Serif", Font.BOLD + Font.ITALIC,14);
            }

            else if(boldbox.isSelected())
            {
                font = new Font("Serif",Font.BOLD,14);
            }
            else if(italicbox.isSelected())
            {
                font = new Font("Serif",Font.ITALIC,14);
            }
            else
            {
                font = new Font("Serif",Font.PLAIN,14);
            }
            tf.setFont(font);
        }
    }
        
}
