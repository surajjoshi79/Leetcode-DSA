class Solution {
    public double averageWaitingTime(int[][] customers) {
        double wt=0,tt=customers[0][0];
        for(int[] customer:customers){
            if(tt>customer[0]){
                tt+=customer[1];
            }else{
                tt=(double)customer[0]+customer[1];
            }
            wt+=(tt-customer[0]);
        }
        return wt/customers.length;
    }
}