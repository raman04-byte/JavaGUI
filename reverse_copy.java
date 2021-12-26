import java.util.*;

public class reverse_copy 
{
    public static void main(String[] args) {
        // Convert an array to the list
        Character[] ray = {'r','m','k','j','h'};
        List<Character> theList = Arrays.asList(ray);
        System.out.println("The List is  : ");
        output(theList);

        // Reversing and printing the list
        Collections.reverse(theList);
        System.out.println("After reverse : ");
        output(theList);

        Character[] newRay = new Character[3];
        List<Character> listcopy = Arrays.asList(newRay);

        // Copy content from one to another
        Collections.copy(listcopy, theList);
        System.out.println("Copy of the list : ");
        output(listcopy);

        // Filling random values in this

    }  

    private static void output(List<Character> ll)
    {
        for(Character thing : ll)
        {
            System.out.printf("%s ",thing);
        }
        System.out.println();
    }
}
