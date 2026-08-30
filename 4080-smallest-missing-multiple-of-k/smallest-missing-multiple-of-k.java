class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=1;
        while(i<=100){
            if(!set.contains(k*i)){
                return k*i;
            }
            i++;
        }
        return 101;
    }
}