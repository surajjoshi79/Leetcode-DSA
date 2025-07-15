class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            graph.get(p[1]).add(p[0]);
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int n:graph.get(i)){
                indegree[n]=indegree[n]+1;
            }
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        int[] topoSort=new int[numCourses];
        int index=0;
        while(!queue.isEmpty()){
            int cur=queue.poll();
            topoSort[index]=cur;
            index++;
            for(int n:graph.get(cur)){
                indegree[n]=indegree[n]-1;
                if(indegree[n]==0){
                    queue.offer(n);
                }
            }
        }
        return index==numCourses?topoSort:new int[0];
    }
}