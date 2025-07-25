class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int res=nums[0];
        int curMax=nums[0];
        int curMin=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=Math.max(nums[i],Math.max(curMax*nums[i],curMin*nums[i]));
            curMin=Math.min(nums[i],Math.min(curMax*nums[i],curMin*nums[i]));
            curMax=temp;
            res=Math.max(curMax,res);
        }
        return res;
    }
}