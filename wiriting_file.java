import java.io.*;
import java.lang.*;
import java.util.*;

public class wiriting_file
{
    private Formatter x;
    public void openFile()
    {
        try {
            x = new Formatter("real.txt");
        } catch (Exception e) {
            System.out.println("You have an error building this file");
        }
    }
    public void addRecords()
    {
        x.format("%s %s %s ", "19","Raman","Tank");
    }
    public void closeFile()
    {
        x.close();
    }
}