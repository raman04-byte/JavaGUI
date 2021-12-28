import java.util.*;

public class generic_return {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter 3 numbers you want to compare and get largest value");   
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    System.out.println("The greatest of the numeber are as follow");
    System.out.println(max(a, b, c));
}   
public static <T extends Comparable<T>> T max(T a, T b, T c) 
{
    T m = a;
    if(b.compareTo(a)>0)
    m = b;
    
    if(c.compareTo(m)>0)
    m = c;

    return m;
} 
}
