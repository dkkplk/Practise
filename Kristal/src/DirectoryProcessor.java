import java.util.ArrayList;
import java.util.List;

public class DirectoryProcessor {

	public static void main(String[] args) {

		// input list creation
		List<Folder> folderList = new ArrayList<>();

		Folder f0 = new Folder(0, "Dummy", 0, 0);
		Folder f1 = new Folder(1, "Inbox", null, 1);
		Folder f2 = new Folder(2, "Inbox1", 1, 1);
		Folder f3 = new Folder(3, "Inbox11", 2, 1);
		Folder f4 = new Folder(4, "Inbox12", 2, 2);
		Folder f5 = new Folder(5, "Inbox2", 1, 2);
		Folder f6 = new Folder(6, "Inbox21", 5, 1);
		Folder f7 = new Folder(7, "Inbox3", 1, 3);
		Folder f8 = new Folder(8, "Outbox", null, 2);
		Folder f9 = new Folder(9, "Sent", null, 3);
		Folder f10 = new Folder(10, "Myfolder", null, 4);
		Folder f11 = new Folder(11, "Myfolder2", 10, 1);
		Folder f12 = new Folder(12, "Myfolder1", 10, 2);
		Folder f13 = new Folder(13, "Myfolder111", 12, 1);
		Folder f14 = new Folder(14, "Myfolder3", 10, 3);

		folderList.add(f1);
		folderList.add(f2);
		folderList.add(f3);
		folderList.add(f4);
		folderList.add(f5);
		folderList.add(f6);
		folderList.add(f7);
		folderList.add(f8);
		folderList.add(f9);
		folderList.add(f10);
		folderList.add(f11);
		folderList.add(f12);
		folderList.add(f13);
		folderList.add(f14);

		// insertion in tree
		

		TreeNode<Folder> root = new TreeNode<Folder>(f0);
		for (Folder folder : folderList) {

			if (folder.getParentid() == null) {
				root.addChild(folder);
			} 
			else
			{
				
			}
		}

		

		TreeNode<Folder> treeRoot = root;
		for (TreeNode<Folder> node : treeRoot) {
			System.out.println(node.data.getName());
		}

	}

}
