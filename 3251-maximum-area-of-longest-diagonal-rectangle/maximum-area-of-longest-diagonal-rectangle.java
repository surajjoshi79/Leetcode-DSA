class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        long maxDiagonal=0;
        int length=0,width=0;
        for(int[] dimension:dimensions){
            long diagonal=(long)dimension[0]*dimension[0]+dimension[1]*dimension[1];
            if(diagonal>maxDiagonal){
                maxDiagonal=diagonal;
                length=dimension[0];
                width=dimension[1];
            }
            else if(diagonal==maxDiagonal){
                if((dimension[0]*dimension[1])>length*width){
                    length=dimension[0];
                    width=dimension[1];
                }
            }
        }
        return length*width;
    }
}