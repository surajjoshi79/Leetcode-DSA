class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> stack=new Stack<>();
        int ans=0,a=0,b=0;
        for(String s:tokens){
            switch(s){
                case "+":a=stack.pop();
                b=stack.pop();
                ans=b+a;
                stack.push(ans);
                break;
                case "-":a=stack.pop();
                b=stack.pop();
                ans=b-a;
                stack.push(ans);
                break;
                case "*":a=stack.pop();
                b=stack.pop();
                ans=b*a;
                stack.push(ans);
                break;
                case "/":a=stack.pop();
                b=stack.pop();
                ans=b/a;
                stack.push(ans);
                break;
                default:stack.push(Integer.parseInt(s));
            }
        }
        return ans;
    }
}