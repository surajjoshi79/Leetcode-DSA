class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        dfs(rooms,0,visited);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
    void dfs(List<List<Integer>> rooms,int key,boolean[] visited){
        visited[key]=true;
        for(int k:rooms.get(key)){
            if(!visited[k]){
                dfs(rooms,k,visited);
            }
        }
    }
}