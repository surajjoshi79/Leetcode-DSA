class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> bigList=new ArrayList<>();
        List<Integer> smallList=new ArrayList<>();
        boolean[] visited=new boolean[10];
        return helper(k,n,bigList,smallList,visited);
    }
    List<List<Integer>> helper(int k,int n,List<List<Integer>> bigList,List<Integer> smallList, boolean[] visited){
        if(smallList.size()==k && n==0){
            List<Integer> list=new ArrayList<>(smallList);
            Collections.sort(list);
            if(!bigList.contains(list)){
                bigList.add(list);
            }
            return bigList;
        }
        if(smallList.size()==k || n<0){
            return bigList;
        }
        for(int i=1;i<=9;i++){
            if(i>n){
                break;
            }
            if(!visited[i]){
                visited[i]=true;
                smallList.add(i);
                helper(k,n-i,bigList,smallList,visited);
                visited[i]=false;
                smallList.remove(smallList.size()-1);
            }
        }
        return bigList;
    }
}