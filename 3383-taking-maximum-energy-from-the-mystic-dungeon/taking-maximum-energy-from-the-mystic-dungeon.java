class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int maxEnergy=Integer.MIN_VALUE;
        Integer[] dp=new Integer[energy.length];
        for(int i=0;i<energy.length;i++){
            maxEnergy=Math.max(maxEnergy,helper(energy,i,k,dp));
        }
        return maxEnergy;
    }
    int helper(int[] energy,int i,int k,Integer[] dp){
        if(i>=energy.length){
            return 0;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        int max=energy[i]+helper(energy,i+k,k,dp);
        return dp[i]=max;
    }
}