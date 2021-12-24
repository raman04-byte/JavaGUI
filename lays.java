import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lays extends JFrame 
{
    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;
    
    public lays()
    {
        super("This is a awesome title here");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);
        // For the left button 
        lb = new JButton("Left button");
        add(lb);
        lb.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
        );
        // For the center button
        cb = new JButton("Center button");
        add(cb);
        cb.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.CENTER);
                    layout.layoutContainer(container);
                }
            }
        );
        // For right button
        rb = new JButton("Right Button");
        add(rb);
        rb.addActionListener(
            new ActionListener()          
            {
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.RIGHT);
                    layout.layoutContainer(container);
                }
            }
        );
    }
}
