class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int[] ans=new int[n];
        int[][] newIntervals=new int[n][3];
        for(int i=0;i<n;i++){
            newIntervals[i][0]=intervals[i][0];
            newIntervals[i][1]=intervals[i][1];
            newIntervals[i][2]=i;
        }
        Arrays.sort(newIntervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int[] interval:newIntervals){
            ans[interval[2]]=binarySearch(newIntervals,interval[1]);
        }
        return ans;
    }
    int binarySearch(int[][] intervals,int end){
        if(intervals[0][0]>=end){
            return intervals[0][2];
        }
        int left=1,right=intervals.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(intervals[mid][0]==end || (intervals[mid][0]>end && intervals[mid-1][0]<end)){
                return intervals[mid][2];
            }
            else if(intervals[mid][0]<end){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}