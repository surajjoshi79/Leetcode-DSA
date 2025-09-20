class Solution {
    public int maxProfit(int[] prices, int fee) {
        Map<String,Integer> map=new HashMap<>();
        return helper(prices,fee,0,true,map);
    }
    int helper(int[] prices,int fee,int i,boolean buying,Map<String,Integer> map){
        if(i>=prices.length){
            return 0;
        }
        String key=i+"-"+buying;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int buy=0,sell=0;
        int skip=helper(prices,fee,i+1,buying,map);
        if(buying){
            buy=helper(prices,fee,i+1,!buying,map)-prices[i];
        }else{
            sell=helper(prices,fee,i+1,!buying,map)+prices[i]-fee;
        }
        map.put(key,Math.max(skip,Math.max(buy,sell)));
        return map.get(key);
    }
}