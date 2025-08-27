class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int num1=nums[i];
            int l=i+1,h=nums.length-1;
            while(l<h){
                if(Math.abs(target-(num1+nums[l]+nums[h]))<Math.abs(closest-target)){
                    closest=num1+nums[l]+nums[h];
                }
                if(target==num1+nums[l]+nums[h]){
                    closest=num1+nums[l]+nums[h];
                    break;
                }
                else if(target>num1+nums[l]+nums[h]){
                    l++;
                }
                else if(target<num1+nums[l]+nums[h]){
                    h--;
                }
            }
        }
        return closest;
    }
}