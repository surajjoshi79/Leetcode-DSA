class Solution {
    public void rotate(int[] nums, int k) {
        /*k=k%nums.length;
        if(k==0){
            return;
        }
        int last=nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=last;
        rotate(nums,k-1);*/
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}