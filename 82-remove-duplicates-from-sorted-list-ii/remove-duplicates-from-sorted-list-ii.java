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
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            if(set.contains(cur.val)){
                list.remove(Integer.valueOf(cur.val));
            }
            else{
                list.add(cur.val);
                set.add(cur.val);
            }
            cur=cur.next;
        }
        if(list.size()==0){
            return null;
        }
        head.val=list.get(0);
        head.next=null;
        cur=head;
        int i=1;
        while(i<list.size()){
            ListNode newNode=new ListNode(list.get(i));
            cur.next=newNode;
            cur=newNode;
            i++;
        }
        return head;
    }
}