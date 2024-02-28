package LL1;

public class Subtract {
/*
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Main{
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        Node first = new Node(val);
        Node tail = first;
        for(int i=0; i<n-1; i++)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        int m = sc.nextInt();
        val = sc.nextInt();
        Node second = new Node(val);
        tail = second;
        for(int i=0; i<m-1; i++)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        Solution g = new Solution();
        Node res = g.subtract(first, second);
        printList(res);
    }
}

class Solution{   
    static Node subtract(Node l1, Node l2)
    {
        l1 = removeZero(l1);
        l2 = removeZero(l2);

        int len1 = length(l1);
        int len2 = length(l2);

        if(len2>len1){
            // we need to do L2-L1 so swap
            Node temp = l1;
            l1 = l2;
            l2 = temp;
        } else if(len1 == len2){
            // Let's find the larger by comparing values
            Node t1 = l1;
            Node t2 = l2;
            while(t1!=null && t1.data==t2.data){
                t1 = t1.next;
                t2 = t2.next;
            }
            if(t1==null){
                // both were equal
                return new Node(0);
            } 

            if(t1.data>t2.data){
                // we can do L1 - L2 as L1>L2
                // no swap is required
            }else{
                // L2>L1 so swap to do L1 - L2
                Node temp = l1;
                l1 = l2;
                l2 = temp;
            }
        }

        // L1 - L2 and L1>L2
        l1 = reverse(l1);
        l2 = reverse(l2);

        Node dummyHead = new Node(-1);
        Node node = dummyHead;
        int takeover = 0; // will be -1 when we take 1 from next position
        
        while(l1!=null){
            int v1 = l1.data+takeover;
            l1 = l1.next;
            
            int v2 = 0;
            if(l2!=null){
                v2 = l2.data;
                l2 = l2.next;
            }
            
            int diff=0;
            // v1-v2
            if(v1>=v2){
                takeover = 0;
                diff = v1-v2;
            } else{
                // we need a takeover
                takeover = -1;
                diff = (10+v1) - v2;
            }

            Node next = new Node(diff);
            node.next = next;
            node = next;
        }
        
        Node ans = reverse(dummyHead.next);
        ans = removeZero(ans);
        return ans;
    }
    private static Node removeZero(Node head){
        // this will remove leading zeroes
        while(head!=null && head.data==0){
            head = head.next;
        }
        return head;
    }
    private static int length(Node head){
        int len = 0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
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
