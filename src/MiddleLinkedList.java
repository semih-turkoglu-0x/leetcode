public class MiddleLinkedList {

	private class ListNode {

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

	//	public ListNode middleNode(ListNode head) {
//		int counter = 1;
//		ListNode tmp = head;
//		while (tmp.next != null) {
//			counter++;
//			tmp = tmp.next;
//		}
//
//		for (int i = 0; i < counter / 2; i++) {
//			head = head.next;
//		}
//		return head;
//	}
	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
}
