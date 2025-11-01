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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        while(head!=null && set.contains(head.val)){
            head=head.next;
        }
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            if(set.contains(cur.val)){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}