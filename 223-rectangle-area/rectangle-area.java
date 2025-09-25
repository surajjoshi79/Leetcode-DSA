class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int length1=ax2-ax1;
        int width1=ay2-ay1;
        int length2=bx2-bx1;
        int width2=by2-by1;
        int length3=Math.max(0,Math.min(ax2,bx2)-Math.max(ax1,bx1));
        int width3=Math.max(0,Math.min(ay2,by2)-Math.max(ay1,by1));
        return length1*width1+length2*width2-length3*width3;
    }
}