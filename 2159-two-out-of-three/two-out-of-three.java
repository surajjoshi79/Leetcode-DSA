class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums1){
            set.add(num);
            set1.add(num);
        }
        for(int num:nums2){
            set.add(num);
            set2.add(num);
        }
        for(int num:nums3){
            set.add(num);
            set3.add(num);
        }
        for(int num:set){
            if(set1.contains(num) && set2.contains(num) && set3.contains(num) ||
            set1.contains(num) && set2.contains(num) ||
            set2.contains(num) && set3.contains(num) ||
            set1.contains(num) && set3.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}