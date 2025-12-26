class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long totalHappiness=0;
        int diff=0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1; i>=0 && k>0 && happiness[i]-diff>0; i--,k--,diff++){
            totalHappiness+=happiness[i]-diff;
        }
        return totalHappiness;
    }
}