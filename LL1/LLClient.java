package LL1;

public class LLClient {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addFirst(0);
		ll.print();
		System.out.println("-----------");
		System.out.println("The middle element is"+ll.getMiddle());
		ll.print();
		ll.deleteNode(4);
		ll.print();
		System.out.println("-----------");
		System.out.println("The middle element is"+ll.getMiddle());
		ll.printReverse();
		

	}

}
