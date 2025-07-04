class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int countZero=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZero++;
            }           
        }
        if(countZero==0){
            for(int i=0;i<nums.length;i++){
                product=product*nums[i];            
            }
            for(int i=0;i<nums.length;i++){
                arr[i]=product/nums[i];
            }
        }
        else if(countZero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    product=product*nums[i];
                }            
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    arr[i]=product;
                }else{
                    arr[i]=0;
                }
            }
        }
        else {
            for(int i=0;i<nums.length;i++){
                arr[i]=0;
            }
        }
        return arr;
    }
}