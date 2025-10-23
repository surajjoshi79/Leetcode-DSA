class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=0,longest=0;
        while(j<nums.length){
            if(nums[j]-nums[i]<1){
                j++;
            }else if(nums[j]-nums[i]==1){
                longest=Math.max(longest,j-i+1);
                j++;
            }else{
                i++;
            }
        }
        return longest;
    }
}