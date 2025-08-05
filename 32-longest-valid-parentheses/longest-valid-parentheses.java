class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int max=0,index=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(index);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                   stack.push(index); 
                }
                else{
                    max=Math.max(max,index-stack.peek());
                }
            }
            index++;
        }
        return max;
    }
}