class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length==0){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}