
public class MyLinkedList {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.head = new Node(10);
		myLinkedList.head.next = new Node(20);
		
		myLinkedList.add(30,2);

		printList(myLinkedList.head);
	}

	private void add(int i, int index) {
		
		
		
	}

	private static void printList(Node head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
	
	
	
	
	

}
