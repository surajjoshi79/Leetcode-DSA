class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            if(map.containsKey(new String(c))){
                map.get(new String(c)).add(s);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(new String(c),list);
            }
        }
        List<List<String>> bigList=new ArrayList<>(map.values());
        return bigList;
    }
}