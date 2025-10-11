class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Arrays.sort(nums);
        int i=-1;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]!=nums[j+1]){
                nums[++i]=nums[j];
            }
        }
        if(i==-1 || nums[i]!=nums[nums.length-1]){
            nums[++i]=nums[nums.length-1];
        }
        int earn1=0,earn2=0;
        for(int j=0;j<=i;j++){
            int curEarn=nums[j]*map.get(nums[j]);
            if(j>0 && nums[j]-1==nums[j-1]){
                int temp=earn2;
                earn2=Math.max(curEarn+earn1,earn2);
                earn1=temp;
            }else{
                int temp=earn2;
                earn2=curEarn+earn2;
                earn1=temp;
            }
        }
        return earn2;
    }
}