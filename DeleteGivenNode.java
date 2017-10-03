/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       // ListNode Node = new ListNode();
        ListNode temp = node;
        if(temp.next != null)
        {
            node.val = temp.next.val;
            node.next = temp.next.next;
        }
        else
        {
            node = null;
        }
   
    }
}