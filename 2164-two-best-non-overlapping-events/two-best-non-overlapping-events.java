class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
        Integer[][] dp=new Integer[events.length][2];
        return helper(events,0,1,dp);
    }
    private int helper(int[][] events,int i,int maximumEvent, Integer[][] dp){
        if(i>=events.length || maximumEvent<0){
            return 0;
        }
        if(dp[i][maximumEvent]!=null){
            return dp[i][maximumEvent];
        }
        int exclude=helper(events,i+1,maximumEvent,dp);
        int nextIndex=binarySearch(events,events[i][1]);
        int include=events[i][2]+helper(events,nextIndex,maximumEvent-1,dp);
        return dp[i][maximumEvent]=Math.max(include,exclude);
    }
    private int binarySearch(int[][] events,int current){
        int left=0,right=events.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(events[mid][0]<=current){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}