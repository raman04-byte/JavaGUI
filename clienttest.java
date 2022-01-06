import javax.swing.JFrame;
public class clienttest {
public static void main(String[] args) {
    client me;
    me = new client("127.0.0.1");
    me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    me.startrunning();
}    
}
