class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1,j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int digitA=(i>=0)?a.charAt(i)-'0':0;
            int digitB=(j>=0)?b.charAt(j)-'0':0;

            int total=digitA+digitB+carry;
            sb.append(total%2);
            carry=total/2;

            i--;
            j--; 
        }
        if(carry!=0){
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}