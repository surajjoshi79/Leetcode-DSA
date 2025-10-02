class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return helper(numBottles,0,numExchange);
    }
    int helper(int numBottles,int numEmpty,int numExchange) {
        if(numBottles+numEmpty < numExchange){
            return numBottles;
        }
        return numBottles+helper((numBottles+numEmpty)/numExchange,(numBottles+numEmpty)%numExchange,numExchange);
    }
}