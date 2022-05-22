import java.io.*;
import java.util.*;

public class Main {

public static Scanner scn =new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // write your code here
        int n =scn.nextInt();
        int []arr =new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        int ans =lastIndex(arr,0,x);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x)
    {
        
        if(idx==arr.length)
        {
            return -1;
        }
        int recans=lastIndex(arr,idx+1,x);
        
        if(recans ==-1) //arr kilength pe -1 mila tha 
        {
            if(arr[idx]==x) // agar mil gya idx par to ye return ho jayega
            {
                return idx;
            }
            else // nahi mila to recans hi mil jayega 
            {
                return recans;
            }
        }
        
        else   // agr recans -1 nahi hai to yaha par aana 
        {
            return recans;
        }
        
    }

}