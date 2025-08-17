class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int asteroid:asteroids){
            while(!stack.isEmpty() && asteroid<0 && stack.peek()>0){
                int diff=asteroid+stack.peek();
                if(diff<0){
                    stack.pop();
                }
                else if(diff>0){
                    asteroid=0;
                }
                else{
                    stack.pop();
                    asteroid=0;
                }
            }
            if(asteroid!=0){
                stack.push(asteroid);
            }
        }
        if(stack.isEmpty()){
            return new int[0];
        }
        int[] arr=new int[stack.size()];
        int index=0;
        for(int a:stack){
            arr[index++]=a;
        }
        return arr;
    }
}