class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] visited=new int[m][n];
        for(int[] wall:walls){
            visited[wall[0]][wall[1]]=1;
        }
        for(int[] guard:guards){
            visited[guard[0]][guard[1]]=1;
        }
        for(int[] guard:guards){
            for(int i=guard[0]-1,j=guard[1];i>=0;i--){
                if(visited[i][j]==1){
                    break;
                }
                visited[i][j]=2;
            }
            for(int i=guard[0]+1,j=guard[1];i<m;i++){
                if(visited[i][j]==1){
                    break;
                }
                visited[i][j]=2;
            }
            for(int i=guard[0],j=guard[1]-1;j>=0;j--){
                if(visited[i][j]==1){
                    break;
                }
                visited[i][j]=2;
            }
            for(int i=guard[0],j=guard[1]+1;j<n;j++){
                if(visited[i][j]==1){
                    break;
                }
                visited[i][j]=2;
            }
        }
        int unguarded=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==0){
                    unguarded++;
                }
            }
        }
        return unguarded;
    }
}