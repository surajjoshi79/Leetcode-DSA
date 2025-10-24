class Solution {
    final int modulo=1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        Map<String,Long> dp=new HashMap<>();
        return (int)helper(m,n,maxMove,startRow,startColumn,dp);
    }
    long helper(int totalRow,int totalCol,int maxMove,int row,int col,Map<String,Long> dp){
        if(maxMove<0){
            return 0;
        }
        if(row<0 || col<0 || row>=totalRow || col>=totalCol){
            return 1;
        }
        String key=row+"-"+col+"-"+maxMove;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        long total=0;
        total=(total+helper(totalRow,totalCol,maxMove-1,row-1,col,dp))%modulo;
        total=(total+helper(totalRow,totalCol,maxMove-1,row+1,col,dp))%modulo;
        total=(total+helper(totalRow,totalCol,maxMove-1,row,col-1,dp))%modulo;
        total=(total+helper(totalRow,totalCol,maxMove-1,row,col+1,dp))%modulo;
        dp.put(key,total);
        return dp.get(key);
    }
}