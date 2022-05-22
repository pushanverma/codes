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
        int ans =firstIndex(arr,0,x);
        System.out.println(ans);
    }

    public static int firstIndex(int[] arr, int idx, int x)
    {
        if(idx==arr.length)   //you have travveled all array and found nothing 
        {
            return -1;
        }
        
        if(arr[idx]==x)
        {
            return idx;
        }
        else
        {
            int recans =firstIndex(arr,idx+1,x);
            return recans;
        }
        
    }

}