public class str 
{
    public static void main(String[] args) {
        String[] w = {"Ramajsks","Rat","Rai"};
        for (String x : w) 
        {
            if(x.startsWith("Ra"))
            System.out.println("This word starts with Ra. GOOD JOB");
            
            if(x.endsWith("at"))
            System.out.println("This ends with at ");
        } 
    }    
}
