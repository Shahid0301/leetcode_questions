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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1,temp2=l2;
         ListNode prev=null;
        int carry=0;
        while(temp1!=null && temp2!=null){
            int sum=temp1.val+temp2.val;
            sum=(sum+carry);
            if(sum>=10){
                
              temp1.val=sum%10;
                carry=1;
            }
            else{
                temp1.val=sum%10;
                carry=0;
            }
        
            prev=temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
       
        if(temp1!=null && temp2==null){
            while(temp1!=null){
                int sum=temp1.val+carry;
                if(sum>=10){
                temp1.val=sum%10;
                    carry=1;
                }
                else{
                    temp1.val=sum;
                    carry=0;
                }
                 if(temp1.next==null){
                    prev=temp1;
                }
                temp1=temp1.next;
               
            }
                }
        else{
            while(temp2!=null){
                int sum=temp2.val+carry;
                if(sum>=10){
                    ListNode newNode=new ListNode(sum%10);
                    prev.next=newNode;
                    prev=newNode;
                    carry=1;
                }
                else{
                    ListNode newNode=new ListNode(sum);
                    prev.next=newNode;
                    prev=newNode;
                    carry=0;
                }
                temp2=temp2.next;
                }
        }
        if(carry==1){
            ListNode value=new ListNode(carry);
            prev.next=value;
            }
        return l1;
    }
}