class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //first self approach 
        /*long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                int l=i-1;
                while(l>=0 && nums[l]==0){
                    count++;
                    l--;
                }
            }
        }
        return count;*/
        // second approach using hints
        long count=0;
        int consecutive=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count+=consecutive+1;
                consecutive++;
            }
            else{
                consecutive=0;
            }
        }
        return count;
    }
}