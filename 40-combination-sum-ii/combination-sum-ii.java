class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> bigList=new ArrayList<>();
        Arrays.sort(candidates);
        return bigList=helper(candidates,target,smallList,bigList,0);
    }
    List<List<Integer>> helper(int[] nums,int target,List<Integer> smallList,List<List<Integer>> bigList,int index){
        if(target==0){
            bigList.add(new ArrayList<>(smallList)); 
            return bigList;
        }
        if(target<0){
            return bigList;
        }
        for(int i=index;i<nums.length;i++){
            if (i > index && nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] > target) {
                break;
            }
            smallList.add(nums[i]);
            helper(nums,target-nums[i],smallList,bigList,i+1);
            smallList.remove(smallList.size()-1);
        }
        return bigList;
    }
}