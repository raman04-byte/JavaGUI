import java.util.*;

public class list_to_array {
    public static void main(String[] args) {
        String[] stuff = { "fruits", "Watermelon", "Sugarcane", "Apples", "Bruini" };
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));
        theList.add("pumpkin");
        theList.addFirst("firstThing");

        // Converting back to an Arrays
        stuff = theList.toArray(new String[theList.size()]);

        for(String x : stuff)
        {
            System.out.printf("%s ", x);
            System.out.println();
        }
    }
}