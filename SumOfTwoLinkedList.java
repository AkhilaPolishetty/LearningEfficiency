/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode(0);
        ListNode curr;
        curr = ans;
        int carry =0;
        while(l1 != null && l2 != null)
        {
            int sum = carry + l1.val+l2.val;
            carry = sum / 10;
            curr.next = new ListNode(sum %10);
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null)
        {
            int val = l1.val+carry;
            carry = val/10;
            curr.next = new ListNode(val % 10);
            curr = curr.next;
            l1 = l1.next;
        }
        while(l2 != null)
        {
            int val2 = l2.val+carry;
            carry = val2/10;
            curr.next = new ListNode(val2 % 10);
            curr = curr.next;
            l2 = l2.next;
        }
        if(carry >0)
        {
            curr.next = new ListNode(carry);
        }        
        return ans.next;
        
    }
}