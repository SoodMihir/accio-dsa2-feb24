package LL1;

public class FlattenLL {
/*
import java.util.*;

// Java program for flattening a Linked List
public class Main {

  // Linked list Node
  static class Node {

    int data;
    Node right, down;

    Node(int data) {
      this.data = data;
      right = null;
      down = null;
    }
  }

  static Node flatten(Node root) {
      if(root==null){
          return null;
      }
    root.right = flatten(root.right); // SP assuming that recursion works
    root = merge(root, root.right);
    return root;
  }
    static Node merge(Node curr, Node right){
        if(curr==null){
            return right;
        }else if(right==null){
            return curr;
        } else if(curr.data<right.data){
            // choose curr
            curr.down = merge(curr.down, right);
            curr.right = null;
            return curr;
        }else{
            // choose right
            right.down = merge(curr,right.down);
            right.right = null;
            return right;
        }
    }

static void printList(Node head) {
    Node n = head;
    while(n!=null){
        System.out.print(n.data+" ");
        n = n.down;
    }
    System.out.println();
  }

  public static boolean isCorrect(Node claim) {
    if (claim.right != null) return false;
    Node copy = claim;
    while (copy.down != null) {
      if (copy.down.data < copy.data) return false;
      copy = copy.down;
    }
    return true;
  }

  // Driver's code
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node ll = new Node(-1), prev1 = null, head = ll;
    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
      Node prev2 = null, copy = ll;
      while (k-- != 0) {
        int val = sc.nextInt();
        copy.data = val;
        copy.down = new Node(-1);
        prev2 = copy;
        copy = copy.down;
      }
      prev2.down = null;
      ll.right = new Node(-1);
      prev1 = ll;
      ll = ll.right;
    }
    sc.close();
    prev1.right = null;
    Node flattenedNode = flatten(head);
    printList(flattenedNode);
    if (isCorrect(flattenedNode)) System.out.println(
      "yes"
    ); else System.out.println("no");
  }
}
*/
}
