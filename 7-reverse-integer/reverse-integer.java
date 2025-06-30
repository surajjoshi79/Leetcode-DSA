class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            int e=x%10;
            rev=(rev*10)+e;
            x=x/10;
        }
        if(rev<Integer.MIN_VALUE||rev>Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
    }
}