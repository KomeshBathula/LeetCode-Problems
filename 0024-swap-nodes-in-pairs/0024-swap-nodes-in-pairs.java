/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
		ListNode first = head;
		while (first != null && first.next != null) {
			ListNode second = first.next;
			int temp = first.val;
			first.val = second.val;
			second.val = temp;
			first = second.next;
		}
		return head;
    }
}