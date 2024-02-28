package LL1;

public class AddNum {
/*

import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(input.nextInt());
        }
        LinkedList ans = new LinkedList();
        Solution A = new Solution();
        ans.head = A.addTwoLinkedLists(a.head, b.head);
        ans.printList();

    }
}


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
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}


class Solution
{

    public static Node addTwoLinkedLists(Node head1, Node head2)
    {
        Node n1 = reverse(head1);
        Node n2 = reverse(head2);

        Node dummyHead = new Node(-1);
        Node node = dummyHead;

        int carry=0;
        
        while(n1!=null || n2!=null){
            int sum = carry;
            if(n1!=null){
                sum+=n1.data;
                n1=n1.next;
            }
            if(n2!=null){
                sum+=n2.data;
                n2=n2.next;
            }
            int digit = sum%10;
            carry = sum/10;
            Node next = new Node(digit);
            node.next = next;
            node = next;
        }

        if(carry==1){
            Node next = new Node(carry);
            node.next = next;
            node = next;
        }
        Node ans = reverse(dummyHead.next);
        return ans;
        
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
    
}
 */
}
