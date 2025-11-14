class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        for(int pile:piles){
            r=Math.max(r,pile);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            int time=0;
            for(int pile:piles){
                time+=pile/mid;
                if(pile%mid!=0){
                    time++;
                }
            }
            if(time<=h){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}