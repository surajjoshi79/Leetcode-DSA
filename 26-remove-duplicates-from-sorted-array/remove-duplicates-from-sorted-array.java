class Solution {
    public int removeDuplicates(int[] nums) {
        /*Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        Iterator i=set.iterator();
        int j=0;
        while(i.hasNext()){
            nums[j]=(int)i.next();
            j++;
        } 
        int k=set.size();
        return k;*/
        int[] sol=new int[nums.length];
        Arrays.fill(sol,Integer.MIN_VALUE);
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                sol[j]=nums[i];
                j++;
            }
        }
        if(nums[nums.length-1]!=sol[j]){
            sol[j]=nums[nums.length-1];
            j++;
        }
        for(int i=0;i<j;i++){
            nums[i]=sol[i];
        }
        return j;
    }
}