import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyTree {

	static Node root;

	public static void main(String args[]) {

		MyTree tree = new MyTree();

		tree.root = new Node(100);

		tree.root.left = new Node(200);
		tree.root.right = new Node(300);

		tree.root.left.left = new Node(150);
		tree.root.left.right = new Node(250);
		tree.root.right.left = new Node(280);
		tree.root.right.right = new Node(400);

		List<List<Integer>> output = levelOrderTraversal(tree.root);

		for (List<Integer> l : output) {
			for (int i : l) {
				System.out.print(i + ",");
			}
			System.out.println();
		}

	}

	private static List<List<Integer>> levelOrderTraversal(Node root) {

		List<List<Integer>> output = new ArrayList<>();
		int levelNum = 0;

		if (root == null) {
			return output;
		}

		Queue<Node> level = new LinkedList<>();
		level.add(root);

		while (!level.isEmpty()) {
			int size = level.size();
			List<Integer> levelList = new ArrayList<Integer>();
			int nodeCount = 0;
			levelNum++;
			for (int i = 0; i < size; i++) {
				Node current = level.remove();
				levelList.add(current.data);
				nodeCount++;

				if (current.left != null) {
					level.add(current.left);

				}

				if (current.right != null) {
					level.add(current.right);
				}

			}
			levelList.add(levelNum);
			levelList.add(nodeCount);
			output.add(levelList);
		}

		return output;

	}
}
