import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class pikachu extends JFrame
{
    private JLabel item1;

    public pikachu()
    {
        super("The title here");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a sample text");
        item1.setToolTipText("You are hovering here");
        add(item1);
    }

}