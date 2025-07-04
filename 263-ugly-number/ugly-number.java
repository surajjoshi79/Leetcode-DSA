class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        /*for(int i=2;i<=n;i++){
            if(i!=2 && i!=3 && i!=5 && n%i==0 && isPrime(i)){
                return false;
            }
        }
        return true;*/
        for (final int prime : new int[] {2, 3, 5})
            while (n % prime == 0)
            n /= prime;

        return n == 1;
    }
    /*boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }*/
}