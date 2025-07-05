class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        /*for(int i=0;i<temperatures.length;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    ans[i]=j-i;
                    break;
                }
            }
        }*/
        stack.push(0);
        for(int i=1;i<temperatures.length;i++){
            if(temperatures[stack.peek()]<temperatures[i]){
                ans[stack.peek()]=i-stack.pop();
                while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                    ans[stack.peek()]=i-stack.pop();
                }
            }
            stack.push(i);
        }
        return ans;
    }
}