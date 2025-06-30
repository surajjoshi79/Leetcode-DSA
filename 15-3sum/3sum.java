class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> bigList=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            List<Integer> smallList=new ArrayList<>();
            smallList.add(nums[i]);
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    smallList.add(nums[l]);
                    smallList.add(nums[r]);
                    bigList.add(new ArrayList<>(smallList));
                    smallList.remove(smallList.size()-1);
                    smallList.remove(smallList.size()-1);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
                else if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return bigList;
    }
}