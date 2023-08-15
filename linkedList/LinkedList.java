package linkedList;


public class LinkedList {
	Node head = null;
	Node tail = null;

	public void add(int n) {
		Node node = new Node(n);
		if (head == null) {
			head = node;
			tail=node;
		} else {
			
			tail.next = node;
			tail=tail.next;
		}

	}

	public void iterate() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
    public void iterateByRecursion(Node head) {
    	Node temp=head;
    	if(temp!=null) {
    		
    		iterateByRecursion(temp.next);
    		System.out.print(temp.data);
    		
    	}
    }
	public void addAtPosition(int position, int data) {
		Node temp;
		Node node = new Node(data);
		Node prevNode = null;
		int c = 1;
		if (head == null) {
			head = node;

		} else {
			temp = head;
			while (temp != null) {

				if (position == 0) {
					node.next = temp;
					head = node;
					break;
				} else if (position == c && temp.next != null) {
					prevNode = temp;
					node.next = temp.next;
					temp.next = node;
					break;

				} else {
					prevNode = temp;
					temp = temp.next;
					c++;
				}
			}
			if (position > c) {
				throw new IndexOutOfBoundsException();
			} else {
				prevNode.next = node;
			}

		}
	}

	int size() {

		Node temp = head;
		int count = 1;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	int sizeByRecursion(Node head) {

		Node temp = head;
		
	if(temp!=null) {
	  
		int c= sizeByRecursion(temp.next)+1;
		 System.out.println(c);
		 return c;
	}
	return 0;
	}

	void delete(int index) {
		int count = 0;
		Node temp;
		if(index==0) {
			head=head.next;
		}
		else {
			temp=head;
			while(temp!=null) {
				if(index==count+1) {
					Node nextNode=temp;
					if(temp.next!=null && temp.next.next!=null) {
					nextNode.next=temp.next.next;
					break;}
					else {
						nextNode.next=null;
					}
				}else {
				temp=temp.next;
				count++;}
			}
		}
	}
	Node first=null;
	public void slidingPointer() {// reverse link list
	   Node p=head;
	   Node r=null;
	   Node q=null;
	   while(p!=null) {
		   r=q;
		   q=p;
		   p=p.next;
		   q.next=r;
	   }
	   first=q;
	   while(first!=null) {
		   System.out.println(first.data);
		   first=first.next;
	   }
		
	}
public int midElement() {
	Node fP = head;
	Node sP = fP;
	while(sP!=null && sP.next!=null) {
		fP=fP.next;
		
		sP=sP.next.next;
		
		
	}
	return fP.data;
}
public Node removeNthFromEnd( int n) {
	 Node temp=head;
	 int count=0;
	 int n1=0;
	 while(temp!=null) {
		 temp=temp.next;
		 count++;
	 }
	 temp=head;
	 count=count-n;
	 while(temp!=null) {
		 if(count==0) {
			 head=head.next;
			 return head;
		 }
		 if(n1+1==count ) {
			 if(temp.next!=null) {
				 temp.next=temp.next.next;
			 }else
			temp.next=null;
		 }else {
			 temp=temp.next;
		 }
		n1++;
	 }
	 
	return head;
       
   }

}
