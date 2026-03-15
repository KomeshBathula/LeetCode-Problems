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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2tail = list2;
        //tail of list2 is found
        while (list2tail.next != null) list2tail = list2tail.next;
        // System.out.println(list2tail.val);
        int count = 0;
        ListNode list1temp = list1;
        ListNode mergePoint1 = null;
        ListNode mergePoint2 = null;
        while (list1temp != null) {
            count++;
            if (a == count) mergePoint1 = list1temp; // save 1st point
            if (b + 1 == count) mergePoint2 = list1temp.next; // save 2nd point
            list1temp = list1temp.next;
        }
        // System.out.println(mergePoint1.val);
        // System.out.println(mergePoint2.val);
        
        mergePoint1.next = list2;
        list2tail.next = mergePoint2;
        // System.out.println(mergePoint1.next.val);
        // System.out.println(list2tail.next.val);
        // ListNode temp = list1;
        // while (temp != null) {
        //     System.out.println(temp.val);
        //     temp = temp.next;
        // }
        return list1;
    }
}