class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        while(sb.toString().length()<k){
            StringBuilder sb1=new StringBuilder();
            for(char c:sb.toString().toCharArray()){
                if(c=='z'){
                    sb1.append("a");
                }else{
                    c=(char)(c+1);
                    sb1.append(Character.toString(c));
                }
            }
            sb.append(sb1.toString());
        }
        return sb.toString().charAt(k-1);
    }
}