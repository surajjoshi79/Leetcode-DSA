class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Integer,List<Character>> bucket=new HashMap<>();
        for(char key:map.keySet()){
            if(bucket.containsKey(map.get(key))){
                bucket.get(map.get(key)).add(key);
            }else{
                List<Character> list=new ArrayList<>();
                list.add(key);
                bucket.put(map.get(key),list);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length();i>0;i--){
            if(bucket.containsKey(i)){
                for(char c:bucket.get(i)){
                    int n=i;
                    while(n>0){
                        sb.append(Character.toString(c));
                        n--;
                    }
                }
            }
        }
        return sb.toString();
    }
}