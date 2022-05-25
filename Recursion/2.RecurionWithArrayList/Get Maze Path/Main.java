import java.io.*;
import java.util.*;

public class Main {

public static Scanner scn =new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {
    int n =scn.nextInt();
    int m =scn.nextInt();
    ArrayList<String>ans =getMazePaths(0,0,n-1,m-1);
    System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) 
    {
        
        if(sr==dr && sc==dc)
        {
            ArrayList<String> base =new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myans= new ArrayList<>();
        
        
    //horizontall call(column change --> j change --> sc)
        
    if(sc+1<=dc)
    {
        ArrayList<String> hcall =getMazePaths(sr,sc+1,dr,dc);
        for(String ele :hcall)
        {
            myans.add("h"+ele);
        }
    }
        
        
        //vertical call(row change --> i change --> sr )
        if(sr+1<=dr)
        {
            ArrayList<String> vcall= getMazePaths(sr+1,sc,dr,dc);
            for(String ele:vcall)
            {
                myans.add("v"+ele);
            }    
        }
        
        
        
        
        
        
        return myans;
        
    }

}