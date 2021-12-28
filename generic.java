import java.util.*;

public class generic 
{
    public static void main(String[] args)
    {
        Integer[] irayIntegers = {1,2,3,4,5};
        Character[] cray = {'n','i','t','i','n'};

        printMe(irayIntegers);
        printMe(cray);
        
    }
    // Templates we are using this 
    public static <T> void printMe(T[] x) 
    {
        for(T y : x)
        {
            System.out.printf("%s ",y);
        }
        System.out.println();
    }
    // public static void printMe(Integer[] i) 
    // {
    //     for(Integer x : i)
    //     {
    //         System.out.printf("%s ", x);
    //     }
    //     System.out.println();
    // }
    // public static void printMe(Character[] i) 
    // {
    //     for(Character x : i)
    //     {
    //         System.out.printf("%s ", x);
    //     }
    //     System.out.println();
    // }
}