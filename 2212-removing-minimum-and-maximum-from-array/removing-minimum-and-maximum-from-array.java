class Solution {
    public int minimumDeletions(int[] nums) {
        int max=0,min=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        int first=Math.min(max,min),second=Math.max(max,min);
        return Math.min(second+1,Math.min(nums.length-first,first+1+(nums.length-second)));
    }
}