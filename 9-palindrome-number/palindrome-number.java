class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int a=x;
        while(a>0){
            int rem=a%10;
            rev=(rev*10)+rem;
            a=a/10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}