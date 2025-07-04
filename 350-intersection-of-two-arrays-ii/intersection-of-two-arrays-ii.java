class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0,j=0,size=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                size++;
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] sol=new int[size];
        i=0;
        j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                sol[k]=nums1[i];
                i++;
                j++;
                k++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return sol;
    }
}