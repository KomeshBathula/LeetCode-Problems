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
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode temp = head, kthNodeFromBeg = null;
        while (temp != null) {
            length++;
            if (length == k) kthNodeFromBeg = temp;
            temp = temp.next;
        }
        // System.out.print(length);
        temp = head;
        ListNode kthNodeFromEnd = null;
        for (int i = 1; i <= length - k; i++) {
            temp = temp.next;
        }
        kthNodeFromEnd = temp;
        // swap
        int t = kthNodeFromBeg.val;
        kthNodeFromBeg.val = kthNodeFromEnd.val;
        kthNodeFromEnd.val = t;
        return head;
    }
}