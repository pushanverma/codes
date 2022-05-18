import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    int th = Math.max(lh, rh) + 1;
    return th;
  }
  public static int Height(Node node)
  {
      if(node==null)
      {
          return -1;
      }
      int leftHeight=Height(node.left);
      int rightHeight=Height(node.right);
      int myHeight =Math.max(leftHeight,rightHeight)+1;
      
      return myHeight;
  }

  public static int diameter1(Node node) 
  {
    if(node==null)
    {
        return 0;
    }
    int leftDia=diameter1(node.left); //left Diameter
    int rightDia=diameter1(node.right); //Right Diameter
    
    int leftHeight=Height(node.left);
    int rightHeight=Height(node.right);
    
    
    int acrossNode =leftHeight+rightHeight+2; //acroos Node 
    
    int myDia=Math.max(acrossNode,Math.max(leftDia,rightDia));
    
    return myDia;
    
  }
  
  
//📌 2nd Approach  using Pair class

public static class pairing
{
    int height;
    int diameter;
    
    pairing()
    {
        
    }
    pairing(int height, int diameter)
    {
        this.height=height;
        this.diameter=diameter;
    }
}

public static pairing diameter(Node node)
{
    if(node ==null)
    {
        return new pairing(-1,0);
    }
    pairing leftans=diameter(node.left);
    pairing rightans=diameter(node.right);
    
    pairing myPair=new pairing();
    
    myPair.height=Math.max(leftans.height,rightans.height);
    
    myPair.diameter=leftans.diameter+rightans.diameter+2;
    
    return myPair;
}

public static int diameter2(Node node) 
  {
      pairing ans =diameter(node);
      return ans.diameter;
  }



  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);

    int diameter = 0;
    // diameter = diameter1(root);
    diameter = diameter2(root);
    
    System.out.println(diameter);
  }

}