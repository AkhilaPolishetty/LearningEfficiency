/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode second = curr.next;
        while(curr != null && curr.next != null){
          ListNode temp = curr;
          curr = curr.next;
          temp.next = curr.next;
          curr.next = temp;
          curr = temp.next;
          if(curr != null && curr.next != null) temp.next = curr.next;
      }
        
       return second;
    }
}