class Solution {
    public int maxProduct(String[] words) {
        int[] values=new int[words.length];
        int index=0;
        for(String word:words){
            for(char c:word.toCharArray()){
                values[index] |=1<<(c-'a');
            }
            index++;
        }
        int max=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if((values[i]&values[j])==0){
                    max=Math.max(max,words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }
    boolean commonLetter(String str1,String str2){
        if(str1.equals(str2)){
            return true;
        }
        for(char c:str2.toCharArray()){
            if(str1.contains(Character.toString(c))){
                return true;
            }
        }
        return false;
    }
}