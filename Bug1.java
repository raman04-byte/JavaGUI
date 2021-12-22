import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import org.w3c.dom.events.MouseEvent;

public class Bug1 extends JFrame 
{
    private JPanel mousePanel;
    private JLabel statusbar;

    public Bug1()
    {
        super("This is a awesome title ");
        // setLayout(new FlowLayout());

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel,BorderLayout.CENTER);

        statusbar = new JLabel("DEFAULT ONE");
        add(statusbar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class HandlerClass implements MouseListener, MouseMotionListener
    {
        public void mouseClicked (MouseEvent event)
        {
            statusbar.setText(String.format("Clicked at %d, %d", event.getX(),event.getY()));
        }
        public void mousePressed (MouseEvent event)
        {
            statusbar.setText("You have pressed down the mouse");
        }
        public void mouseReleased(MouseEvent event)
        {
            statusbar.setText("You have released the mouse");
        }
        public void mouseEntered(MouseEvent event)
        {
            statusbar.setText("You have entered the area");
            mousePanel.setBackground(Color.CYAN);
        }
        public void mouseExcited(MouseEvent event)
        {
            statusbar.setText("Mouse has left the window");
            mousePanel.setBackground(Color.PINK);
        }
        public void mouseDragged(MouseEvent event)
        {
            statusbar.setText("Dragging the mouse. Stop doing that it's hurting pal");
        }
        public void mouseMoved(MouseEvent event)
        {
            statusbar.setText("You are moving a mouse !!!");
        }

    }
}
