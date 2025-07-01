class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(target==nums[m]){
                return m;
            }
            else if(target<nums[m]){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
        /*if(ans>-1){
            return ans;
        }
        else{
            ans=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<target){
                    ans++;
                }
            }
            return ans;
        }*/
    }
}