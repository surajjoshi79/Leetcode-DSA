class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orignal=image[sr][sc];
        if(orignal==color){
            return image;
        }
        dfs(image,sr,sc,color,orignal);
        return image;
    }
    void dfs(int[][] image,int sr,int sc,int color,int orignal){
        if(sr<0 || sc<0|| sr==image.length|| sc==image[0].length || image[sr][sc]!=orignal){
            return ;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,orignal);
        dfs(image,sr-1,sc,color,orignal);
        dfs(image,sr,sc+1,color,orignal);
        dfs(image,sr,sc-1,color,orignal);
    }
}