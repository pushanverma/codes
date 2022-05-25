import java.io.*;
import java.util.*;

public class Main {

public static Scanner scn =new Scanner(System.in);

  public static void main(String[] args) throws Exception 
  {
    
    String str=scn.next();
    ArrayList<String> ans =gss(str);
    System.out.println(ans);
  }

  public static ArrayList<String> gss(String str) 
  {
    if(str.length()==0)
    {
        ArrayList<String>base =new ArrayList<>();
        base.add("");
        return base;
    }
    char ch =str.charAt(0); // extract a 
    String ros=str.substring(1); // extract bc
    
    ArrayList<String>recans=gss(ros);  // bc ke subsequence
    
    ArrayList<String> myans=new ArrayList<>();
    

    for(String ele :recans)
    {
        myans.add(ele);
    }
    for(String ele :recans)
    {
        myans.add(ch+ele);
    }    
    return myans;
  }

}