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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> criticalPoints=new ArrayList<>();
        int index=1,min=Integer.MAX_VALUE;
        ListNode cur=head.next;
        ListNode prev=head;
        int[] ans=new int[2];
        Arrays.fill(ans,-1);
        if(cur.next==null){
            return ans;
        }
        while(cur.next!=null){
            if((cur.val>prev.val && cur.val>cur.next.val) || (cur.val<prev.val && cur.val<cur.next.val)){
                criticalPoints.add(index);
            }
            prev=cur;
            cur=cur.next;
            index++;
        }
        if(criticalPoints.size()<2){
            return ans;
        }
        for(int i=0;i<criticalPoints.size()-1;i++){
            min=Math.min(min,criticalPoints.get(i+1)-criticalPoints.get(i));
        }
        ans[0]=min;
        ans[1]=criticalPoints.get(criticalPoints.size()-1)-criticalPoints.get(0);
        return ans;
    }
}