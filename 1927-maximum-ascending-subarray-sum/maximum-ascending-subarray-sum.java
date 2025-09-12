class Solution {
    public int maxAscendingSum(int[] nums) {
        int currentSum=0;
        int maxSum=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]>nums[i-1]){
                currentSum=currentSum+nums[i];
            }else{
                currentSum=nums[i];
            }
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}