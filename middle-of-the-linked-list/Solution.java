// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;

		while (true) {
			if (fast.next == null) {
				return slow;
			} else if (fast.next.next == null) {
				return slow.next;
			}

			fast = fast.next.next;
			slow = slow.next;
		}
	}
}
