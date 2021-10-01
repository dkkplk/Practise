
public class LinkedList1 {

	Node head;

	void addInList(LinkedList1 list) {
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
	}

	int findMiddle(Node head) {
		// TODO Auto-generated method stub
		Node p1 = head;
		Node p2 = head;

		while (p2.next != null && p2.next.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;

		}
		return p1.data;
	}

}

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}