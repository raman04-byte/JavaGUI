import java.net.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ap extends JApplet {
    private HashMap<String, URL> websiteinfo;
    private ArrayList<String> titles;
    private JList mainJList;

    // Init function starting
    public void init() {
        websiteinfo = new HashMap<String, URL>();
        titles = new ArrayList<String>();

        grabHTMLInfo();
        add(new JLabel("What website you want to visit now "), BorderLayout.NORTH);
        mainJList = new JList(titles.toArray());
        mainJList.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        Object object = mainJList.getSelectedValue();
                        URL newDocument = websiteinfo.get(object);
                        AppletContext browser = getAppletContext();
                        browser.showDocument(newDocument);
                    }
                });
                add(new JScrollPane(mainJList), BorderLayout.CENTER);
    }

    public void grabHTMLInfo() {
        String title;
        String address;
        URL url;
        int counter = 0;
        title = getParameter("title" + counter);
        while (title != null) {
            address = getParameter("address" + counter);
            try {
                url = new URL(address);
                websiteinfo.put(title, url);
                titles.add(title);
            } catch (MalformedURLException urlException) {
                urlException.printStackTrace();
            }
            ++counter;
            title = getParameter("title"+counter);
        }

    }
}