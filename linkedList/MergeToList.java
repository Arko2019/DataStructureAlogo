package linkedList;

public class MergeToList {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		LinkedList l2 = new LinkedList();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode temp = new ListNode(0);
		ListNode currentNode = temp;
		while (true) {
			if (l1 == null) {
				currentNode.next = l2;
				break;
			} else if (l2 == null) {
				currentNode.next = l1;
				break;
			}
			if (l1.val <= l2.val) {
				currentNode.next = l1;
				l1 = l1.next;
			} else {
				currentNode.next = l2;
				l2 = l2.next;
			}
			currentNode=currentNode.next;
		}
		return temp.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
