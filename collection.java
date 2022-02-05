import java.util.*;

public class collection {
    public static void main(String[] args) {
        String[] crap = { "apples", "lemons", "pineapple", "bcaon", "youtube" };
        List<String> theList = Arrays.asList(crap);

        Collections.sort(theList);
        System.out.printf("%s \n", theList);
        Collections.sort(theList, Collections.reverseOrder());
        System.out.printf("%s \n", theList);
    }
}
