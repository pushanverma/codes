




  import java.util.*;
  
  public class Main{
      
      public static boolean isPrime(int n)
      {
          boolean flag =true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag =false;
                break;
            }
            
        }
        return flag;
      }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       boolean flag =true;
       int t=scn.nextInt();
    //   taking input 
        for(int i =0;i<t;i++)
        {
            int n =scn.nextInt();
            boolean ans =isPrime(n);
            if(ans ==false)
            {
                System.out.println("not prime");
            }
            else 
            {
                System.out.println("prime");
            }
            
        }
   }
  }