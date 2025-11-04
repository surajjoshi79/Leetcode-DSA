class Solution {
    public int maxPower(String s) {
        int l=0,power=1;
        for(int r=1;r<s.length();r++){
            if(s.charAt(r)==s.charAt(l)){
                power=Math.max(power,r-l+1);
            }else{
                l=r;
            }
        }
        return power;
    }
}