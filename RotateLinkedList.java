
/** Recursive solution stack overflow exception ***/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        ListNode last = head.next, lastButOne = head;
        while(last != null && last.next !=null){
            last = last.next;
            lastButOne = lastButOne.next;
            
        }
        if(k > 0)
        {
            last.next = head;
            lastButOne.next = null;
            head = last;
            if(k-1 != 0) head = rotateRight(head, k-1);
        } 
        return head;
    }
}

/****** iterative solution -TLE exception ****/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        ListNode last = head.next, lastButOne = head;
        while(k>0){
            while(last != null && last.next != null){
                last = last.next;
                lastButOne = lastButOne.next;
            }
            last.next = head;
            lastButOne.next = null;
            head = last;
            ListNode preserve = lastButOne, temp = head;
            while(temp.next != lastButOne){
                temp = temp.next;
            } 
            last = lastButOne;
            lastButOne = temp;
            k -= 1;
        }
        return head;
    }
}


/** solution with complexity- length of the linked list ***/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
   public ListNode rotateRight(ListNode head, int n) {
    if (head==null||head.next==null) return head;
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode fast=dummy,slow=dummy;

    int i;
    for (i=0;fast.next!=null;i++)//Get the total length 
        fast=fast.next;
    
    for (int j=i-n%i;j>0;j--) //Get the i-n%i th node
        slow=slow.next;
    
    fast.next=dummy.next; //Do the rotation
    dummy.next=slow.next;
    slow.next=null;
    
    return dummy.next;
}
}