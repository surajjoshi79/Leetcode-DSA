class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] prerequisite:prerequisites){
            graph.get(prerequisite[1]).add(prerequisite[0]);
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
        int count=0;
        while(!queue.isEmpty()){
            int current=queue.poll();
            count++;
            for(int n:graph.get(current)){
                indegree[n]=indegree[n]-1;
                if(indegree[n]==0){
                    queue.offer(n);
                }
            }
        }
        return count==numCourses;
    }
}