package sample.linklist;

import sample.linklist.MyLinkList.Node;

public class MyLinkList {
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	static Node head;
	
	
	public static void main(String args[])
	{
		MyLinkList list = new MyLinkList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		
		printList(list.head);
		
		Node reveresedList = reverseList(list.head);
		
		System.out.println();
		printList(reveresedList);
		
		
	}


	private static Node reverseList(Node head2) {
		
		Node prev= null,next =null;
		Node curr = head2;
		
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head2 = prev;
		return head2;
		
	}


	private static void printList(Node head) {
		
		Node newHead = head;
		while(newHead != null)
		{
			System.out.print(newHead.data +"->");
			newHead = newHead.next;
		}
		
	}
	
	

}
