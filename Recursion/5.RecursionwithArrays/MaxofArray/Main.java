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
        int ans =maxOfArray(arr,0);
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        
        int recans=maxOfArray(arr,idx+1);   //rec call
        
        int me=arr[idx];
        if(me>recans)
        {
            return me;
        }
        return recans;
    }

}