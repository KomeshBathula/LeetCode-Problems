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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        // System.out.println(length);
        k = k % length;
        //System.out.println(rotations);
        temp.next = head; // made a loop
        temp = head;
        k = length - k;
        // System.out.println(rotations);
        temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        // System.out.println(temp.val);
        // System.out.println(newHead.val);
        temp.next = null;
        return newHead;
    }
}