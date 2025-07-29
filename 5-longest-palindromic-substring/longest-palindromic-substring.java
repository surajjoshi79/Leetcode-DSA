class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int index=0;
        int longest=0;
        for(int i=0;i<s.length();i++){
            int left=i,right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1 > longest){
                    index=left;
                    longest=right-left+1;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1 > longest){
                    index=left;
                    longest=right-left+1;
                }
                left--;
                right++;
            }
        }
        return s.substring(index,index+longest);
    }
}