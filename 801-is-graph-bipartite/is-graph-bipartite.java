class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] colors=new int[n];
        Arrays.fill(colors,-1);
        for(int i=0;i<n;i++){
            if(colors[i]==-1){
                Queue<Integer> queue=new LinkedList<>();
                queue.add(i);
                colors[i]=1;
                while(!queue.isEmpty()){
                    int cur=queue.poll();
                    for(int neighbour:graph[cur]){
                        if(colors[neighbour]==-1){
                            colors[neighbour]=1-colors[cur];
                            queue.add(neighbour);
                        }else if(colors[neighbour]==colors[cur]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}