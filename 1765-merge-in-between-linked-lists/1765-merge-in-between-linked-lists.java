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
         ListNode dummy = new ListNode(0);
        dummy.next = list1;
        ListNode prevA = dummy;

         for (int i = 0; i < a; i++) {
            prevA = prevA.next;
        }

         ListNode afterB = prevA;
        for (int i = a; i <= b; i++) {
            afterB = afterB.next;
        }
        afterB = afterB.next;

         prevA.next = list2;

        // Step 4: Go to end of list2
        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }
       tail.next = afterB;

        return dummy.next;
    }
}