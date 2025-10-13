class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]>=1 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1]!=i){
                return i;
            }
        }
        return nums.length+1;
    }
}