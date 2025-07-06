class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.equals("0")){
            return num2;
        }
        if(num2.equals("0")){
            return num1;
        }
        int carry=0,i=num1.length()-1,j=num2.length()-1;
        StringBuilder sb=new StringBuilder();
        while (i>=0 && j>=0){
            String str=String.valueOf(((int)(num1.charAt(i)-'0')+(int)(num2.charAt(j)-'0')+carry)%10);
            carry=((int)(num1.charAt(i)-'0')+(int)(num2.charAt(j)-'0')+carry)/10;
            sb.append(str);
            i--;
            j--;
        }
        while(i>=0){
            String str=String.valueOf(((int)(num1.charAt(i)-'0')+carry)%10);
            carry=((int)(num1.charAt(i)-'0')+carry)/10;
            sb.append(str);
            i--;
        }
        while(j>=0){
            String str=String.valueOf(((int)(num2.charAt(j)-'0')+carry)%10);
            carry=((int)(num2.charAt(j)-'0')+carry)/10;
            sb.append(str);
            j--;
        }
        if(carry!=0){
            sb.append(String.valueOf(carry));
        }
        return sb.reverse().toString();
    }
}