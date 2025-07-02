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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right){
            return head;
        }
        int i=0;
        ListNode prev=null;
        ListNode cur=head;
        while(i<left-1){
            prev=cur;
            cur=cur.next;
            i++;
        }
        ListNode last=cur;
        while(i<right-1){
            last=last.next;
            i++;
        }
        ListNode temp=last.next;
        last.next=null;
        ListNode newHead=reverse(cur);
        if(prev!=null){
            prev.next=newHead;
        }else{
            head=newHead;
        }
        while(newHead.next!=null){
            newHead=newHead.next;
        }
        newHead.next=temp;
        return head;
    }
    ListNode reverse(ListNode head){
        if(head==null || head.next==null){
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