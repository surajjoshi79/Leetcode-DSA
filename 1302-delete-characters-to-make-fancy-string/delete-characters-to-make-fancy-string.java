class Solution {
    public String makeFancyString(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1) && count<1){
                count++;
                sb.append(Character.toString(s.charAt(i)));
            }
            else if(s.charAt(i)!=s.charAt(i+1)){
                sb.append(Character.toString(s.charAt(i)));
                count=0;
            }
        }
        if(count<2){
            sb.append(s.charAt(s.length()-1));
        }
        return sb.toString();
    }
}