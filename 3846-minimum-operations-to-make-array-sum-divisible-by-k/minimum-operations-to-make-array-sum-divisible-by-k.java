class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0,res=0;
        for(int num:nums){
            sum+=num;
        }
        while(sum%k!=0){
            sum--;
            res++;
        }
        return res;
    }
}