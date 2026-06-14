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
    private ListNode reverseList(ListNode head) {
        ListNode temp = head, prev = null;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverseHead = reverseList(slow.next);

        int max = (int)(-1e9);

        ListNode temp1 = head, temp2 = reverseHead;

        while (temp2 != null) {
            max = Math.max(max, temp1.val + temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return max;
    }
}