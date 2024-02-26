package LL1;

public class MergeCode {
/*
	import java.io.*;
	import java.util.*;
	 
	class Node{
	    int data;
	    Node next;
	    Node(int data){
	        this.data = data;
	        next = null;
	    }
	}
	class LinkedList{
	    Node head;
	    void add(int data ){
	        Node new_node = new Node(data);
	        if(head == null){
	            head = new_node;
	            return;
	        }
	        Node current = head;
	        while(current.next !=null){
	            current = current.next;
	        }
	        current.next = new_node;
	    }
	}

	class Solution {
	 static Node merge(Node h1, Node h2){
	     Node dummyHead = new Node(-1);
	     Node node = dummyHead;
	     while(h1!=null && h2!=null){
	         if(h1.data<=h2.data){
	             node.next=h1;
	             node = h1;
	             h1=h1.next;
	         } else {
	             node.next = h2;
	             node = h2;
	             h2=h2.next;
	         }
	     }
	     if(h1!=null){
	         node.next=h1;
	     }
	     if(h2!=null){
	         node.next=h2;
	     }
	     return dummyHead.next;
	 }
	}

	public class Main {
	    
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        LinkedList l1= new LinkedList();
	        for(int i=0;i<n;i++){
	            l1.add(sc.nextInt());
	        }
	        int m = sc.nextInt();
	        LinkedList l2 = new LinkedList();
	        for(int i=0;i<m;i++){
	            l2.add(sc.nextInt());
	        }

	        Solution Ob = new Solution();
	        Node head = Ob.merge(l1.head, l2.head);
	        while(head != null){
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	    }
	}
	*/
}
