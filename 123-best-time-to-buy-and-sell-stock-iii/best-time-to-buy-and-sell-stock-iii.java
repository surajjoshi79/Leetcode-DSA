class Solution {
    public int maxProfit(int[] prices) {
        Map<String,Integer> map=new HashMap<>();
        return helper(prices,0,true,map,0);
    }
    int helper(int[] prices,int i,boolean buying,Map<String,Integer> map,int transaction){
        if(i>=prices.length || transaction==2){
            return 0;
        }
        String key=i+"-"+transaction+"-"+buying;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int buy=0,sell=0;
        int skip=helper(prices,i+1,buying,map,transaction);
        if(buying){
            buy=helper(prices,i+1,!buying,map,transaction)-prices[i];
        }
        else{
            sell=helper(prices,i+1,!buying,map,transaction+1)+prices[i];
        }
        map.put(key,Math.max(skip,Math.max(buy,sell)));
        return map.get(key);
    }
}