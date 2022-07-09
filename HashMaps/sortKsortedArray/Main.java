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

      int k = Integer.parseInt(br.readLine());
      // write your code here
      
      PriorityQueue<Integer>pq =new PriorityQueue<>();
      
      //adding ele inside priority queue
      for(int i=0;i<=k;i++)
      {
          pq.add(arr[i]);
      }
      //traversing ele of array from k+1 
      for(int i=k+1;i<arr.length;i++)
      {
          System.out.println(pq.remove());
          pq.add(arr[i]);
      }
      //rest of the ele if they are left . then this will print them 
      while(pq.size()>0)
      {
          System.out.println(pq.remove());
      }
      
      
   }

}