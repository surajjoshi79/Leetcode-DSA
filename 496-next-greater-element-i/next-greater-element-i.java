class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i] && j!=nums2.length-1){
                    for(int z=j+1;z<nums2.length;z++){
                        if(nums2[z]>nums2[j]){
                            ans[i]=nums2[z];
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
}