import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bug extends JFrame {

    private JComboBox box;
    private JLabel picture;

    private static String[] filename = { "Button.jpg", "Pikachu.jpg" };
    private Icon[] pics = { new ImageIcon(getClass().getResource(filename[0])) };

    public Bug() {
        super("Title here");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent event) {
                        if (event.getStateChange() == ItemEvent.SELECTED) {

                            picture.setIcon(pics[box.getSelectedIndex()]);
                        }

                    }
                });
        add(box);
        picture = new JLabel(pics[0]);
        add(picture);
    }
}