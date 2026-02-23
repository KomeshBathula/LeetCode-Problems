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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, upcoming = head;
        while (upcoming != null) {
            upcoming = curr.next;
            curr.next = prev;
            prev = curr;
            curr = upcoming;
        }
        return prev;
    }
}