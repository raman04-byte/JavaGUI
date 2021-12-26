import java.util.*;
public class linkedlist
{
    public static void main(String[] args) {
        String[] things = {"Apples","Bannana","Chiku","Cat","Dog","Elephant"};
        List<String> list1 = new LinkedList<String>();

        for(String x : things)
        {
            list1.add(x);
        }
        String[] things2 = {"More","Items", "in"};
        List<String> list2 = new LinkedList<String>();
        for(String y : things2)
        {
            list2.add(y);
        }
        list1.addAll(list2);
        list2 = null;
        printMe(list1);
        removeStuff(list1,2,4);
        printMe(list1);
        reverseMe(list1);
    }    
    // Print me element
    private static void printMe(List<String> l)
    {
        for(String b : l)
        {
            System.out.printf("%s ", b);
        }
        System.out.println();
    }
    // Remove method in String
    private static void removeStuff(List<String> l, int from, int to)
    {
        l.subList(from, to).clear();
    }
    // Reverse string method
    private static void reverseMe(List<String> l)
    {
        ListIterator<String> me = l.listIterator(l.size());
        while(me.hasPrevious()){
            System.out.printf("%s", me.previous());
        }
    }
}
