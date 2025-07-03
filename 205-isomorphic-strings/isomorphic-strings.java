class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        /*Map<Character,Character> sMap=new HashMap<>();
        Map<Character,Character> tMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                sMap.put(s.charAt(i),t.charAt(i));
            }
            if(tMap.containsKey(t.charAt(i))){
                if(tMap.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }
            else{
                tMap.put(t.charAt(i),s.charAt(i));
            }
        }*/
        Map<Character,Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(t.charAt(i)) && !map.containsKey(s.charAt(i))){
                return false;
            }
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }
}