class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        /*List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if((nums1[i]==nums2[j])&& !list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }
        int[] sol=new int[list.size()];
        int k=0;
        for(int i:list){
            sol[k++]=i;
        }
        return sol;*/
        int i=0,j=0;
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
                continue;
            }
            else{
                j++;
            }
        }
        int[] sol=new int[list.size()];
        int k=0;
        for(int num:list){
            sol[k++]=num;
        }
        return sol;
    }
}