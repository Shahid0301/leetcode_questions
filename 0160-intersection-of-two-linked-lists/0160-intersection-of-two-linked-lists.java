/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<Integer,ListNode> map=new HashMap<>();
        int i=0;
        ListNode temp=headA;
        while(temp!=null){
            map.put(i,temp);
            i++;
            temp=temp.next;
        }
        while(headB!=null){
            if(map.containsValue(headB)){
            return headB;    
            }
            headB=headB.next;
        }
        return null;
    }
}