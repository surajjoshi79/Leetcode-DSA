class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int currentLongest=1;
        int longest=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currentLongest++;
            }
            else{
                longest=Math.max(longest,currentLongest);
                currentLongest=1;
            }
        }
        return Math.max(longest,currentLongest);
    }
}