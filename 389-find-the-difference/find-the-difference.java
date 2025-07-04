class Solution {
    public char findTheDifference(String s, String t) {
        int asciiS=0;
        int asciiT=0;
        for(int i=0;i<s.length();i++){
            asciiS+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            asciiT+=t.charAt(i);
        }   
        char ans=(char)(asciiT-asciiS);
        return ans;
    }
}