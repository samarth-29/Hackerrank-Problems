import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LowestCommonAncestor {
	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
      	if(root == null) {
          return null;
        }
        if(v1>v2) {
          int temp = v1;
          v1=v2;
          v2=temp;
        }
      while(root.data<v1 || root.data>v2) {
        if(root.data<v1) {
          root = root.right;
          System.out.println(root.data +"less than v1");
        }
        else if(root.data>v2) {
          root = root.left;
          System.out.println(root.data+"  greater than v2");
        }
      }
      return root;
    }
    	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}