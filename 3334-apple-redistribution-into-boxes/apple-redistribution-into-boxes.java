class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int totalApple=0;
        for(int a:apple){
            totalApple+=a;
        }
        int count=0;
        for(int i=capacity.length-1;i>=0 && totalApple>0;i--){
            totalApple-=capacity[i];
            count++;
        }
        return count;
    }
}