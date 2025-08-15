class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0){
            return true;
        }
        Boolean[] dp=new Boolean[arr.length];
        boolean[] visited=new boolean[arr.length];
        return helper(arr,start,dp,visited);
    }
    boolean helper(int[] arr,int start,Boolean[] dp,boolean[] visited){
        if(start>=arr.length || start<0 || visited[start]){
            return false;
        }
        if(arr[start]==0){
            return true;
        }
        if(dp[start]!=null){
            return dp[start];
        }
        visited[start]=true;
        boolean option1=helper(arr,start+arr[start],dp,visited);
        boolean option2=helper(arr,start-arr[start],dp,visited);
        visited[start]=false;
        return dp[start]=option1 || option2;
    }
}