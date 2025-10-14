class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        for(int i=0;i<=n-2*k;i++){
            if(increasingSubarray(nums,i,i+k) && increasingSubarray(nums,i+k,i+2*k)){
                return true;
            }
        }
        return false;
    }
    private boolean increasingSubarray(List<Integer> nums, int i, int n){
        for(int in=i;i<n-1;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
}