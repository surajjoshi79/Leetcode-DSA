class Solution {
    public void reverseString(char[] s) {
        /*Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length;i++){
            stack.push(s[i]);
        }
        for(int i=0;i<s.length;i++){
            s[i]=stack.pop();
            System.out.print(s[i]+" ");
        }*/
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}