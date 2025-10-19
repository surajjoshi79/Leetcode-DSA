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
    public int[] nextLargerNodes(ListNode head) {
        int size=0;
        ListNode cur=head;
        List<Integer> list=new ArrayList<>();
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
            size++;
        }
        int[] ans=new int[size];
        Stack<Integer> stack=new Stack<>();
        cur=head;
        for(int i=0;i<list.size();i++){
            while(!stack.isEmpty() && list.get(stack.peek())<list.get(i)){
                int top=stack.pop();
                ans[top]=list.get(i);
            }
            stack.push(i);
        }
        return ans;
    }
}