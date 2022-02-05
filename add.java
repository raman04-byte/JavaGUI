import java.util.*;
public class add 
{
    public static void main(String[] args) {
        // Convert stuff Arrays to list
        String[] stuff = {"apples","Corn","Norton","Bagon","Meatloaf"};
        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("twitter");

        for (String x : list2) 
        {
            System.out.printf("%s ",x);    
        } 
        System.out.println();
        Collections.addAll(list2, stuff);
        for (String x : list2) 
        {
            System.out.printf("%s ",x);    
        } 
        System.out.println();
        System.out.println(Collections.frequency(list2, "youtube"));

        boolean tof = Collections.disjoint(list1, list2);
        System.out.println(tof);
    }    
}
