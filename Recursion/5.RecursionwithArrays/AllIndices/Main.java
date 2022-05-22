import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int csf) {
        // write ur code here
        if(idx==arr.length)
        {
            int []base=new int[csf];
            return base;
        }
        
        if(arr[idx]==x)
        {
            csf+=1;  //why not csf++ and csf+=1
        }
        int []recans =allIndices(arr,x,idx+1,csf);
        if(arr[idx]==x)
        {
            recans[csf-1]=idx;  //why not recans[csf]  and then csf-- 
           
        }
        return recans;
    }

}