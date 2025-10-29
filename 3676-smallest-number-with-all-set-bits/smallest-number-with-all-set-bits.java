class Solution {
    public int smallestNumber(int n) {
        int power=1;
        while(n>=Math.pow(2,power)){
            power++;
        }
        return (int)Math.pow(2,power)-1;
    }
}