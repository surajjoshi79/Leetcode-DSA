class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefMax=new int[n];
        int[] sufMin=new int[n];
        prefMax[0]=nums[0];
        sufMin[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefMax[i]=nums[i]>prefMax[i-1]?nums[i]:prefMax[i-1];
        }
        for(int i=n-2;i>-1;i--){
            sufMin[i]=nums[i]<sufMin[i+1]?nums[i]:sufMin[i+1];
        }
        for(int i=0;i<n;i++){
            if(prefMax[i]-sufMin[i]<=k){
                return i;
            }
        }
        return -1;
    }
}