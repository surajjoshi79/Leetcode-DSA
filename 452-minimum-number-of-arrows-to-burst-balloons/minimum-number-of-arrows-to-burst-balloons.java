class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int prev=0;
        int count=1;
        for(int cur=1;cur<points.length;cur++){
            if(points[cur][0]>points[prev][1]){
                count++;
                prev=cur;
            }
        }
        return count;
    }
}