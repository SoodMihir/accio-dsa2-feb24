package LL1;

public class LinkedList {
	private class Node {
		int val;
		Node next;

		Node() {
			this.val = 0;
			this.next = null;
		}

		Node(int val) {
			this.val = val;
			this.next = null;
		}

		Node(int v, Node n) {
			this.val = v;
			this.next = n;
		}
	}

	private Node head;

	LinkedList() {
		this.head = null;
	}

	public void addLast(int val) {
		// Add an element at the last of the LL
		Node nn = new Node(val);
		if (head == null) {
			// we are adding the first node
			head = nn;
		} else {
			// some node is already present in the LL

			// Go to the last node
			Node lastNode = head;
			while (lastNode.next != null) {
				Node nextNode = lastNode.next;
				lastNode = nextNode;
			}
			// add new node after lastNode
			lastNode.next = nn;
		}
	}

	public void addFirst(int val) {
		Node nn = new Node(val);
		nn.next = head;
		head = nn;
	}

	public void print() {
		// print the entire LL
		Node node = head;
		while (node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
		System.out.println("END");
	}
	
	public void printReverse() {
		// prints in reverse Order
		printRev(head);
		System.out.println("START");
	}
	
	private void printRev(Node node) {
		if(node == null) {
			return;
		}
		printRev(node.next);
		System.out.print(node.val+"<-");
	}

	public int size() {
		// returns the size 
		int size=0;
		Node node = head;
		while(node!=null) {
			node = node.next;
			size++;
		}
		return size;
	}

	public int deleteNode(int valueToBeRemoved) {
		// remove the head node
		if (head == null) {
			// no elements present in the LL
			return -1;
		} else if (valueToBeRemoved == head.val) {
			return removeFirst();
		} else {
			Node node = head;
			while (node.next != null) {
				Node next = node.next;
				if (next.val == valueToBeRemoved) {
					node.next = next.next;
					
					return next.val;
				} else {
					node = node.next;
				}
			}
			// element was not found
			return -1;
		}
	}

	public int removeFirst() {
		// remove the head node
		if (head == null) {
			// no elements present in the LL
			return -1;
		} else {
			Node rn = head;
			head = rn.next;

			return rn.val;
		}
	}
	
	public int getMiddle() {
		if(this.size()==0) {
			return -1;
		}
		int mid = this.size()/2;
		int i=0;
		Node node = head;
		while(i<mid) {
			node = node.next;
			i++;
		}
		return node.val;
	}
	public void reverse() {
		head = reverse(head);
	}
	private Node reverse(Node head){
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
