import java.io.*;
import java.util.*;

public class Main {
    
    public static Scanner scn =new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {
        // write your code here
        String str= scn.next();
        
        HashMap<Character,Integer>hm =new HashMap<>();
        
        
        for(int i=0;i<str.length();i++)
        {
            Character ch=str.charAt(i);
            
            // agr wo pehle aa chuka hoga
            if(hm.containsKey(ch))
            {
                int val =hm.get(ch);
                hm.put(ch,val+1);
            }
            else
            {
                //pehli bari aaya hai 
                hm.put(ch,1);
                
            }
        }
        
        Character maxfreq =str.charAt(0);
        
        
        for(Character key: hm.keySet())
        {
            if(hm.get(key)>hm.get(maxfreq))
            {
                maxfreq=key;
            }
        }
        System.out.println(maxfreq);
        
        
    }

}