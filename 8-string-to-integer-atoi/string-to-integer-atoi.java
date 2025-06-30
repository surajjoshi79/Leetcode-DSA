class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.equals("")){
            return 0;
        }
        long a=0;
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>48 && s.charAt(i)<=57){
                index=i;
                break;
            }
            if(s.charAt(i)!=47 && (s.charAt(i)<48||s.charAt(i)>57) && s.charAt(i)!='-'){
                index=s.length();
                break;
            }
            if(i!=0 && s.charAt(i)=='-'){
                index=s.length();
                break;
            }
        }
        if(s.charAt(0)=='+'){
            index=1;
        }
        for(int i=index;i<s.length();i++){
            if(a>Integer.MAX_VALUE){
                return s.charAt(0)=='-'?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                a=10*a+Integer.parseInt(""+s.charAt(i));
            }
            else{
                break;
            }
        }
        if(a>Integer.MAX_VALUE){
            return s.charAt(0)=='-'?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        if(s.charAt(0)=='-'){
            a=-a;
        }
        return (int)a;
    }
}