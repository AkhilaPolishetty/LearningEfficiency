/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int count =0;
        ListNode[] result = new ListNode[k];
        ListNode temp = root;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        int width = count/k;
        int rem = count % k;
        for(int i=0; i<k; i++){
               ListNode res = new ListNode(0), parts = res; 
               for(int j=0; j< width+(i<rem?1:0); j++){
                    parts = parts.next = new ListNode(root.val);
                    if(root!=null) root = root.next;
                }
                result[i] = res.next;
            }
        
        return result;
    }
}