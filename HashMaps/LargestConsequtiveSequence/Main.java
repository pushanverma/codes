import java.io.*;
import java.util.*;

public class Main{

public static Scanner scn =new Scanner(System.in);
public static void main(String[] args) throws Exception 
{
    // write your code here
    int n=scn.nextInt();
    int []arr =new int[n];
    
    for(int i=0;i<n;i++)
    {
        arr[i]=scn.nextInt();
    }
    
    //1. Creating a hashmap 
    HashMap<Integer,Boolean>hm =new HashMap<>();
    
    // intially all elements are true 
    for(int ele :arr)
    {
        hm.put(ele,true);
    }
    //2. Potential starting point 
    
    for(int ele :arr)
    {
        if(hm.containsKey(ele-1))
        {
            hm.put(ele,false);
        }
    }
    
    //3. Check for the longest length 
    
    int maxLength=0;
    int maxStpt=0;
    
    for(int ele :arr)
    {
        if(hm.get(ele)==true)
        {
            int tempLength=1;
            int tempStpt=ele;
            
            while(hm.containsKey(tempLength+tempStpt))
            {
                tempLength++;
            }
        
        if(tempLength>maxLength)
            {
            maxLength=tempLength;
            maxStpt=tempStpt;
            }
        }
    }
    
    for(int i=maxStpt;i<maxStpt+maxLength;i++)
    {
        System.out.println(i);
    }
    
    
 }

}