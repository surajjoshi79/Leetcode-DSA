class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list=new ArrayList<>();
        /*for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            list.add(count);
        }*/
        List<Integer> sorted=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int l=0,h=sorted.size()-1;
            int insert=binarySearch(sorted,l,h,nums[i]);
            sorted.add(insert,nums[i]);
            list.add(insert);
        }
        Collections.reverse(list);
        return list;
    }
    int binarySearch(List<Integer> sorted,int l,int h,int element){
        while(l<=h){
            int mid=l+(h-l)/2;
            if(sorted.get(mid)>=element){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
