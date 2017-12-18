/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode prev = null, fast = head, slow = head;
        //cutting the list into two halves
        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        //sorting each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1, l2);
        
    }
     
    public ListNode merge(ListNode l1, ListNode l2){
        
        ListNode res = new ListNode(0), temp = res;
        while(l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
          }

        //since it is merge sort and each list is divided into two halves, one list can
        //have at max one extra node than required.
            if(l1 != null){
                temp.next = l1;
            }

            if(l2 != null){
                temp.next = l2;
            }
        return res.next;
    }
        
}