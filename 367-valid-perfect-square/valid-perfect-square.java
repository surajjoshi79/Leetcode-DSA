class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1,h=num;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid*mid==num){
                return true;
            }
            else if((long)mid*mid<(long)num){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}