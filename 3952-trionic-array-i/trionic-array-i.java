class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums[0]>=nums[1]){
            return false;
        }
        int p=-1,q=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1] && p==-1){
                p=i-1;
            }
            if(nums[i]>=nums[i-1] && p!=-1){
                q=i-1;
            }
            if(nums[i]<=nums[i-1] && q!=-1){
                return false;
            }
        }
        return p!=-1&&q!=-1;
    }
}