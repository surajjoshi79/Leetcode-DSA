class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int lucky=-1;
        for(int i:map.keySet()){
            if(map.get(i)==i){
                lucky=i;
            }
        }
        return lucky;
    }
}