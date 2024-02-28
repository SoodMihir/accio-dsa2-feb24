package LL1;

public class MultiplyLists {
/*
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        Node head=null;
        Node phead=null;
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            if(head==null)
                head=new Node(n1);
            else
                addHead(head,n1);
        }
        int m=sc.nextInt();
        while(m-->0){
            int n1=sc.nextInt();
            if(phead==null)
                phead=new Node(n1);
            else{
                addHead(phead,n1);
            }
        }
		Solution g=new Solution();
        System.out.println(g.multiplyLists(head,phead));
	}
   
    public static void addHead(Node node,int a) {
          if (node == null)
            return;
		if(node.next==null)
			node.next=new Node(a);
		else
			addHead(node.next,a);
	}
}

class Solution{
   public int multiplyLists(Node l1, Node l2){
       long mod = 1000000007L;
       
       long n1 = 0L;
       Node t1 = l1;
       while(t1!=null){
           n1 = ((n1*10)%mod+t1.data)%mod;
           t1 = t1.next;
       }

       long n2 = 0L;
       Node t2 = l2;
       while(t2!=null){
           n2 = ((n2*10)%mod+t2.data)%mod;
           t2 = t2.next;
       }

       long res = (n1%mod * n2%mod)%mod;
       return (int)res;
   }
}
*/
}
