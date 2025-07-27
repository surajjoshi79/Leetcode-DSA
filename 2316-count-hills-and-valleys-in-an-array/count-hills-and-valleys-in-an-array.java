class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            int left=i-1,right=i+1;
            while(left>=0 && right<nums.length){
                if((nums[left]<nums[i] && nums[right]<nums[i]) || (nums[left]>nums[i] && nums[right]>nums[i])){
                    count++;
                    break;
                }
                else if(nums[left]==nums[i]){
                    left--;
                }
                else if(nums[right]==nums[i]){
                    right++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}