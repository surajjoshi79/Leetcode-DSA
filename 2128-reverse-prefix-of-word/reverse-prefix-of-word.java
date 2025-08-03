class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(Character.toString(ch))){
            return word;
        }
        int right=-1;
        for(char c:word.toCharArray()){
            right++;
            if(c==ch){
                break;
            }
        }
        char[] str=word.substring(0,right+1).toCharArray();
        int left=0,remaining=right+1;
        while(left<right){
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
        }
        String res=new String(str);
        return res+word.substring(remaining,word.length());
    }
}