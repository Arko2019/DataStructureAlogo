package linkedList;

public class DoublyLinkedMain {

	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(8);
		list.forwardIterate();
		list.reverse();

	}

}
