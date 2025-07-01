class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] sol=new int[2];
        sol[0]=-1;
        sol[1]=-1;
        if(nums.length==0){
            return sol;
        }
        if(nums[0]==target){
            sol[0]=0;
        }
        if(nums[nums.length-1]==target){
            sol[1]=nums.length-1;
        }
        int l=1,h=nums.length-2;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target && nums[mid-1]!=target){
                sol[0]=mid;
            }
            if(nums[mid]>target){
                h=mid-1;
            }
            if(nums[mid]<target){
                l=mid+1;
            }
            if(nums[mid]==target){
                h=h-1;
            }
        }
        l=1;
        h=nums.length-2;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target && nums[mid+1]!=target){
                sol[1]=mid;
            }
            if(nums[mid]>target){
                h=mid-1;
            }
            if(nums[mid]<target){
                l=mid+1;
            }
            if(nums[mid]==target){
                l=l+1;
            }
        }
        if(nums[0]==target && sol[1]==-1){
            sol[1]=0;
        }
        if(nums[nums.length-1]==target && sol[0]==-1){
            sol[0]=nums.length-1;
        }
        return sol;
    }
}