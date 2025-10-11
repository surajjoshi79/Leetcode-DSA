class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        char[] chr=s.toCharArray();
        for(int i=0;i<numRows;i++){
            int inc=(numRows-1)*2;
            for(int j=i;j<s.length();j+=inc){
                sb.append(Character.toString(chr[j]));
                if(i>0 && i<numRows-1 && (j+inc-2*i)<s.length()){
                    sb.append(Character.toString(chr[j+inc-2*i]));
                }
            }
        }
        return sb.toString();
    }
}