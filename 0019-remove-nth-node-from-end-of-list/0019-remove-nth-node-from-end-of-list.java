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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        if (head.next == null) return null;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (n == length) return head.next;
        int nthNode = length - n;
        ListNode curr = head;
        for (int i = 1; i < nthNode; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}