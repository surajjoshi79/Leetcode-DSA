class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        //naive approach
        /*for(int k=n/2;k>=1;k--){
            for(int i=0;i<=n-2*k;i++){
                if(increasingSubarray(nums,i,i+k) && increasingSubarray(nums,i+k,i+2*k)){
                    return k;
                }
            }
        }*/
        int[] incStart=new int[n];
        incStart[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(nums.get(i)<nums.get(i+1)){
                incStart[i]=incStart[i+1]+1;
            }else{
                incStart[i]=1;
            }
        }
        int l=0,h=n/2,ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(exists(nums,incStart,mid)){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    private boolean exists(List<Integer> nums,int[] incStart,int k){
        int n=nums.size();
        for(int i=0;i<=n-2*k;i++){
            if(incStart[i]>=k && incStart[i+k]>=k){
                return true;
            }
        }
        return false;
    }
    /*private boolean increasingSubarray(List<Integer> nums, int i, int n){
        for(;i<n-1;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }*/
}