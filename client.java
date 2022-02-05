import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class client extends JFrame {
    private JTextField userText;
    private JTextArea chatwindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message = "";
    private String serverIP;
    private Socket connection;

    public client(String host) {
        super("This is a awesome title for this");
        serverIP = host;
        userText = new JTextField();
        userText.setEditable(false);
        userText.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        sendData(event.getActionCommand());
                        userText.setText("");
                    }
                });
        add(userText, BorderLayout.NORTH);
        chatwindow = new JTextArea();
        add(new JScrollPane(chatwindow), BorderLayout.CENTER);
        setSize(300, 250);
        setVisible(true);
    }

    // Connect to Server
    public void startrunning() {
        try {
            connectToServer();
            setUpStream();
            whileChatting();
        } catch (EOFException eofException) {
            showMessage("\nConnections are terminated for now ....\n");
        } catch (IOException ioeException) {
            ioeException.printStackTrace();
        } finally {
            closeCrap();
        }
    }

    // Connectiion to a server
    private void connectToServer() throws IOException {
        showMessage("\n...Connecting to a server...");
        connection = new Socket(InetAddress.getByName(serverIP), 6789);
        showMessage("Connection to:" + connection.getInetAddress().getHostName());
    }
    // Set up streams for messaging sending and receving from the server
    private void setUpStream() throws IOException{
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\n.. Stream is good to go now and the process is done..!!\n");  
    }
    // while chatting server
    private void whileChatting() throws IOException{
        ableToType(true);
        do {
            try {
                message = (String) input.readObject();
                showMessage("\n"+message);
            } catch (ClassNotFoundException classNotFoundException) {
                showMessage("\n Object type is not recoginsed...!!");
            }
        } while (!message.equals("\nSERVER - END"));
    }
    private void closeCrap(){
        showMessage("\n Closing crap down ...!!!!");
        ableToType(false);
        try {
            output.close();
            input.close();
            connection.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    // zend message to server
    private void sendData(String message)
    {
        try {
                output.writeObject("\nCLIENT - " + message);
                output.flush();
                showMessage("\nCLIENT - " + message);            
        } catch (IOException ioException) {
            chatwindow.append("\nSomething just got messed up now ..!!\n");
        }
    }
    // Chat window
    private void showMessage(final String m)
    {
        SwingUtilities.invokeLater(
            new Runnable() {
             public void run()
             {
                 chatwindow.append(m);
             }   
            }
        );
    }
    // Giving user permission to type
    private void ableToType(final boolean tof)
    {
        SwingUtilities.invokeLater(
            new Runnable() {
             public void run()
             {
                 userText.setEditable(tof);
             }   
            }
        );
    }
}
