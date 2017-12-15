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
       Stack<Integer> stack1 = new Stack<Integer>();
       Stack<Integer> stack2 = new Stack<Integer>();
       int carry =0, data =0;

        while(l1!= null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        
        while(l2!= null){
            stack2.push(l2.val);
            l2 = l2.next;
        }

       ListNode list = new ListNode(0);
        while(!stack1.empty() || !stack2.empty()){
            if(!stack1.empty()) data += stack1.pop();
            if(!stack2.empty()) data += stack2.pop();
            list.val = data%10;
            ListNode head = new ListNode(data/10);
            head.next = list;
            list = head;
            data = data/10;
        
        }
         
        return list.val ==0? list.next: list;
    }
        
       
}