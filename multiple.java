import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;

public class multiple extends JFrame
{
    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private static String[] foods = {"BURGER","PIZZA", "NITIN", "BOTTLE", "SPECS", "CAP", "JACKET", "NOSE", "CHAIN"};

    public multiple()
    {
        super("This is a awesome title here ");
        setLayout(new FlowLayout());

        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(4);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("move --> ");
        movebutton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    rightlist.setListData(leftlist.getSelectedValues());
                }
            }
        );
        add(movebutton);
        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(15);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));
    }
}
