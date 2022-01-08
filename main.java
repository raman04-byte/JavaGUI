public class main {
    public static void main(String[] args) {
    Thread t1 = new Thread(new th("one"));
    Thread t2 = new Thread(new th("two"));
    Thread t3 = new Thread(new th("three"));

    t1.start();
    t2.start();
    t3.start();
    }
}
