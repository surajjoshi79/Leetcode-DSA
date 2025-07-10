class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
    void dfs(int cur,int[][] isConnected,boolean[] visited){
        visited[cur]=true;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i] && isConnected[cur][i]==1){
                dfs(i,isConnected,visited);
            }
        }
    }
}