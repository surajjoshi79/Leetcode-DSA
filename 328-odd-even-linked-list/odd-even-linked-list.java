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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode oddHead=new ListNode();
        ListNode evenHead=new ListNode();
        ListNode oddCur=oddHead;
        ListNode evenCur=evenHead;
        int i=1;
        while(head!=null){
            if(i%2!=0){
                oddCur.next=head;
                oddCur=head;
            }else{
                evenCur.next=head;
                evenCur=head;
            }
            i++;
            head=head.next;
        }
        evenCur.next=null;
        oddCur.next=evenHead.next;
        return oddHead.next;
    }
}