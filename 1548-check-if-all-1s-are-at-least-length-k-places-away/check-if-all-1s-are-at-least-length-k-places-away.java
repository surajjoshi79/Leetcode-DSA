class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int l;
        for(l=0;l<nums.length;l++){
            if(nums[l]==1){
                break;
            }
        }
        for(int r=l+1;r<nums.length;r++){
            int distance=r-l-1;
            if(nums[r]==1 && distance>=k){
                l=r;
            }else if(nums[r]!=0){
                return false;
            }
        }
        return true;
    }
}