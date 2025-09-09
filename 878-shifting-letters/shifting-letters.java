class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] str=s.toCharArray(); 
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]=(shifts[i]+shifts[i+1])%26;
        }
        shifts[shifts.length-1]=shifts[shifts.length-1]%26;
        for(int i=0;i<shifts.length;i++){
            if(str[i]=='z' && shifts[i]!=0){
                str[i]='a';
                str[i]=(char)(str[i]+shifts[i]-1);
            }
            else if(str[i]+shifts[i]>122){
                int diff=('z'+1)-str[i];
                str[i]='a';
                str[i]=(char)(str[i]+shifts[i]-diff);
            }
            else{
                str[i]=(char)(str[i]+shifts[i]);
            }
        }
        return new String(str);
    }
}