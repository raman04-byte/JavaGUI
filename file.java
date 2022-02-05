import java.io.File;

public class file {
public static void main(String[] args) {
    File x = new File("C:\\Users\\raman\\OneDrive\\Documents\\Bucky Java\\nn.txt");
    if(x.exists())
    {
        System.out.println(x.getName() + " exsists");
    }
    else
    {
        System.out.println("Doesn't exsist at all");
    }
}    
}
