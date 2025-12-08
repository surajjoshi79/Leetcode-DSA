class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int a=1;a<=n;a++){
            for(int b=1;b<=n;b++){
                int low=1,high=n;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(mid*mid==a*a+b*b){
                        count++;
                        break;
                    }else if(mid*mid<a*a+b*b){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
            }
        }
        return count;
    }
}