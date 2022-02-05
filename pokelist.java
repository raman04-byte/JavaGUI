public class pokelist 
{
    private chari list[] = new chari[5];
    private int i = 0;
    
    public void add(chari d)
    {
        if(i<list.length)
        {
            list[i] = d;

            System.out.println("The dog added at the index is "+ i);
            i++;
        }

    }

}
