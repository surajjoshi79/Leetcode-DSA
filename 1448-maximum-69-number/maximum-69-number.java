class Solution {
    public int maximum69Number (int num) {
        int dup=num;
        int digits=0;
        while(dup>0){
            digits++;
            dup/=10;
        }
        int ans=0;
        while(digits>0){
            if(num/(int)Math.pow(10,digits-1)==6){
                ans+=9*(int)Math.pow(10,digits-1)+num%(int)Math.pow(10,digits-1);
                break;
            }
            ans+=9*(int)Math.pow(10,digits-1);
            num%=(int)Math.pow(10,digits-1);
            digits--;
        }
        return ans;
    }
}