import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame
{
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;
    
    // Constructor
    public Server()
    {
        super("Raman Instant Message");
        userText = new JTextField();
        userText.setEditable(false);
        userText.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    sendMessage(event.getActionCommand());
                    userText.setText("");
                }
            }
        );
        add(userText, BorderLayout.NORTH);
        chatWindow = new JTextArea();
        add(new JScrollPane(chatWindow));
        setSize(300,150);
        setVisible(true);
    }

    public void startrunning() 
    {
        try{
            server = new ServerSocket(6789,100);
            while(true)
            {
                try {
                    waitForConnection();
                    setUpStreams();
                    whileChatting();
                } catch (EOFException eofexception) {
                    showMessage("\n Connections has been ended see you soon !");
                }finally
                {
                    closeCrap();
                }
            }
        }   
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        } 
    }
    // Waiting for connections public method is being used
    private void waitForConnection() throws IOException 
    {
        showMessage("\nWaiting for someone to connect !! ... \n");
        connection = server.accept(); 
        showMessage("\nNow connected to someone with address " + connection.getInetAddress().getHostName());
    }
    // Stream for send and receive data 
    private void setUpStreams() throws IOException
    {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\n Stream is now set up !!");    
    }
    // During the chat conversation 
    private void whileChatting() throws IOException{
            String message = "\nYou are now connected for the chat ";
            sendMessage(message);
            ableToType(true);
            do {
                try {
                    message = (String)input.readObject();
                    showMessage("\n"+ message);
                } catch (ClassNotFoundException classNotFoundException) {
                     showMessage("User send this message");
                }
            } while (!message.equals("CLIENT- END"));
    }
    // Close streams and sockets after chatting 
    private void closeCrap()
    {
        showMessage("\nCloseing connections...\n");
        ableToType(false);
        try {
            output.close();
            input.close();
            connection.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    // Send message to someone using some java and some techniquus
    private void sendMessage(String message)
    {
        try {
            output.writeObject("SERVER " + message);
            output.flush();
            showMessage("SERVER " + message);
        } catch (IOException ioException) {
            chatWindow.append("\n ERROR: I CAN'T SEND ANY MESSAGE");
        }
    }
    // Updating chatwindow
    private void showMessage(final String text)
    {
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    chatWindow.append(text);
                }
            }
        );
    }  
    // Letting user to type stuff into the box
    private void ableToType(final boolean tof) {
        SwingUtilities.invokeLater(
            new Runnable() {
             public void run() {
                 userText.setEditable(tof);
             }   
            }
        );
    }
}
