package binarySearch;

public class BinarySearchMain {

	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		b.insert(15);
		b.insert(8);
		b.insert(9);
		b.insert(14);
		b.insert(4);
		b.insert(3);
		b.insert(2);
		System.out.println(b.search(b.root, 4));
		b.inOrder(b.root);

	}

}
