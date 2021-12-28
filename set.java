import java.util.*;

public class set 
{
    public static void main(String[] args)
    {
        String[] things = {"Raman","raman","Raman","Tank"};
        List<String> list = Arrays.asList(things);
        System.out.println("The values in the string are ");
        System.out.printf("%s ", list);
        System.out.println();
        Set<String> tt = new HashSet<String>(list);
        System.out.printf("%s ", tt);
        System.out.println();
    }    
}
