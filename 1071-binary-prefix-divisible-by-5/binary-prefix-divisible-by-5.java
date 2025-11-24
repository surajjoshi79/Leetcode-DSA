class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int num = 0;
        for(int cur : nums){
            num = ((num << 1) + cur) % 5;
            if(num == 0) res.add(true);
            else res.add(false);
        }
        return res;
    }
}