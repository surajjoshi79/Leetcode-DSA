class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=-1,min=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        return (long)(max-min)*k;
    }
}