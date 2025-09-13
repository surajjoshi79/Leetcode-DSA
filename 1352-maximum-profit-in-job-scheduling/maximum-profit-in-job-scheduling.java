class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int[][] jobs=new int[n][3];
        for(int i=0;i<n;i++){
            int[] job={startTime[i],endTime[i],profit[i]};
            jobs[i]=job;
        }
        Arrays.sort(jobs,(a,b)->Integer.compare(a[0],b[0]));
        Integer[] dp=new Integer[n];
        return helper(jobs,0,dp);
    }
    int helper(int[][] jobs,int i,Integer[] dp){
        if(i>=jobs.length){
            return 0;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        int exclude=helper(jobs,i+1,dp);
        int nextIndex=binarySearch(jobs,jobs[i][1]);
        int include=jobs[i][2]+helper(jobs,nextIndex,dp);
        return dp[i]=Math.max(include,exclude);
    }
    int binarySearch(int[][] jobs,int currentEnd){
        int left=0,right=jobs.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(jobs[mid][0]<currentEnd){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}