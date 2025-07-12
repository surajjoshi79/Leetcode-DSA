class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]==10 || bills[0]==20){
            return false;
        }
        int change5=0;
        int change10=0;
        for(int bill:bills){
            if(bill==5){
                change5++;
            }
            else if(bill==10){
                if(change5==0){
                    return false;
                }
                else{
                    change5--;
                    change10++;
                }
            }
            else{
                if(change10>=1 && change5>=1){
                    change5--;
                    change10--;
                }
                else if(change5>=3){
                    change5-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}