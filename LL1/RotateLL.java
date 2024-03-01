package LL1;

public class RotateLL {
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
    
    static void rotateRight(Node head, int n) {
        int len = size(head);
        n = n%len;
        if(n==0){
            print(head);
        }
        head = reverse(head);
        Node node = head;
        int k = n-1;
        while(k!=0){
            node = node.next;
            k--;
        }
        Node ahead = node.next;
        node.next=null;
        ahead = reverse(ahead);
        Node res = reverse(head);
        head.next = ahead;
        
        print(res);
        
    }
    private static void print(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    private static Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node ahead = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    public static int size(Node node ) {
		int size=0;
		while(node!=null) {
			node = node.next;
			size++;
		}
		return size;
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
        int k = sc.nextInt();
        Ob.rotateRight(l1.head, k);
    }
}
*/
}
