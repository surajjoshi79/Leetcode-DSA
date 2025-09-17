class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        int rightSum=0;
        for(int i=n;i>=1;i--){
            rightSum+=i;
            if(total==rightSum){
                return i;
            }
            total-=i;
        }
        return -1;
    }
}