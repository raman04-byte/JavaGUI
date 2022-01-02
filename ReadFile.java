import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ReadFile extends JFrame {
    private JTextField addressbar;
    private JEditorPane display;

    public ReadFile() {
        super("Raman Browser is running");

        addressbar = new JTextField("Enter a url pal to search on the interenet and yup!!");
        addressbar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        loadCrap(event.getActionCommand());
                    }
                });
        add(addressbar, BorderLayout.NORTH);
        display = new JEditorPane();
        display.setEditable(false);
        display.addHyperlinkListener(
                new HyperlinkListener() {
                    public void hyperlinkUpdate(HyperlinkEvent event) {
                        if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                            loadCrap(event.getURL().toString());
                        }
                    }
                });
        add(new JScrollPane(display), BorderLayout.CENTER);
        setSize(200, 200);
        setVisible(true);
    }

    private void loadCrap(String userText) {
        try {
            // this 
            display.setPage(userText);
            addressbar.setText(userText);
        } catch (Exception e) {
            System.out.println(
                    "This is a crap and try again in few second and please see your code again for any buig or not and I am done here");
        }
    }
}
