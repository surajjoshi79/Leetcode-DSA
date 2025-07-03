class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1 || n==2){
            return 0;
        }
        int count=0;
        boolean[] primes=new boolean[n];
        for(int i=2;i<n;i++){
            primes[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(primes[i]){
                for(int j=i*i;j<n;j+=i){
                    primes[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }
}