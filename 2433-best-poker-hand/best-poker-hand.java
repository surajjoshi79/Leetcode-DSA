class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int count=0,max=0;
        for(int i=0;i<4;i++){
            if(suits[i]==suits[i+1]){
                count++;
            }
        }
        if(count==4){
            return "Flush";
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int rank:ranks){
            map.put(rank,map.getOrDefault(rank,0)+1);
        }
        for(int value:map.values()){
            max=Math.max(max,value);
        }
        if(max>2){
            return "Three of a Kind";
        }
        else if(max==2){
            return "Pair";
        }
        return "High Card";
    }
}