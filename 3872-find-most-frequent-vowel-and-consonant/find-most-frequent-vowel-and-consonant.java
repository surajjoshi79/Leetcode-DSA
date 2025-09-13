class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowel=new HashMap<>();
        Map<Character,Integer> consonant=new HashMap<>();
        for(char c:s.toCharArray()){
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'){
                vowel.put(c,vowel.getOrDefault(c,0)+1);
            }else{
                consonant.put(c,consonant.getOrDefault(c,0)+1);
            }
        }
        int maxVowel=0,maxCons=0;
        for(int value:vowel.values()){
            maxVowel=Math.max(maxVowel,value);
        }
        for(int value:consonant.values()){
            maxCons=Math.max(maxCons,value);
        }
        return maxCons+maxVowel;
    }
}