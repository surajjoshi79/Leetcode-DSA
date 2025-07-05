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
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode cur1=l1;
        ListNode cur2=l2;
        int carry=0;
        ListNode sumHead=new ListNode((cur1.val+cur2.val)%10);
        carry=(cur1.val+cur2.val)/10;
        cur1=cur1.next;
        cur2=cur2.next;
        ListNode sumCur=sumHead;
        while(cur1!=null && cur2!=null){
            ListNode sum=new ListNode((cur1.val+cur2.val+carry)%10);
            carry=(cur1.val+cur2.val+carry)/10;
            sumCur.next=sum;
            sumCur=sum;
            cur1=cur1.next;
            cur2=cur2.next;
        }
        while(cur1!=null){
            ListNode sum=new ListNode((cur1.val+carry)%10);
            carry=(cur1.val+carry)/10;
            sumCur.next=sum;
            sumCur=sum;
            cur1=cur1.next;
        }
        while(cur2!=null){
            ListNode sum=new ListNode((cur2.val+carry)%10);
            carry=(cur2.val+carry)/10;
            sumCur.next=sum;
            sumCur=sum;
            cur2=cur2.next;
        }
        if(carry==1){
            ListNode sum=new ListNode(carry);
            sumCur.next=sum;
            sumCur=sum;
        }
        return reverse(sumHead);
    }
    ListNode reverse(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}