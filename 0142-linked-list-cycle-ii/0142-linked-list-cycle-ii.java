/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
     
            slow=slow.next;
            fast=fast.next.next;
                   if(slow==fast){
                return node(slow,head);
            }
        }
        return null;
    }
    public ListNode node(ListNode curr,ListNode head){
        while(curr!=head){
            head=head.next;
            curr=curr.next;
        }
        return head;
    }
}