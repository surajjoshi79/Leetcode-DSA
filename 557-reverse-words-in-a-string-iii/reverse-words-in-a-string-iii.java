class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            int l=0,r=word.length()-1;
            char[] c=word.toCharArray();
            while(l<r){
                char temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                l++;
                r--;
            }
            String str=new String(c);
            sb.append(str+" ");
        }
        return sb.toString().trim();
    }
}