class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack=new Stack<>();
        Stack<StringBuilder> stringStack=new Stack<>();
        StringBuilder curString=new StringBuilder();
        int num=0;
        for(char singleCharacter:s.toCharArray()){
            if(Character.isDigit(singleCharacter)){
                num=num*10+(singleCharacter-'0');
            }
            else if(singleCharacter=='['){
                countStack.push(num);
                stringStack.push(curString);
                num=0;
                curString=new StringBuilder();
            }
            else if(singleCharacter==']'){
                int repeat=countStack.pop();
                StringBuilder temp=stringStack.pop();
                for(int i=0;i<repeat;i++){
                    temp.append(curString);
                }
                curString=temp;
            }
            else{
                curString.append(singleCharacter);
            }
        } 
        return curString.toString();
    }
}