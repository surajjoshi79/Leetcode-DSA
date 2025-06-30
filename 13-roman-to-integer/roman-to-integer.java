class Solution {
    public int romanToInt(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            int s1=values(s.charAt(i));
            if(i+1<s.length()){
                int s2=values(s.charAt(i+1));
                if(s1>=s2){
                    num+=s1;
                }
                else{
                    num+=(s2-s1);
                    i++;
                }
            }
            else{
                num+=s1;
            }
        }
        return num;
    }
    public int values(char c){
        if(c=='I'){
            return 1;
        }
        if(c=='V'){
            return 5;
        }
        if(c=='X'){
            return 10;
        }
        if(c=='L'){
            return 50;
        }
        if(c=='C'){
            return 100;
        }
        if(c=='D'){
            return 500;
        }
        if(c=='M'){
            return 1000;
        }
        return 0;
    }
}