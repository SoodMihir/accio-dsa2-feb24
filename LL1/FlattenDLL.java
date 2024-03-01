package LL1;

public class FlattenDLL {
/*
import java.util.Scanner;

class Node {
    int val;
    Node prev;
    Node next;
    Node child;

    public Node(int value, Node prev, Node next, Node children) {
        this.val = value;
        this.prev = prev;
        this.next = next;
        this.child = children;
    }
}

class Solution {
    public static Node flatten(Node head) {
        Node curr = head;
        while(curr!=null){
            if(curr.child!=null){
                Node child = curr.child;
                Node ahead = curr.next;

                Node tail = child;
                while(tail.next!=null){
                    tail = tail.next;
                }

                // Connecting tail to ahead
                tail.next = ahead;
                if(ahead!=null){
                    ahead.prev = tail;
                }
                //Connect curr with child
                curr.next = child;
                child.prev=curr;
                curr.child = null;
            }
            curr = curr.next;
        }
        return head;
    }

   

}

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Node head = new Node(0, null, null, null); // extra node
        Node curr = head;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            Node temp = new Node(a, curr, null, null);
            curr.next = temp;
            curr = temp;
        }
        head = head.next;
        curr = head;

        int level = scanner.nextInt();
        while (level-- > 0) {
            int ind = scanner.nextInt();

            int numNodes = scanner.nextInt();

            while (ind-- > 0) {
                curr = curr.next;
            }

            int a = scanner.nextInt();
            curr.child = new Node(a, null, null, null);
            curr = curr.child;
            Node newHead = curr;
            numNodes--;

            while (numNodes-- > 0) {
                a = scanner.nextInt();
                Node temp = new Node(a, curr, null, null);
                curr.next = temp;
                curr = temp;
            }

            curr = newHead;
        }
        Solution Obj = new Solution();
        Node ans= Obj.flatten(head);

        while(ans!=null){
            System.out.print(ans.val + " ");
            ans=ans.next;
        }

    }
}
 */
}
