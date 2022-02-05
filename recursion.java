import java.util.Scanner;

public class recursion 
{
        //main
        public static void main(String[] args) {
            try (Scanner scn = new Scanner(System.in)) {
                System.out.println("Enter a number you want to do factorial :");
                long f = scn.nextLong();
                System.out.print("The factorial of the number is : ");
                System.out.println(fact(f));
            }
        } 
        public static long fact(long n)
        {
            if(n <= 1)
            {
                return 1;
            }
            else
            return n*fact(n-1);
        }
}
