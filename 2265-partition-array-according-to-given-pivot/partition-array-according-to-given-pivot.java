class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] output=new int[nums.length];
        int index=0;
        for(int num:nums){
            if(num<pivot){
                output[index++]=num;
            }
        }
        for(int num:nums){
            if(num==pivot){
                output[index++]=num;
            }
        }
        for(int num:nums){
            if(num>pivot){
                output[index++]=num;
            }
        }
        return output;
    }
}