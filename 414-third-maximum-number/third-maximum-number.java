class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        List<Integer> list=new ArrayList<>(set);
        return list.size()<3?list.get(list.size()-1):list.get(list.size()-3);
    }
}