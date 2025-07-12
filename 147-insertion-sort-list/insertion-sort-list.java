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
    public ListNode insertionSortList(ListNode head) {
        if(head.next==null){
            return head;
        }
        int size=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            size++;
        }    
        int[] array=new int[size];
        int index=0;
        cur=head;
        while(cur!=null){
            array[index++]=cur.val;
            cur=cur.next;
        }
        for(int i=1;i<size;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && key<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        cur=head;
        index=0;
        while(cur!=null){
            cur.val=array[index++];
            cur=cur.next;
        }
        return head;
    }
}