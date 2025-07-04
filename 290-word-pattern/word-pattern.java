class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str="";
        String[] word=s.split(" ");
        if(word.length!=pattern.length()){
            return false;
        }
        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            if(set.contains(word[i]) && !map.containsKey(pattern.charAt(i))){
                return false;
            }
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(word[i])){
                    return false;
                }
            }else{
                set.add(word[i]);
                map.put(pattern.charAt(i),word[i]);
            }
        }
        return true;
    }
}