public class Main {
    
}
import java.io.*;
import java.util.*;

public class Main{

public static Scanner scn =new Scanner(System.in);

public static void main(String[] args) throws Exception 
{
    // write your code here
    
    
    //1st array 
    int n1=scn.nextInt();
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
    
    
    //entering elements of array a 
    for(int ele :a)
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
    
    
    // now traversing array b and checking that if the key's frequency in hashtable is more than 0
    
    
    for(int element :b)
    {
        if(hm.containsKey(element) && hm.get(element)>0)
        {
            int oldfreq =hm.get(element);
            int newfreq =oldfreq-1;
            hm.put(element,newfreq);
            System.out.println(element);
        }
    }
    
    
    
 }

}