class Solution {
    public boolean increasingTriplet(int[] nums) {
        /*Boolean[][] dp=new Boolean[nums.length][nums.length]; 
        return helper(nums,-1,0,0,dp);*/
        if(nums.length<3){
            return false;
        }
        int lowest=Integer.MAX_VALUE,secondLowest=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=lowest){
                lowest=num;
            }
            else if(num<=secondLowest){
                secondLowest=num;
            }
            else{
                return true;
            }
        }
        return false;
    }
    /*public boolean helper(int[] nums,int prev,int index,int count,Boolean[][] dp){
        if(count==3){
            return true;
        }
        if(index>=nums.length){
            return false;
        }
        if(dp[prev+1][index]!=null){
            return dp[prev+1][index];
        }
        boolean include=false;
        if(prev==-1 || nums[prev]<nums[index]){
            include=helper(nums,index,index+1,count+1,dp);
        }
        boolean exclude=helper(nums,prev,index+1,count,dp);
        return dp[prev+1][index]=include || exclude;
    }*/ 
}