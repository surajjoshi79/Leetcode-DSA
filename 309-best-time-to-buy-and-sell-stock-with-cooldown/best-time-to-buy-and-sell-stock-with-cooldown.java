class Solution {
    public int maxProfit(int[] prices) {
        Map<String,Integer> map=new HashMap<>();
        return helper(prices,0,true,map);
    }
    int helper(int[] prices,int index,boolean buying,Map<String,Integer> map){
        if(index>=prices.length){
            return 0;
        }
        String key=index+"-"+buying;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int buy=0,sell=0;
        int cooldown=helper(prices,index+1,buying,map);
        if(buying){
            buy=helper(prices,index+1,!buying,map) - prices[index];
        }
        else{
            sell=helper(prices,index+2,!buying,map) + prices[index];
        }
        map.put(key,Math.max(cooldown,Math.max(buy,sell)));
        return map.get(key);
    }
}