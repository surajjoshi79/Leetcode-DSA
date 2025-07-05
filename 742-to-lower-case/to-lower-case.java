class Solution {
    public String toLowerCase(String s) {
        if(s.equals(" ")){
            return s;
        }
        char[] ch=new char[s.toCharArray().length];
        int i=0;
        for(char c:s.toCharArray()){
            if(c>=65 && c<=90){
                ch[i]=(char)(c+32);
            }
            else{
                ch[i]=c;
            }
            i++;
        }
        return new String(ch);
    }
}