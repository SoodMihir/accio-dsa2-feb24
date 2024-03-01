package LL1;


import java.util.*;
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class QuickSort {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }

        Solution abc=new Solution();
        Node node = abc.quickSort(head);

        printList(node);
        System.out.println();
    
        sc.close();
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}

class Solution {
    
    public static Node quickSort(Node node)
    {
        if(node == null || node.next == null){
            return node;
        }
        Node end = node;
        while(end.next!=null){
            end=end.next;
        }
        partionAndSort(node,end);
        return node;
    }
    private static void partionAndSort(Node start, Node end){
        if(start==null || end==null || start==end.next){
            return;
        }
        Node prev = start;
        Node curr = start.next;
        Node prevPrev = null;

        int pivot = start.data;

        while(curr!=end.next){
            if(curr.data<pivot){
                // swap the data into prev.next
                int temp = prev.next.data;
                prev.next.data = curr.data;
                curr.data = temp;
                
                prevPrev = prev;
                prev = prev.next;
            }
            curr = curr.next;
        }
        int temp = start.data;
        start.data = prev.data;
        prev.data = temp;
        partionAndSort(start,prevPrev);
        partionAndSort(prev.next,end);
    }

}
