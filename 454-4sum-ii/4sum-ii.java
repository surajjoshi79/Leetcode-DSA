class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n=nums1.length,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map.put(nums3[i]+nums4[j],map.getOrDefault(nums3[i]+nums4[j],0)+1);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map.containsKey(0-(nums1[i]+nums2[j]))){
                    count+=map.get(0-(nums1[i]+nums2[j]));
                }
            }
        }
        return count;
    }
}