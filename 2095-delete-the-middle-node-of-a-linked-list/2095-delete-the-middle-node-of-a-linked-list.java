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
    public ListNode deleteMiddle(ListNode head) {
        ListNode sp = head, fp = head, prev = null;
        while (fp != null && fp.next != null) {
            fp = fp.next.next;
            prev = sp;
            sp = sp.next;
        }
        prev.next = sp.next;
        return head;
    }
}