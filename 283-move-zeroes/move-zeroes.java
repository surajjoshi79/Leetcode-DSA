class Solution {
    public void moveZeroes(int[] nums) {
        /*int i=0,j=nums.length;
        while(i<j){
            if(nums[i]==0){
                for(int k=i+1;k<j;k++){
                    nums[k-1]=nums[k];
                }
                j--;
                nums[j]=0;
            }
            else{
                i++;
            }
        }*/
        int i=0;
        int[] sol=new int[nums.length];
        for(int num:nums){
            if(num!=0){
                sol[i]=num;
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=sol[j];
        }
    }
}