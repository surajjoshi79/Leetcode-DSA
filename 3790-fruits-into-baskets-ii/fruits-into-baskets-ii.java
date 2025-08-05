class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        boolean[] filled=new boolean[baskets.length];
        for(int fruit:fruits){
            for(int i=0;i<baskets.length;i++){
                if(baskets[i]>=fruit && !filled[i]){
                    filled[i]=true;
                    count++;
                    break;
                }
            }
        }
        return fruits.length-count;
    }
}