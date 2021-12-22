import java.util.*;
public class create {
    public static void main(String[] args) {
        final Formatter x;

        try{
            x = new Formatter("new.txt");
            System.out.println("File is created in your system");
        }
        catch(Exception e)
        {
            System.out.println("You got an error here ");
        }
    }
}
