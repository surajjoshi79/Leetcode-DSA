class Solution {
    public void rotate(int[][] matrix) {
        int index=0;
        for(int i=index;i<matrix.length;i++){
            for(int j=index;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            index++;
        }
        for(int i=0;i<matrix.length;i++){
            int j=0,k=matrix.length-1;
            while(j<k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
        }
    }
}