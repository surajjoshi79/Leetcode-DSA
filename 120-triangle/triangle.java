class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp=new Integer[triangle.size()][triangle.get(triangle.size()-1).size()];
        return helper(triangle,0,0,triangle.size(),triangle.get(triangle.size()-1).size(),dp);
    }
    int helper(List<List<Integer>> triangle,int row,int col,int totalRow,int totalCol,Integer[][] dp){
        if(row>=totalRow || col>=totalCol){
            return 0;
        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }
        int sum1=triangle.get(row).get(col)+helper(triangle,row+1,col,totalRow,totalCol,dp);
        int sum2=triangle.get(row).get(col)+helper(triangle,row+1,col+1,totalRow,totalCol,dp);
        return dp[row][col]=Math.min(sum1,sum2);
    }
}