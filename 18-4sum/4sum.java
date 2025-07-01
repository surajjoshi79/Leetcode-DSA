class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> bigList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                List<Integer> smallList=new ArrayList<>();
                smallList.add(nums[i]);
                smallList.add(nums[j]);
                int l=j+1;
                int r=nums.length-1;
                while(l<r){
                    if((long)nums[i]+nums[j]+nums[l]+nums[r]==target){
                        smallList.add(nums[l]);
                        smallList.add(nums[r]);
                        if(!bigList.contains(smallList)){
                            bigList.add(new ArrayList<>(smallList));
                        }
                        smallList.remove(smallList.size()-1);
                        smallList.remove(smallList.size()-1);
                        l++;
                        r--;
                    }
                    else if(nums[i]+nums[j]+nums[l]+nums[r]<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return bigList;
    }
}