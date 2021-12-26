import java.util.ArrayList;
import java.util.List;

public class collection 
{
    public static void main(String[] args) {
        String[] things = {"eggs","laser","hats","pie"};
        List<String> list1 = new ArrayList<String>();
        
        // Adding items to list
        for (String x : things) 
        {
            list1.add(x);    
        }
        String[] morethings = {"laser","hats"};
        List<String> list2 = new ArrayList<String>();
        for (String y : morethings) 
        {
            list1.add(y);    
        }
        for (int i = 0; i < list2.size(); i++) 
        {
            System.out.printf("%s ", list2.get(i));    
        }
        
    }    
}
