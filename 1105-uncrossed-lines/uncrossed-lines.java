class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        Integer[][] dp=new Integer[nums1.length][nums2.length];
        return helper(nums1,nums2,0,0,dp);
    }
    int helper(int[] nums1,int[] nums2,int index1,int index2,Integer[][] dp){
        if(index1==nums1.length || index2==nums2.length){
            return 0;
        }
        if(dp[index1][index2]!=null){
            return dp[index1][index2];
        }
        int include=0,exclude1=0,exclude2=0;
        if(nums1[index1]==nums2[index2]){
            include=1+helper(nums1,nums2,index1+1,index2+1,dp);
        }
        else{
            exclude1=helper(nums1,nums2,index1,index2+1,dp);
            exclude2=helper(nums1,nums2,index1+1,index2,dp);
        }
        return dp[index1][index2]=Math.max(include,Math.max(exclude1,exclude2));
    }
}