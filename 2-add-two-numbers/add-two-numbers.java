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
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode newHead=new ListNode((cur1.val+cur2.val)%10);
        int carry=(cur1.val+cur2.val)/10;
        cur1=cur1.next;
        cur2=cur2.next;
        ListNode newCur=newHead;
        while(cur1!=null && cur2!=null){
            ListNode newNode=new ListNode((cur1.val+cur2.val+carry)%10);
            carry=(cur1.val+cur2.val+carry)/10;
            newCur.next=newNode;
            newCur=newNode;
            cur1=cur1.next;
            cur2=cur2.next;
            
        }
        while(cur1!=null){
            ListNode newNode=new ListNode((cur1.val+carry)%10);
            carry=(cur1.val+carry)/10;
            newCur.next=newNode;
            newCur=newNode;
            cur1=cur1.next;
        }
        while(cur2!=null){
            ListNode newNode=new ListNode((cur2.val+carry)%10);
            carry=(cur2.val+carry)/10;
            newCur.next=newNode;
            newCur=newNode;
            cur2=cur2.next;
        }
        if(carry==1){
            ListNode newNode=new ListNode(1);
            newCur.next=newNode;
            newCur=newNode;
        }
        return newHead;
    }
}