import java.util.Collection;
import java.util.Collections;

public class MyLinkedList {

	static Node head;

	public static void main(String[] args) {

		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = head.next;
		
		Collections.sort(list, c);
		
		boolean output = isCirculer(head);
		System.out.println(output);

	}

	private static boolean isCirculer(Node head2) {

		boolean isCirculer = false;
		Node curr = head;
		Node slow = curr, fast = curr;

		while (slow != null) {

			slow = head.next;
			fast = head.next.next;

			if (slow == fast) {
				isCirculer = true;
				break;
			}
			
			
		}

		return isCirculer;
	}

}
