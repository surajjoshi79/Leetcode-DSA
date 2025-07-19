class Solution {
    public int longestCycle(int[] edges) {
        int totalNodes=edges.length;
        boolean[] visited=new boolean[totalNodes];
        int maxLengthCycle=-1;
        for(int node=0;node<totalNodes;node++){
            if(visited[node]){
                continue;
            }
            int curNode=node;
            List<Integer> cycle=new ArrayList<>();
            for(;curNode!=-1 && !visited[curNode];curNode=edges[curNode]){
                cycle.add(curNode);
                visited[curNode]=true;
            }
            if(curNode!=-1){
                for(int cycleIndex=0;cycleIndex<cycle.size();cycleIndex++){
                    if(cycle.get(cycleIndex)==curNode){
                        maxLengthCycle=Math.max(maxLengthCycle,cycle.size()-cycleIndex);
                        break;
                    }
                }
            }
        }
        return maxLengthCycle;
    }
}