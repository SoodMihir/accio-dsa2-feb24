package LL1;

public class UnfoldLL {
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
     // Your code here
        Node dummyhead1 = new Node(-1);
        Node node1 = dummyhead1;
        
        Node dummyhead2 = new Node(-2);
        Node node2 = dummyhead2;

        while(head!=null){
            node1.next = head;
            node1 = node1.next;
            head = head.next;

            if(head!=null){
                node2.next = head;
                node2 = node2.next;
                head = head.next;
            }
        }
        Node reversedLL = reverse(dummyhead2.next);
        node1.next = reversedLL;
        
        print(dummyhead1.next);
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
 * */
}
