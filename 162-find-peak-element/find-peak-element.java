class Solution {
    public int findPeakElement(int[] nums) {
        int l=1,h=nums.length-2;
        if(nums.length==1){
            return 0;
        }
        if(nums[h+1]>nums[h]){
            return h+1;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return 0;
    }
}