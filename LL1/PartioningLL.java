package LL1;

public class PartioningLL {

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
    public void partition(Node head, int x) {
        Node dhs = new Node(-1);
        Node s = dhs;

        Node dhg = new Node(-1);
        Node g = dhg;

        while(head!=null){
            if(head.data<x){
                // add to the smaller list
                s.next = head;
                s = s.next;
            }else{
                // add to the greater list
                g.next = head;
                g = g.next;
            }
            head = head.next;
        }

        s.next = dhg.next;
        g.next = null;

        print(dhs.next);
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
        int x = sc.nextInt();
        Solution Ob = new Solution();
        Ob.partition(l1.head, x);
    }
}
	 * */
}
