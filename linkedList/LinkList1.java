package linkedList;

public class LinkList1 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.removeNthFromEnd( 6);
		list.iterate();
		
//		/l.mergeToList(list, list2);
		//System.out.println(list.sizeByRecursion(list.head));
		//list.slidingPointer();
		/*
		 * list.iterate(); list.addAtPosition(2, 6); System.out.println();
		 * list.iterate(); System.out.println(); list.delete(2);
		 * System.out.println(list.size()); list.iterate();
		 */
		/*
		 * list.iterateByRecursion(list.head); System.out.println();
		 * System.out.println(list.sizeByRecursion(list.head, 0));
		 */
	}
	public void mergeToList(LinkedList l1,LinkedList l2) {
		Node last=null;
		Node first=l1.head;
		Node second=l2.head;
		Node third=null;
		if(first.data<second.data) {
			
			third=first;
			last=first;
			first=first.next;
		}else {
			third=second;
			last=second;
			second=second.next;
		}
		while(first!=null && second!=null) {
			if(first.data>second.data) {
				last.next=second;
				last=second;
				second=second.next;
				last.next=null;
				
			}else {
				last.next=first;
				last=first;
				first=first.next;
				last.next=null;
				
			}
		}
		last.next=(first==null && second!=null)?second : first;
		
		while(third!=null) {
			System.out.println(third.data);
			third=third.next;
		}
		
		
	}
}
