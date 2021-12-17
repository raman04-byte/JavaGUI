public class final1 
{
    private int sum;
    private final int NUMBER;
    
    final1(int x)
    {
        NUMBER = x;
    }
    public void add()
    {
        sum+=NUMBER;
    } 
    public String toString()
    {
        return String.format("Sum of the number is : %d\n", sum);
    }
}
