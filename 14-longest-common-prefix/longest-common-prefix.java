class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        String lcp=strs[0];
        for(String str:strs){
            lcp=helper(lcp,str);
        }
        return lcp;
    }
    String helper(String str1,String str2){
        if(str1.equals("") || str2.equals("")){
            return "";
        }
        if(str1.equals(str2)){
            return str1;
        }
        String lcp="";
        int i=0,j=0;
        while(i<str1.length() && j<str2.length() && str1.charAt(i)==str2.charAt(j)){
            lcp=lcp+str1.charAt(i);
            i++;
            j++;
        }
        return lcp;
    }
}