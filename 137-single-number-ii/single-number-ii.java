class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && count<=1){
                return nums[i];
            }
            if(nums[i]!=nums[i+1] && count>1){
                count=0;
            }
            count++;
        }
        return nums[nums.length-1];
    }
}