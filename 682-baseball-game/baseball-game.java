class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String operation:operations){
            if(operation.equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                int c=b+a;
                stack.push(b);
                stack.push(a);
                stack.push(c);
            }else if(operation.equals("C")){
                stack.pop();
            }else if(operation.equals("D")){
                int a=stack.peek();
                stack.push(2*a);
            }else{
                stack.push(Integer.parseInt(operation));
            }
        }
        int sum=0;
        for(int score:stack){
            sum+=score;
        }
        return sum;
    }
}