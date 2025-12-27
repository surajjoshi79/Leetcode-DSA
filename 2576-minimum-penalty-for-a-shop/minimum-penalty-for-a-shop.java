class Solution {
    public int bestClosingTime(String customers) {
        int curPenalty=0,closing=0;
        for(char c:customers.toCharArray()){
            if(c=='Y'){
                curPenalty++;
            }
        }
        int minPenalty=curPenalty;
        for(int i=1;i<=customers.length();i++){
            if(customers.charAt(i-1)=='Y'){
                curPenalty--;
            }else{
                curPenalty++;
            }
            if(curPenalty<minPenalty){
                minPenalty=curPenalty;
                closing=i;
            }
        }
        return closing;
    }
}