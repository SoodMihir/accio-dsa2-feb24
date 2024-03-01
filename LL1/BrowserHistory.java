package LL1;

public class BrowserHistory {
/*
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String homepage = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        BrowserHistory browserHistory = new BrowserHistory(homepage);
        for(int i = 0; i < n; i++) {
            String q = sc.nextLine();
            String[] query = q.split("\\s+");
            if(query[0].equals("visit")){
                browserHistory.visit(query[1]);
            } else if(query[0].equals("back")){
                String res = browserHistory.back(Integer.parseInt(query[1]));
                System.out.println(res);
            } else if(query[0].equals("forward")){
                String res = browserHistory.forward(Integer.parseInt(query[1]));
                System.out.println(res);
            }
        }
    }
}
class BrowserHistory {
    class Node{
        String web;
        int steps;
        Node next;
        Node prev;
        Node(String w){
            this.web = w;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;
    Node curr;
    public BrowserHistory(String homepage) {
        Node web = new Node(homepage);
        head=web;
        tail=web;
        curr=web;
    }
    public void visit(String url) {
        Node nn = new Node(url);
        curr.next = nn;
        nn.prev = curr;
        curr = nn;
    }
    public String back(int steps) {
        while(steps>0 && curr.prev!=null){
            curr = curr.prev;
            steps--;
        }
        return curr.web;
    }
    public String forward(int steps) {
        while(steps>0 && curr.next!=null){
            curr = curr.next;
            steps--;
        }
        return curr.web;
    }
}
*/
}
