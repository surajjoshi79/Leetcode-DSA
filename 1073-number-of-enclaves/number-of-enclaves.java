class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    grid[i][j]=2;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(grid[i][0]==2){
                dfs(grid,i,0,1);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[i][n-1]==2){
                dfs(grid,i,n-1,1);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[0][i]==2){
                dfs(grid,0,i,1);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[m-1][i]==2){
                dfs(grid,m-1,i,1);
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] grid,int i,int j,int val){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]!=2){
            return ;
        }
        grid[i][j]=val;
        dfs(grid,i+1,j,val);
        dfs(grid,i-1,j,val);
        dfs(grid,i,j-1,val);
        dfs(grid,i,j+1,val);
    }
}