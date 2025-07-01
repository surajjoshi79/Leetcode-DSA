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
        if(head==null){
            return head;
        }
        int length=size(head);
        k%=length;
        if(length==1 || length==k || k==0){
            return head;
        }
        head=reverse(head);
        ListNode cur=head;
        ListNode prev=null;
        while(k>0){
            prev=cur;
            cur=cur.next;
            k--;
        }
        prev.next=null;
        ListNode head1=reverse(head);
        ListNode head2=reverse(cur);
        return merge(head1,head2);
    }
    int size(ListNode head){
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur != null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    ListNode merge(ListNode head1,ListNode head2){
        ListNode cur=head1;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=head2;
        return head1;
    }
}