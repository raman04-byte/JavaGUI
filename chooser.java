import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class chooser extends JFrame 
{
    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public chooser()
    {
        super("This is a awesome title here");
        panel = new JPanel();
        panel.setBackground(color);

        b = new JButton("Choose a color pal");
        b.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    color = JColorChooser.showDialog(null, "Pick your color pal", color);

                    if(color == null)
                    color = (Color.WHITE);
                    
                    panel.setBackground(color);
                }
            }
        );
        add(panel, BorderLayout.CENTER);
        add(b, BorderLayout.SOUTH);
        setSize(500,500);
        setVisible(true);
    }
}
