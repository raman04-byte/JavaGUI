import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Combo extends JFrame {

    private JComboBox Box;
    private JLabel picture;

    private static String[] filename = {"Button.jpg","Goku.jpg"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0]))}; 
    public Combo() {
        super("Title here");
        setLayout(new FlowLayout());

        Box = new JComboBox(filename);
        
    }
}
