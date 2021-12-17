public class Static1 
{
    private String firstnumber;
    private String secondnumber;
    private static int member = 0;

    public Static1(String fn, String sn)
    {
        firstnumber = fn;
        secondnumber = sn;
        member++;
        System.out.printf("Constructor for %s %s, members in the culb is : %d \n", firstnumber,secondnumber,member);

    }
     public String getFirst()
     {
         return firstnumber;
     } 
     public String getSecond()
     {
         return secondnumber;
     }
     public static int getMembers()
     {
        return member;
     }
}
