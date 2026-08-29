class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0; 
        for(int i = 0; i < nums.length; i++){
            int product = nums[i];
            if(product < k){
                count++;
                for(int j = i-1; j >= 0 && product < k; j--){
                    product*=nums[j];
                    if(product < k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}