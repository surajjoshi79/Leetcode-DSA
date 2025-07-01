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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        ListNode mergeHead=lists[0];
        for(int i=1;i<lists.length;i++){
            mergeHead=merge(mergeHead,lists[i]);
        }
        return mergeHead;
    }
    ListNode merge(ListNode head1,ListNode head2){
        if(head1==null && head2==null){
            return null;
        }
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ListNode mergeHead;
        ListNode cur1=head1;
        ListNode cur2=head2;
        if(head1.val<head2.val){
            mergeHead=head1;
            cur1=cur1.next;
        }else{
            mergeHead=head2;
            cur2=cur2.next;
        }
        ListNode mergeCur=mergeHead;
        while(cur1!=null && cur2!=null){
            if(cur1.val<cur2.val){
                mergeCur.next=cur1;
                mergeCur=cur1;
                cur1=cur1.next;
            }else{
                mergeCur.next=cur2;
                mergeCur=cur2;
                cur2=cur2.next;
            }
        }
        while(cur1!=null){
            mergeCur.next=cur1;
            mergeCur=cur1;
            cur1=cur1.next;
        }
        while(cur2!=null){
            mergeCur.next=cur2;
            mergeCur=cur2;
            cur2=cur2.next;  
        }
        return mergeHead;
    }
}