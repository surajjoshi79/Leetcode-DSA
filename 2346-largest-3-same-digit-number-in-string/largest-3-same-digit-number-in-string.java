class Solution {
    public String largestGoodInteger(String num) {
        String str="";
        int count=0;
        for(int i=0;i<num.length()-1;i++){
            if(num.charAt(i)==num.charAt(i+1) && count<1){
                count++;
            }
            else if(num.charAt(i)==num.charAt(i+1) && count==1){
                if(str=="" || Integer.parseInt(str)<Integer.parseInt(num.substring(i-1,i+2))){
                    str=num.substring(i-1,i+2);
                }
                count=0;
            }
            else if(num.charAt(i)!=num.charAt(i+1)){
                count=0;
            }
        }
        return str;
    }
}