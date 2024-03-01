package LL1;

public class MergeSortLL {
/*
import java.util.*;

class Solution {
    public static Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node mid = getMiddle(head);
        Node ahead = mid.next;
        mid.next = null;
        Node fp = mergesort(head);
        Node sp = mergesort(ahead);
        head = merge(fp,sp);
        return head;
    }
    private static Node merge (Node f, Node s){
        if(f==null){
            return s;
        }else if(s==null){
            return f;
        }else if(f.data<s.data){
            f.next = merge(f.next,s);
            return f;
        }else{
            s.next = merge(f,s.next);
            return s;
        }
    }
    private static Node getMiddle(Node node){
        if(node==null){
            return null;
        }
        Node slow = node;
        Node fast = node;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}


class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}

*/
}
