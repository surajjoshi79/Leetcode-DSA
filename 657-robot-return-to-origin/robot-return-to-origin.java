class Solution {
    public boolean judgeCircle(String moves) {
        int up=0;
        int down=0;
        int left=0;
        int right=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                up++;
            }
            else if(c=='D'){
                down++;
            }
            else if(c=='L'){
                left++;
            }
            else{
                right++;
            }
        }
        if(up==down && left==right){
            return true;
        }
        return false;
    }
}