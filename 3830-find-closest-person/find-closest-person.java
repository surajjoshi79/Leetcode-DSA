class Solution {
    public int findClosest(int x, int y, int z) {
        int distance1=Math.abs(z-x);
        int distance2=Math.abs(z-y);
        if(distance1<distance2){
            return 1;
        }
        if(distance1>distance2){
            return 2;
        }
        return 0;
    }
}