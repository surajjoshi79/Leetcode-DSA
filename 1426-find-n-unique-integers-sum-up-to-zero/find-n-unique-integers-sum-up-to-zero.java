class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int i=0-(n/2);
        int size=0;
        if(n%2!=0){
            while(size<n){
                ans[size]=i;
                size++;
                i++;
            }
            return ans;
        }
        while(size<n){
            if(i==0){
                i++;
            }
            ans[size]=i;
            size++;
            i++;
        }
        return ans;
    }
}