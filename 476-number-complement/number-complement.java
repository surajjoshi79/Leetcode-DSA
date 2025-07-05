class Solution {
    public int findComplement(int num) {
        int count=Integer.toBinaryString(num).length();
        int mask=(1 << count) - 1;
        return mask^num;
    }
}