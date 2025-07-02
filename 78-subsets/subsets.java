class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> bigList=new ArrayList<>();
        helper(nums,smallList,bigList,0);
        return bigList;
    }
    void helper(int[] nums,List<Integer> smallList,List<List<Integer>> bigList,int index){
        bigList.add(new ArrayList<>(smallList));
        for(int i=index;i<nums.length;i++){
            smallList.add(nums[i]);
            helper(nums,smallList,bigList,i+1);
            smallList.remove(smallList.size()-1);
        }
    }
}