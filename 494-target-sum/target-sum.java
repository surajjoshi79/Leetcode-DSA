class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    int helper(int[] nums,int target,int sum,int index){
        if(index==nums.length && sum==target){
            return 1;
        }
        if(index==nums.length){
            return 0;
        }
        int add=helper(nums,target,sum+nums[index],index+1);
        int subs=helper(nums,target,sum-nums[index],index+1);
        return add+subs;
    }
}