class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0,cur=0,total=0;
        for(String row:bank){
            int count=0;
            for(char c:row.toCharArray()){
                if(c=='1'){
                    count++;
                }
            }
            if(prev==0){
                prev=count;
            }else{
                cur=count;
            }
            if(cur>0){
                total+=prev*cur;
                prev=cur;
                cur=0;
            }
        }
        return total;
    }
}