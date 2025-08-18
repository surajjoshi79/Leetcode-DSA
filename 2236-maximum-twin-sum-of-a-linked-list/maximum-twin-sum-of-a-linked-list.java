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
    public int pairSum(ListNode head) {
        if(head.next.next==null){
            return head.val+head.next.val;
        }
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode prev1=null;
        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=prev1;
            prev1=slow;
            slow=temp;
        }
        ListNode cur1=head;
        ListNode cur2=prev1;
        int maxSum=0;
        while(cur1!=null && cur2!=null){
            maxSum=Math.max(maxSum,cur1.val+cur2.val);
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return maxSum;
    }
}