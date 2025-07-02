class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> rnMap=new HashMap<>();
        Map<Character,Integer> mMap=new HashMap<>();
        for(char a:ransomNote.toCharArray()){
            if(rnMap.containsKey(a)){
                rnMap.replace(a,rnMap.get(a)+1);
            }
            else{
                rnMap.put(a,1);
            }
        }
        for(char a:magazine.toCharArray()){
            if(mMap.containsKey(a)){
                mMap.replace(a,mMap.get(a)+1);
            }
            else{
                mMap.put(a,1);
            }
        }
        for(char a:ransomNote.toCharArray()){
            if(!mMap.containsKey(a)){
                return false;
            }
            if(rnMap.get(a)>mMap.get(a)){
                return false;
            }
        }
        return true;
    }
}