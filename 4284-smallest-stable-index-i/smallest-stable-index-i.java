class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=nums[i]>max?nums[i]:max;
            int min=min(nums,i);
            if(max-min<=k){
                return i;
            }
        }
        return -1;
    }
    int min(int[] nums,int i){
        int min=nums[i];
        for(int j=i+1;j<nums.length;j++){
            min=nums[j]<min?nums[j]:min;
        }
        return min;
    }
}