class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int sumArray=0;
        for(int i=1;i<=nums.length;i++){
            sum+=i;
        }
        for(int i=0;i<nums.length;i++){
            sumArray+=nums[i];
        }
        return Math.abs(sumArray-sum);
        /*Arrays.sort(nums);
        if(nums[0]!=0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                return nums[i]+1;
            }
        }
        return nums.length;*/
    }
}