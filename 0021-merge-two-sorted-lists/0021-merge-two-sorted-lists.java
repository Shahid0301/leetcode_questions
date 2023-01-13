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
        if(list1.val<=list2.val){
            sort=list1;
            list1=list1.next;
            
        }
        else{
            sort=list2;
            list2=list2.next;
        }
        ListNode dummy=sort;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ListNode temp=list1.next;
                list1.next=null;
                dummy.next=list1;
                dummy=dummy.next;
                list1=temp;
            }
            else{
                ListNode temp=list2.next;
                list2.next=null;
                dummy.next=list2;
                dummy=dummy.next;
                list2=temp;
            }
        }
       if(list1==null){
           dummy.next=list2;
       }
        if(list2==null){
            dummy.next=list1;
        }
        return sort;
    }
}