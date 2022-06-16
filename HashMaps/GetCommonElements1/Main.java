import java.io.*;
import java.util.*;

public class Main{

public static Scanner scn =new Scanner(System.in);

public static void main(String[] args) throws Exception 
{
    // write your code here
    
    
    //1st array 
    int n1 =scn.nextInt();
    int []a=new int[n1];
    for(int i=0;i<n1;i++)
    {
        a[i]=scn.nextInt();
    }
    
    //2nd array 
    int n2=scn.nextInt();
    int []b=new int[n2];
    for(int i=0;i<n2;i++)
    {
        b[i]=scn.nextInt();
    }
    
    
    HashMap<Integer,Integer>hm =new HashMap<>();
    
    
    //copying elements of array a in hashmap
    
    for(int ele:a)
    {
        
        if(hm.containsKey(ele))
        {
            int val =hm.get(ele);
            hm.put(ele,val+1);
        }
        else 
        {
            hm.put(ele,1);
        }
    }
    
    // traversing array b and finding whether element of a is present or not and removing for not taking redundant values
    for(int element :b)
    {
        if(hm.containsKey(element))
        {
            System.out.println(element);
            hm.remove(element);
        }
    }
    
    
 }

}