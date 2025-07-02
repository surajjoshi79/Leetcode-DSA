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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode cur=head;
        ListNode ahead=head.next;
        while(ahead!=null){
            if(ahead.val==cur.val){
                cur.next=ahead.next;
                ahead=cur.next;
            }
            else{
                cur=ahead;
                ahead=ahead.next;
            }
        }
        return head;
    }
}