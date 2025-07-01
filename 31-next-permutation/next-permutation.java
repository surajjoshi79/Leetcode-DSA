class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        if(nums.length==2){
            int temp=nums[1];
            nums[1]=nums[0];
            nums[0]=temp;
            return;
        }
        int i=nums.length-2;
        while(i>=0){
            if(nums[i]<nums[i+1]){
                break;
            }
            i--;
        }
        if(i==-1){
            Arrays.sort(nums);
            return;
        }
        int j=nums.length-1;
        while(j>=0){
            if(nums[j]>nums[i]){
                break;
            }
            j--;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        int l=i+1;
        int r=nums.length-1;
        while(l<r){
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}