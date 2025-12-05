class Solution {
    public int countPartitions(int[] nums) {
        int left=0,right=0,count=0;
        for(int num:nums){
            right+=num;
        }
        for(int i=0;i<nums.length-1;i++){
            right-=nums[i];
            left+=nums[i];
            if((left-right)%2==0){
                count++;
            }
        }
        return count;
    }
}