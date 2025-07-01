class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,iMax=0,jMax=0,water=0;
        while(i<j){
            if(height[i]<height[j]){
                if(height[i]>iMax){
                    iMax=height[i];
                }
                else{
                    water=water+(iMax-height[i]);
                }
                i++;
            }
            else{
                if(height[j]>jMax){
                    jMax=height[j];
                }
                else{
                    water=water+(jMax-height[j]);
                }
                j--;
            }
        }
        return water;
    }
}