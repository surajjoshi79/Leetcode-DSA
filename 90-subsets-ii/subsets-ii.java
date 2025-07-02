class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> bigList=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,smallList,bigList,0);
        return bigList;
    }
    void helper(int[] nums,List<Integer> smallList,List<List<Integer>> bigList,int index){
        if(!bigList.contains(smallList)){
            bigList.add(new ArrayList<>(smallList));
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[index]){
                continue;
            }
            smallList.add(nums[i]);
            helper(nums,smallList,bigList,i+1);
            smallList.remove(smallList.size()-1);
        }
    }
}