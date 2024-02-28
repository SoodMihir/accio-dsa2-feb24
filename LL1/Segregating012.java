package LL1;

public class Segregating012 {
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
	    static void unfold(Node head)
	    {
	        Node dh0 = new Node(0);
	        Node n0=dh0;
	        Node dh1 = new Node(-1);
	        Node n1=dh1;
	        Node dh2 = new Node(-2);
	        Node n2=dh2;
	        while(head!=null){
	            if(head.data==0){
	                n0.next=head;
	                n0=n0.next;
	            }else if(head.data==1){
	                n1.next=head;
	                n1=n1.next;
	            }else{
	                n2.next=head;
	                n2=n2.next;
	            }
	            head = head.next;
	        }
	        n0.next = dh1.next;
	        n1.next = dh2.next;
	        n2.next=null;
	        
	        print(dh0.next);
	    }
	    private static void print(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
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
	        Solution Ob = new Solution();
	        Ob.unfold(l1.head);
	    }
	}
	*/
}
