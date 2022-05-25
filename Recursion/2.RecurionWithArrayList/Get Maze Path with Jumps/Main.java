import java.io.*;
import java.util.*;

public class Main {

public static Scanner scn =new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {
        int n =scn.nextInt();
        int m =scn.nextInt();
        
        ArrayList<String> ans =getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);
        
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr==dr && sc==dc)
        {
            ArrayList<String> base =new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String>myans =new ArrayList<>();
        //horizonatal call
        for(int jump=1;sc+jump<=dc;jump++)
        {
            ArrayList<String> hcall =getMazePaths(sr,sc+jump,dr,dc);
            for(String ele:hcall)
            {
                myans.add("h"+jump+ele);
            }
            
        }
        //vertical call
        for(int jump=1;sr+jump<=dr;jump++)
        {
            ArrayList<String> vcall =getMazePaths(sr+jump,sc,dr,dc);
            for(String ele:vcall)
            {
                myans.add("v"+jump+ele);
            }
        }
        
        //diagonal call
        for(int jump=1;sr+jump<=dr && sc+jump<=dc;jump++)
        {
           ArrayList<String> dcall =getMazePaths(sr+jump,sc+jump,dr,dc);
            for(String ele:dcall)
            {
                myans.add("d"+jump+ele);
            } 
        }
        return myans;
        
    }

}