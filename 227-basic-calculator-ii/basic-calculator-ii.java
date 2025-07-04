class Solution {
    public int calculate(String s) {
        if(s.length()==1){
            return Integer.parseInt(s);
        }
        List<String> postfix=toPostfix(s);
        int ans=0,a=0,b=0;
        Stack<Integer> stack=new Stack<>();
        for(String str:postfix){
            switch (str){
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
                default:stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
    List<String> toPostfix(String infix){
        List<String> postfix=new ArrayList<>();
        Stack<Character> stack=new Stack<>();
        int num=0;
        for(char c:infix.toCharArray()){
            if(c==' '){
                continue;
            }
            if(Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if(c=='('){
                if(num>=0){
                    postfix.add(String.valueOf(num));
                    num=0;
                }
                stack.push(c);
            }
            else if(c==')') {
                if(num>=0){
                    postfix.add(String.valueOf(num));
                    num=0;
                }
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.add(Character.toString(stack.pop()));
                }
                stack.pop();
            }
            else{
                if(num>=0){
                    postfix.add(String.valueOf(num));
                    num=0;
                }
                while(!stack.isEmpty() && precedence(stack.peek())>= precedence(c)){
                    postfix.add(Character.toString(stack.pop()));
                }
                stack.push(c);
            }
        }
        if(num>=0){
            postfix.add(String.valueOf(num));
        }
        while(!stack.isEmpty()){
            postfix.add(Character.toString(stack.pop()));
        }
        return postfix;
    }
    int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
}