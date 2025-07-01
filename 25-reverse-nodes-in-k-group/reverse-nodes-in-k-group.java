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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        if(count<k){
            return head;
        }
        count=k;
        cur=head;
        ListNode prev=head;
        ListNode prev1=null;
        while(count>0){
            ListNode temp=cur.next;
            cur.next=prev1;
            prev1=cur;
            cur=temp;
            count--;
        }
        prev.next=reverseKGroup(cur,k);
        return prev1;
    }
}