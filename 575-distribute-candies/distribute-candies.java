class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        int n=candyType.length;
        for(int candy:candyType){
            set.add(candy);
        }
        if(set.size()>=(n/2)){
            return n/2;
        }
        return set.size();
    }
}