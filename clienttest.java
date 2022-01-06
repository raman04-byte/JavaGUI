import javax.swing.JFrame;
public class clienttest {
public static void main(String[] args) {
    Server e = new Server();
    e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    e.startrunning();
    client me;
    me = new client("127.0.0.1");
    me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    me.startrunning();
    //     ReadFile dude = new ReadFile();
    // dude.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}    
}
