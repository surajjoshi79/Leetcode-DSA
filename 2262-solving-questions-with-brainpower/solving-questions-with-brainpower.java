class Solution {
    public long mostPoints(int[][] questions) {
        Long[] dp=new Long[questions.length];
        return helper(questions,0,dp);
    }
    long helper(int[][] questions,int index,Long[] dp){
        if(index>=questions.length){
            return 0;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        long include=questions[index][0]+helper(questions,index+questions[index][1]+1,dp);
        long exclude=helper(questions,index+1,dp);
        return dp[index]=Math.max(include,exclude);
    }
}