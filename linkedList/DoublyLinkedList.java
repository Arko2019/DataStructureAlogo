package linkedList;

public class DoublyLinkedList {

	Node head;
	Node tail;
	
	void add(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			tail=node;
		}else {node.prev=tail;
		tail.next=node;
		tail=tail.next;}
		
	}
	
	void forwardIterate() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	
	void reverse() {
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.prev;
		}
		
		System.out.println();
	}
	
}
