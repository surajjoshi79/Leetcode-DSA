class Solution {
    public String intToRoman(int num) {
        String[] thousands={"","M","MM","MMM"};
        String[] hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] ones={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String res=thousands[num/1000]+hundreds[(num%1000)/100]+tens[((num%1000)%100)/10]+ones[((num%1000)%100)%10];
        return res;
    }
}