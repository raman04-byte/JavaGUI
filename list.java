import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class list extends JFrame
{
    private JList ll;
    private static String[] colornames = {"black","cyan","pink","purple","red","blue","green","yellow"};
    private static Color[] colors = {Color.BLACK,Color.CYAN,Color.PINK,Color.getColor("#A020F0"),Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW};

    public list()
    {
        super("This is a title");
        setLayout(new FlowLayout());

        ll = new JList(colornames);
        ll.setVisibleRowCount(3);
        ll.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new JScrollPane(ll));

        ll.addListSelectionListener(
            new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent event)
                {
                    getContentPane().setBackground(colors[ll.getSelectedIndex()]);
                }

            }
        );
    }
}
