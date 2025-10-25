class Solution {
    public int totalMoney(int n) {
        int a=1,monday=1,sum=0;
        for(int i=0;i<n;i++){
            if(i!=0 && i%7==0){
                monday++;
                a=monday;
            }
            sum+=a;
            a++;
        }
        return sum;
    }
}