class Solution {
    public boolean isBalanced(String num) {
        int odd=0,even=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                even+=Integer.parseInt(Character.toString(num.charAt(i)));
            }else{
                odd+=Integer.parseInt(Character.toString(num.charAt(i)));
            }
        }
        return odd==even;
    }
}