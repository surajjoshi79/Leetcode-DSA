class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides,(a,b)->Integer.compare(a[0],b[0]));
        Long[] dp=new Long[rides.length];
        return helper(rides,n,0,dp);
    }
    long helper(int[][] rides,int n,int index,Long[] dp){
        if(index>=rides.length || rides[index][0]>n){
            return 0;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        long exclude=helper(rides,n,index+1,dp);
        int nextIndex=binarySearch(rides,rides[index][1]);
        long include=(rides[index][1]-rides[index][0]+rides[index][2])+helper(rides,n,nextIndex,dp);
        return dp[index]=Math.max(include,exclude);
    }
    int binarySearch(int[][] rides,int end){
        int left=0,right=rides.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(rides[mid][0]<end){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}