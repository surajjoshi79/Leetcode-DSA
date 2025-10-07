class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> bigList=new ArrayList<>();
        helper(nums,0,smallList,bigList);
        return bigList;
    }
    void helper(int[] nums,int index,List<Integer> smallList,List<List<Integer>> bigList){
        if(smallList.size()>=2){
            List<Integer> list=new ArrayList<>(smallList);
            bigList.add(list);
        }
        Set<Integer> set=new HashSet<>();
        for(int i=index;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            if(smallList.isEmpty() || nums[i]>=smallList.get(smallList.size()-1)){
                set.add(nums[i]);
                smallList.add(nums[i]);
                helper(nums,i+1,smallList,bigList);
                smallList.remove(smallList.size()-1);
            }
        }
    }
}