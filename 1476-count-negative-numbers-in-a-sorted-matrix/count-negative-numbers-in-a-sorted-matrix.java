class Solution {
    public int countNegatives(int[][] grid) {
        int count=0,row=0,col=grid[0].length-1,m=grid.length;
        while(row<m){
            if(col<0 || grid[row][col]>=0){
                col=grid[0].length-1;
                row++;
            }else{
                count++;
                col--;
            }
        }
        return count;
    }
}