import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Combo extends JFrame {

    private JCheckBox Box;
    private JLabel picture;

    private static String[] filename = {"Button.jpg","Goku.jpg"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0]))}; 
    public Combo() {
        super("Title here");
    }
}
