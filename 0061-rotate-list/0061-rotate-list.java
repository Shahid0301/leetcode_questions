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
    public ListNode rotateRight(ListNode head, int k) {
        int length=1;
        ListNode curr=head;
        if(head==null){
            return head;
        }
        while(curr.next!=null){
            curr=curr.next;
            length++;
        }
        curr=head;
        k=k%length;
        while(k-->0){
            while(curr.next.next!=null){
                curr=curr.next;
            }
            
            ListNode secondL=curr.next;
            curr.next=null;
            secondL.next=head;
            head=secondL;
            
            curr=head;

        }
        return head;
        
    }
}