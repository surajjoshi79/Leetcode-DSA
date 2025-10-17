class Solution {
    public int specialArray(int[] nums) {
        int l=1,h=nums.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid==greaterElement(nums,mid)){
                return mid;
            }else if(mid>greaterElement(nums,mid)){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
    private int greaterElement(int[] nums,int mid){
        int count=0;
        for(int num:nums){
            if(num>=mid){
                count++;
            }
        }
        return count;
    }
}