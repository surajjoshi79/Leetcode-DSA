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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur=head;
        ListNode head1=new ListNode(Integer.MAX_VALUE);
        ListNode head2=new ListNode(Integer.MAX_VALUE);
        ListNode cur1=head1;
        ListNode cur2=head2;
        while(cur!=null){
            if(cur.val<x){
                cur1.next=cur;
                cur1=cur1.next;       
            }else{
                cur2.next=cur;
                cur2=cur2.next;          
            }
            cur=cur.next;
        }
        cur1.next=head2.next;
        cur2.next=null;
        return head1.next;
    }
}