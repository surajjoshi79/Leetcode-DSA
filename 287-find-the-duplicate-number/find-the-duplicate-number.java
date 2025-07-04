class Solution {
    public int findDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;*/
        boolean[] visited=new boolean[nums.length+1];
        for(int i:nums){
            if(visited[i]){
                return i;
            }
            visited[i]=true;
        }
        return 0;
    }
}