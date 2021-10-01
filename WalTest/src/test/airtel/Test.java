package test.airtel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList list1 = new MyLinkedList();
		list1.head = new Node(3);
		list1.head.next = new Node(6);
		list1.head.next.next = new Node(9);
		Node n1 = new Node(15);
		list1.head.next.next.next = n1;
		list1.head.next.next.next.next = new Node(30);

		MyLinkedList list2 = new MyLinkedList();
		list2.head = new Node(10);
		list2.head.next = n1;

		Node output = findIntersectionPoint(list1, list2);

		System.out.println(output);
	}

	private static Node findIntersectionPoint(MyLinkedList list1, MyLinkedList list2) {

		Node list1Head = list1.head;
		Node list2Head = list2.head;
		Node p1, p2;
		p1 = list1Head;
		p2 = list2Head;
		Node output = null;

		int diff = 2;

		for (int i = 0; i < diff; i++) {
			p1 = p1.next;
		}

		while (p1 != null || p2 != null) {

			if (p1 == p2) {
				output = p1;
				break;
			}

			p1 = p1.next;
			p2 = p2.next;
		}

		return output;
	}

}
