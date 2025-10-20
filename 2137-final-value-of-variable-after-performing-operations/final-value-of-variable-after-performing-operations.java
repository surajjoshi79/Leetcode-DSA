class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String operation:operations){
            if(operation.substring(0,1).equals("-") || operation.substring(2).equals("-")){
                x-=1;
            }
            else{
                x+=1;
            }
        }
        return x;
    }
}