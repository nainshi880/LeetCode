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
    public ListNode sortList(ListNode head) {
       if(head == null || head.next == null){
        return head;
       } 

       ListNode mid = getMid(head);
       ListNode left = sortList(head);
       ListNode right = sortList(mid);
       return merge(left,right);
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
    ListNode fast = head.next;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    ListNode mid = slow.next;
    slow.next = null;

    return mid;
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);

        ListNode ans = dummy;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
       while(ptr1 != null && ptr2 != null){
        if(ptr1.val > ptr2.val){
            dummy.next = ptr2;
            ptr2 = ptr2.next;
            dummy = dummy.next;
        }else{
            dummy.next = ptr1;
            ptr1 = ptr1.next;
            dummy = dummy.next;
        }
       }
       if(ptr1 == null){
        dummy.next = ptr2;
       }else{
        dummy.next = ptr1;
       }
       return ans.next;
    }
}
