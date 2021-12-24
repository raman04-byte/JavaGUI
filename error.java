import java.util.*;
public class error 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int x = 1;
        do {
            try {
            System.out.println("Enter number one ");
            int i = scn.nextInt();
            System.out.println("Enter second number ");
            int s = scn.nextInt();
            int div = i/s;
            System.out.println(div);
                x=2;
            } catch (Exception e) {
                System.out.println("You have entered wrong number pal");
            }
            
        } while (x==1);
    }    
}
