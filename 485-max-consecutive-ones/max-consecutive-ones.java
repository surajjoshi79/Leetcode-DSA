class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i:nums){
            if(i==0){
                max=Math.max(max,count);
                count=0;
            }else{
                count++;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}