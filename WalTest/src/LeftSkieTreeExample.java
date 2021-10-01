
public class LeftSkieTreeExample {

	static Node root;

	public static void main(String[] args) {

		root = new Node(11);
		root.left = new Node(12);
		root.right = new Node(52);
		root.left.left = new Node(23);
		root.left.right = new Node(4);
		root.right.right = new Node(62);

		/*
		 * /// 11 / \ 12 52 / \ \ 23 4 62 \ 6
		 * 
		 * 
		 */

		//
		root = getRightSkieTree(root);

		printTree(root);
	}

	private static void printTree(Node root) {

		System.out.println();
	}

	private static Node getRightSkieTree(Node root) {

		if (root == null) {
			return null;
		}

		while (root.left != null) {

			root.left.right = root.right;
			root.right = root.left;
		}

		return root;
	}

}
