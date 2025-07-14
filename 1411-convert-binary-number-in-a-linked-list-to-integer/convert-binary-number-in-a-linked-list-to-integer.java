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
    public int getDecimalValue(ListNode head) {
        StringBuilder binary=new StringBuilder();
        int n=0;
        while(head!=null){
            binary.append(String.valueOf(head.val));
            head=head.next;
            n++;
        }
        return decimal(binary.toString(),n-1);
    }
    public int decimal(String str,int n){
        int dec=0;
        for(int i=0;i<=n;i++){
            if(str.charAt(i)=='1'){
                dec=dec+(int)Math.pow(2,n-i);
            }
        }
        return dec;
    }
}