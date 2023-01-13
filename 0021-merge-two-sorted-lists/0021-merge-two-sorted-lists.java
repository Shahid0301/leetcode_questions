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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode sort=new ListNode(0);
        ListNode l1=list1,l2=list2;
        if(l1.val<=l2.val){
            sort=l1;
            l1=l1.next;
            
        }
        else{
            sort=l2;
            l2=l2.next;
        }
        ListNode dummy=sort;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                ListNode temp=l1.next;
                l1.next=null;
                dummy.next=l1;
                dummy=dummy.next;
                l1=temp;
            }
            else{
                ListNode temp=l2.next;
                l2.next=null;
                dummy.next=l2;
                dummy=dummy.next;
                l2=temp;
            }
        }
       if(l1==null){
           dummy.next=l2;
       }
        if(l2==null){
            dummy.next=l1;
        }
        return sort;
    }
}