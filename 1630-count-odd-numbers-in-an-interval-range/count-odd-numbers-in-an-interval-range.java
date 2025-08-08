class Solution {
    public int countOdds(int low, int high) {
        if(low==high){
            if(low%2==0){
                return 0;
            }
            return 1;
        }
        int total=0;
        if(high%2==0){
            total+=high/2;
        }
        else{
            total+=(high/2)+1;
        }
        return total-(low/2);
    }
}