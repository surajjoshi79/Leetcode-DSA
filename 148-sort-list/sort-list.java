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
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        return merge(mergeSort(cur),mergeSort(mid));
    }
    ListNode merge(ListNode list1,ListNode list2){
        if(list1==null && list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode mergeHead=null;
        ListNode cur1=list1;
        ListNode cur2=list2;
        if(list1.val<list2.val){
            mergeHead=list1;
            cur1=cur1.next;
        }
        else{
            mergeHead=list2;
            cur2=cur2.next;
        }
        ListNode mergeCur=mergeHead;
        while(cur1!=null && cur2!=null){
            if(cur1.val<cur2.val){
                mergeCur.next=cur1;
                mergeCur=cur1;
                cur1=cur1.next;
            }
            else{
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