/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new  ListNode(0);
        ListNode finalList = result;
        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                result.next = l1;
                l1= l1.next;
                
            }
            else if(l1.val > l2.val)
            {
                result.next = l2;
                l2=l2.next;
               
            }
             result = result.next;
        }
        
        if(l1 != null)
        {
            result.next = l1;
        }
        
        if(l2 != null)
        {
            result.next = l2;
        }
        return finalList.next;    
    }
}