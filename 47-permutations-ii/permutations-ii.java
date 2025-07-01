class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> bigList=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        return helper(nums,smallList,bigList,visited); 
    }
    List<List<Integer>> helper(int[] nums,List<Integer> smallList,List<List<Integer>> bigList,boolean[] visited){
        if(nums.length==smallList.size()){
            if(!bigList.contains(smallList)){
                bigList.add(new ArrayList<>(smallList));
            }
            return bigList;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                smallList.add(nums[i]);
                helper(nums,smallList,bigList,visited);
                smallList.remove(smallList.size()-1);
                visited[i]=false;
            }
        }
        return bigList;
    }
}