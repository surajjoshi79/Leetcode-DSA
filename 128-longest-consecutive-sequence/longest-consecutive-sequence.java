class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int longest=1;
        for(int i:set){
            int streak=0;
            if(!set.contains(i-1)){
                int current=i;
                streak++;
                while(set.contains(current+1)){
                    streak++;
                    current=current+1;
                }
            }
            longest=Math.max(longest,streak);
        }
        return longest;
    }
}