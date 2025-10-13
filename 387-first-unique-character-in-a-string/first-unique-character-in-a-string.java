class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        int i=0;
        for(char c:s.toCharArray()){
            if(!set.contains(c)&&map.containsKey(c)){
                map.remove(c);
                set.add(c);
            }
            else if(!set.contains(c)&&!map.containsKey(c)){
                map.put(c,i);   
            }
            i++;
        }
        for(i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}