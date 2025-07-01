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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=size(head);
        if(size==1){
            return null;
        }
        if(size==n){
            head=head.next;
            return head;
        }
        int index=size-n;
        int count=0;
        ListNode prev=null;
        ListNode cur=head;
        while(count<index){
            prev=cur;
            cur=cur.next;
            count++;
        }
        prev.next=cur.next;
        return head;
    }
    int size(ListNode head){
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
}