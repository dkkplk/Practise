

public class LinkListDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList1 list = new LinkedList1();
		list.addInList(list);
		int output = findMiddle(list.head);
		System.out.println(output);
	}

	

}
