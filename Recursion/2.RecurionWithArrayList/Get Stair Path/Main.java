import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        ArrayList<String>ans =getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) 
    {
    if(n==0)
    {
        ArrayList<String>base =new ArrayList<>();
        base.add("");
        return base;
    }
    ArrayList<String>myans=new ArrayList<>();
    if(n-1>=0)
    {
            ArrayList<String>first =getStairPaths(n-1);
            for(String ele :first)
            {
                myans.add("1"+ele);
            }    
    }
    if(n-2>=0)
    {
            ArrayList<String>second =getStairPaths(n-2);
            for(String ele :second)
            {
                myans.add("2"+ele);
            }    
    }
    if(n-3>=0)
    {
            ArrayList<String>third =getStairPaths(n-3);
            for(String ele :third)
            {
                myans.add("3"+ele);
            }    
    }
    return myans;
    }

}