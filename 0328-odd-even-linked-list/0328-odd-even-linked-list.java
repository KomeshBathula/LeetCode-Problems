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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
		ArrayList<Integer> oddNodes = new ArrayList<>();
		ArrayList<Integer> evenNodes = new ArrayList<>();
		ListNode temp = head;
		int position = 1;
		while (temp != null) {
			if (position % 2 == 0) evenNodes.add(temp.val);
			else oddNodes.add(temp.val);
			temp = temp.next;
			position++;
		}
		temp = head;
		for (int value : oddNodes) {
			temp.val = value;
			temp = temp.next;
		}
		for (int value : evenNodes) {
			temp.val = value;
			temp = temp.next;
		}
		return head;
    }
}