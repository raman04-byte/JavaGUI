import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkbox extends JFrame 
{
    private JTextField tf;
    // private JButton tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public checkbox()
    {
        
        super("This is a title");
        setLayout(new FlowLayout());

        tf = new JTextField("This is a sentece and I am very bad at typing here ,LOL", 14);
        tf.setFont(new Font("Serif", Font.PLAIN,14));
        // Icon x = new ImageIcon(getClass().getResource("Pikachu.jpg"));  
        tf.setBackground(Color.PINK);
        add(tf);

        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        italicbox.setBackground(Color.CYAN);
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
