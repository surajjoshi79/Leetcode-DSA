class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination){
            return true;
        }
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited=new boolean[n];
        return dfs(graph,source,destination,visited); 
    }
    boolean dfs(List<List<Integer>> graph,int source,int destination,boolean[] visited){
        visited[source]=true;
        for(int neighbour:graph.get(source)){
            if(neighbour==destination){
                return true;
            }
            if(!visited[neighbour]){
                if(dfs(graph,neighbour,destination,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}