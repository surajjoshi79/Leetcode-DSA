class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] greater=new int[nums.length];
        Arrays.fill(greater,-1);
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<nums.length*2;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%nums.length]){
                greater[stack.pop()]=nums[i%nums.length];
            }
            stack.push(i%nums.length);
        }
        return greater;
    }
}